package jsp_employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginController extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String email =req.getParameter("email");
		String password = req.getParameter("password") ;
		
		EmployeeCRUD crud = new EmployeeCRUD();
		String dbPassword;
		try {
			dbPassword = crud.getPassword(email);
			if (dbPassword!= null) {
				
				if(dbPassword.equals(password))
				{
					Cookie cookie = new Cookie("userID", email);
					res.addCookie(cookie);
					
					Cookie cookie1 = new Cookie("userID1", "Vibhas");
					res.addCookie(cookie1);
					
					Cookie cookie2 = new Cookie("userID2", "Meshram");
					res.addCookie(cookie2);
					
					Cookie cookie3 = new Cookie("userID3", "7887905972");
					res.addCookie(cookie3);
					
//					HttpSession 
					HttpSession httpSession =req.getSession();
					httpSession.setAttribute("key", email);
					
					req.setAttribute("list", crud.displayEmployeeDetails());
					RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
					dispatcher.forward(req, res);
				}
				else {
					req.setAttribute("message", "Invalid Password, Please Try again");
					RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
					dispatcher.forward(req, res);
				}
				
			} else {
				req.setAttribute("message", "Employee is not Registered, please Register first");
				RequestDispatcher dispatcher = req.getRequestDispatcher("signup.jsp");
				dispatcher.include(req, res);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

