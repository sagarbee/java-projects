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

@WebServlet("/update")
public class UpdateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        EmployeeCRUD crud = new EmployeeCRUD();
        try {
            Employee employee = crud.getEmployeeById(id);
            if (employee != null) {
            	
            	HttpSession httpSession = req.getSession();
            	String value =(String) httpSession.getAttribute("key");
            			if(value!=null)
            			{
            				req.setAttribute("employee", employee);
                            RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
                            dispatcher.forward(req, resp);
            			}
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        long phone = Long.parseLong(req.getParameter("phone"));
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String designation = req.getParameter("designation");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee employee = new Employee(id, phone, salary, email, password, name, designation);
        EmployeeCRUD crud = new EmployeeCRUD();

        try {
            int result = crud.updateUSer(employee);
            if (result != 0) {
            	
//            	Using cookie to do Session tracking
            	Cookie[] cookies = req.getCookies();
            	String value="null";
            	for (Cookie cookie : cookies) {
					if(cookie.getName().equals("userID")) {
						value = cookie.getValue();
						break;
					}
				}
            	req.setAttribute("cookie", value);
            	
                req.setAttribute("message", "Employee details updated successfully");
                req.setAttribute("list", crud.displayEmployeeDetails());
                RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
                dispatcher.forward(req, res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
