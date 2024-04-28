package servlet_jsp_library_management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteController extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		LibraryCRUD crud = new LibraryCRUD();

		try {
			int result = crud.deleteBook(id);
			if(result!=0)
			{
				req.setAttribute("message", "The Book is deleted");
				req.setAttribute("list", crud.displayBooks());
				RequestDispatcher dispatcher = req.getRequestDispatcher("sucess.jsp");
				dispatcher.forward(req, resp);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
