package foodApp_controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import foodApp_dao.FoodOrderDao;
import foodApp_dao.MenuDao;
import foodApp_dao.UserDao;
import foodApp_dto.FoodOrder;
import foodApp_dto.Menu;
import foodApp_dto.User;

@WebServlet("/login")
public class LoginUserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		UserDao dao = new UserDao();
		User user = dao.getUserByEmail(email);
		FoodOrderDao foodOrderDao = new FoodOrderDao();

		MenuDao menuDao = new MenuDao();
		List<Menu> menus = menuDao.getAllMenus();

		if (user.getPassword().equals(password) && user.getRole().equals("manager")) {
			req.setAttribute("menus", menus);
			RequestDispatcher dispatcher = req.getRequestDispatcher("menu.jsp");
			dispatcher.forward(req, resp);
		} else if (user.getPassword().equals(password) && user.getRole().equals("customer")) {
			HttpSession session = req.getSession();
			session.setAttribute("id", user.getId());
			for (FoodOrder foodOrder : foodOrderDao.getFoodOrder()) {
				if (user.getId() == foodOrder.getUser().getId()) {
					req.setAttribute("foodorder", foodOrder);

				}
			}

			SaveUserController.user = user;
			req.setAttribute("menus", menus);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		} else if (user.getPassword().equals(password) && user.getRole().equals("staff")) {
			req.setAttribute("menus", menus);
			RequestDispatcher dispatcher = req.getRequestDispatcher("staff.jsp");
			dispatcher.forward(req, resp);
		} else {
			req.setAttribute("message", "Invalid Password");
			RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
