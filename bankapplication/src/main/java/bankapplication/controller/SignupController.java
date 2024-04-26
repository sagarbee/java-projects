package bankapplication.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bankapplication.dao.UserDao;
import bankapplication.dto.User;
@WebServlet("/signup")
public class SignupController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("");
		String address=req.getParameter("");
		int age =Integer.parseInt(req.getParameter(""));
		String email=req.getParameter("");;
		String password=req.getParameter("");;
		
		User user = new User();
		user.setName(name);
		user.setAddress(address);
		user.setAge(age);
		user.setEmail(email);
		user.setPassword(password);
		
		UserDao userDao = new UserDao();
		
		if(userDao.saveUser(user))
		{
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.forward(req, resp);
		}
	}
}
