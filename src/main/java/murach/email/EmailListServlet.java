package murach.email;
import java.io.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import murach.business.User;
//import murach.data.UserDB;

@WebServlet (urlPatterns = "/Book_Ex/EmailList2/emailList", name = "EmailListServlet")
public class EmailListServlet extends HttpServlet  {
    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/Book_Ex/EmailList2/thanks.jsp";
    
        // initialize the current year that's used in the copyright notice
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
        request.setAttribute("currentYear", currentYear);
    
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
    
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/Book_Ex/EmailList2/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            
    
            // store data in User object
            User user = new User(firstName, lastName, email);
    
            // validate the parameters
            String message;
            if (firstName == null || lastName == null || email == null ||
                        firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "Please fill out all three text boxes.";
                url = "/Book_Ex/EmailList2/index.jsp";
            }
            else {
                message = null;
                url = "/Book_Ex/EmailList2/thanks.jsp";
                //UserDB.insert(user);
            }
            
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
