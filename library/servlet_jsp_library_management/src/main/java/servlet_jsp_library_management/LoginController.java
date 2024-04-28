package servlet_jsp_library_management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password") ;
		
		LibraryCRUD crud = new LibraryCRUD();
		
		String dbPassword;
		try {
			dbPassword = crud.getPassword(email);
			if (dbPassword!= null) {
				
				if(dbPassword.equals(password))
				{
					req.setAttribute("list", crud.displayBooks());
					RequestDispatcher dispatcher = req.getRequestDispatcher("sucess.jsp");
					dispatcher.forward(req, res);
				}
				else {
					req.setAttribute("message", "Invalid Password, Please Try again");
					RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
					dispatcher.forward(req, res);
				}
				
			} else {
				req.setAttribute("message", "User is not Registered, please Register first");
				RequestDispatcher dispatcher = req.getRequestDispatcher("signup.jsp");
				dispatcher.include(req, res);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

