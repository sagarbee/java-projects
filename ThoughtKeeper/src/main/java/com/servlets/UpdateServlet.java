package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Thought;
import com.helper.FactoryProvider;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int thoughtId = Integer.parseInt(request.getParameter("thoughtId").trim());
			Session session = FactoryProvider.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			Thought thought = session.get(Thought.class,thoughtId);
			thought.setTitle(title);
			thought.setContent(content);
			thought.setAddedDate(new Date());
			
			transaction.commit();
			session.close();
			response.sendRedirect("all_thoughts.jsp");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
