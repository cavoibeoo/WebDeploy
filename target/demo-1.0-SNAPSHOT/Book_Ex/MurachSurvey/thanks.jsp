<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Murach's Java Servlets and JSP</title>
        <link rel="stylesheet" href="main.css" type="text/css"/>
    </head>


    <body>
        <div class="Outside">
            <h1>Thanks for joining our email list</h1>

            <p>Here is the information that you entered:</p>

            <label>Email:</label>
            <span>${user.email}</span><br>

            <label>First Name:</label>
            <span>${user.firstName}</span><br>

            <label>Last Name:</label>
            <span>${user.lastName}</span><br>

            <label>Date of birth</label>
            <span>${user.dob}</span><br>

            <label>How you know us: </label>
            <span>${user.heardFrom}</span><br>

            <label>Your choice: </label>
            <span>${user.wantsUpdates}</span><br>

            <label>Contact: </label>
            <span>${user.contactVia}</span>

            <p>To enter another email address, click on the Back
                button in your browser or the Return button shown
                below.</p>

            <form action="" method="get">
                <input type="hidden" name="action" value="join">
                <input type="button" value="Return!" onclick="history.back()">
            </form>
        </div>
    </body>
</html>
