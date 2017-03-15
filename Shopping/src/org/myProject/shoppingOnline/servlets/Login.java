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

public class Login extends HttpServlet{
	public Login()
	{
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get session of the request
        HttpSession session = request.getSession();
        UsersListDB Customer=new UsersListDB();
        
        String uname=request.getParameter("username");
        String pwd=request.getParameter("password");
      //get to know if user exists in the database class
      	boolean	check=Customer.isAvailable(session,uname,pwd);
        if(check==true)
        {
            shoppingCartDB shoppingc=new shoppingCartDB();
          //get all books from the database class
          		Collection collection1 = shoppingc.getAllItems(session);
          		
          		//set the returned collection in the request
          		request.setAttribute("items", collection1);
          				
        	//get the request dispatcher
    		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/ShoppingCart.jsp");
    		
    		//forward to the jsp file to display the shopping cart
    		dispatcher.forward(request, response);	
        	
        }
        else
        {
        	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/Error.jsp");
    		dispatcher.forward(request, response);
        }
        
        
	}
	public void init() throws ServletException {
		// Put your code here
	}
}
