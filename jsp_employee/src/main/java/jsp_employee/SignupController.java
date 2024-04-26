package jsp_employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class SignupController extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id =Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		long phone =Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String password = req.getParameter("password") ;
		String designation = req.getParameter("designation") ;
		double salary = Double.parseDouble(req.getParameter("salary"));
		
		Employee employee = new Employee(id, phone, salary, email, password, name, designation);
		EmployeeCRUD crud = new EmployeeCRUD();
		
		try {
			int result = crud.signupUser(employee);
			if(result!=0)
			{
				req.setAttribute("message", "Signup Sucessful \nPlease Login");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, res);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
