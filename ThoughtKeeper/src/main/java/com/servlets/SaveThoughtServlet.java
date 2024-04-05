package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Thought;
import com.helper.FactoryProvider;

public class SaveThoughtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SaveThoughtServlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Thought thought = new Thought(title,content,new Date());
//			System.out.println(thought.getId());
			
			Session session = FactoryProvider.getFactory().openSession();			
			
			Transaction transaction = session.beginTransaction();
			
			session.save(thought);
			
			transaction.commit();
			
			session.close();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Thought save successfully</h1>");
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
