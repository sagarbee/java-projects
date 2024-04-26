package bankapplication.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bankapplication.dao.UserDao;
import bankapplication.dto.User;

public class UpdateController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		UserDao dao = new UserDao();

		User user = dao.findUser(id);
		
		if(user!=null)
		{
			req.setAttribute("user", user);
            RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
            dispatcher.forward(req, resp);
        
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("");
		String address = req.getParameter("");
		int age = Integer.parseInt(req.getParameter(""));
		String email = req.getParameter("");
		;
		String password = req.getParameter("");
		;

		User user = new User();
		user.setName(name);
		user.setAddress(address);
		user.setAge(age);
		user.setEmail(email);
		user.setPassword(password);

		UserDao userDao = new UserDao();

		if (userDao.saveUser(user)) 
		{
			req.setAttribute("message", "Details updated successfully");
			RequestDispatcher dispatcher = req.getRequestDispatcher("sucess.html");
			dispatcher.forward(req, resp);
		}
	}
}
