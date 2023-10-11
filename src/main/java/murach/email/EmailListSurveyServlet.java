package murach.email;

import murach.business.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Book_Ex/MurachSurvey/emailListSurvey", name = "EmailListSurveyServlet")
public class EmailListSurveyServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/Book_Ex/MurachSurvey/index.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/Book_Ex/MurachSurvey/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String heardFrom = request.getParameter("heardFrom");
            String wantsUpdates = request.getParameter("wantsUpdates");
            String contactVia = request.getParameter("contactVia");
            System.out.println(dob);
            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, dob, heardFrom, wantsUpdates, contactVia);
            //UserDB.insert(user);
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/Book_Ex/MurachSurvey/thanks.jsp";   // the "thanks" page
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
