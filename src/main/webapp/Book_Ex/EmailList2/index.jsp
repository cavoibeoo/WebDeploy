<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Murach's Java Servlets and JSP</title>
  <link rel="stylesheet" href="../../css/main.css" type="text/css">
</head>

<body>
  <div class="Outside">
    <div class="Outside-emailist">
      <header>
        <object data="../../Animation/cavoibeoo.html"></object>
        <h1 class="title">Join our email list</h1>
        <p class="header-text">To join our email list, er your name and email address below.</p>
      </header>

      <section>
        <c:if test="${message != null}">
          <p class="special-text"><i>${message}</i></p>
        </c:if>
        <form action="emailList" method="post" class="form-survey">
          <input type="hidden" name="action" value="add">

          <script>
            var tmp;
          </script>
          <div class="input-box" >
            <input type="email" name="email" value="${user.email}"><br>
            <label>Email</label>
            <span class="bar"></span>
          </div>

          <div class="input-box">
            <input type="text" name="firstName" value="${user.firstName}"><br>
            <label>First Name</label>
            <span class="bar"></span>
          </div>

          <div class="input-box">
            <input type="text" name="lastName" value="${user.lastName}"><br>
            <label >Last Name</label>
            <span class="bar"></span>
          </div>

          <label>&nbsp;</label>

          <br>
          <div class="submit-button-area">
          <input type="submit" value="Join Now" class="submit">
        </div>

        </form>

        <p>&copy; Copyright ${currentYear} Mike Murach &amp; Associates</p>
      </section>
    </div>


  </div>
</body>
</html>