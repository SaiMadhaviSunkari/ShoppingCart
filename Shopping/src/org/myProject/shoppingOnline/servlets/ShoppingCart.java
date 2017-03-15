package org.myProject.shoppingOnline.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.myProject.shoppingOnline.UsersListDB;
import org.myProject.shoppingOnline.shoppingCartDB;

public class ShoppingCart extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get session of the request
        HttpSession session = request.getSession();
        shoppingCartDB shoppingc=new shoppingCartDB();
      //get all books from the database class
      		Collection collection = shoppingc.getAllItems(session);
      		
      		//set the returned collection in the request
      		request.setAttribute("items", collection);
      				
      		//get the request dispatcher
      		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/ShoppingCart.jsp");
      		
      		//forward to the jsp file to display the book list
      		dispatcher.forward(request, response);	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
 }
}
