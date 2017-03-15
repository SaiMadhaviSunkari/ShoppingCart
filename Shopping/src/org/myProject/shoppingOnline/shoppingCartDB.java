package org.myProject.shoppingOnline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import javax.servlet.http.HttpSession;

public class shoppingCartDB {
	private Collection Items;
	private void init(HttpSession session)
	{
		Items=new ArrayList();
		Random r=new Random();
		Items.add(new shoppingCartItem(r.nextInt(),"pen",1,0));
		Items.add(new shoppingCartItem(r.nextInt(),"book",2,0));
		Items.add(new shoppingCartItem(r.nextInt(),"greeting card",5,0));
		Items.add(new shoppingCartItem(r.nextInt(),"candy",10,0));
		Items.add(new shoppingCartItem(r.nextInt(),"rose",10,0));
		Items.add(new shoppingCartItem(r.nextInt(),"novel",30,0));
		//tie or set udb values to HTTPSession attribute "users" 
	session.setAttribute("item", Items);
	}

	private void loadData(HttpSession session)
	{
		//accesing the db values through HTTPSession attribute-"users" 
		Items=(Collection)session.getAttribute("item");
		if(Items==null)
			init(session);
	}
	  public Collection getAllItems(HttpSession session) {
	        
	        loadData(session);
	        return Items;

	    }
}
