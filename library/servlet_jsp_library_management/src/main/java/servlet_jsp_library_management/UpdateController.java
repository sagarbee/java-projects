package servlet_jsp_library_management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/update")
public class UpdateController extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
        int id = Integer.parseInt(req.getParameter("id"));
        
        LibraryCRUD crud = new LibraryCRUD();
        
        try{
            Book book = crud.getBookById(id);
            if (book != null) {
                req.setAttribute("book", book);
                RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
                dispatcher.forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String author = req.getParameter("author");
        String genre = req.getParameter("genre");
        double price = Double.parseDouble(req.getParameter("price"));
        
        Book book = new Book(id, name, genre, author, price);
        LibraryCRUD crud = new LibraryCRUD();
       

        try {
            int result = crud.updateBook(book);
            if (result != 0) {
                req.setAttribute("message", "Employee details updated successfully");
                req.setAttribute("list", crud.displayBooks());
                RequestDispatcher dispatcher = req.getRequestDispatcher("sucess.jsp");
                dispatcher.forward(req, res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
