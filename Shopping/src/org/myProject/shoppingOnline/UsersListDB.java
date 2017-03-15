package org.myProject.shoppingOnline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

import javax.servlet.http.HttpSession;

public class UsersListDB {
private Collection udb;
private Users element;
private String val,val1;

private void init(HttpSession session)
{
	udb=new ArrayList();
	Random r=new Random();
	udb.add(new Users(r.nextLong(),"sai","sai"));
	udb.add(new Users(r.nextLong(),"madhavi","madhavi"));
	udb.add(new Users(r.nextLong(),"vidya","vidya"));
	udb.add(new Users(r.nextLong(),"udaya","udaya"));
	udb.add(new Users(r.nextLong(),"sruthi","sruthi"));
	udb.add(new Users(r.nextLong(),"melody","melody"));
	//tie or set udb values to HTTPSession attribute "users" 
session.setAttribute("users", udb);
}

private void loadData(HttpSession session)
{
	//accesing the db values through HTTPSession attribute-"users" 
	udb=(Collection)session.getAttribute("users");
	if(udb==null)
		init(session);
}

public boolean isAvailable(HttpSession session,String uname,String pwd)
{
	loadData(session);
	for (Iterator iter = udb.iterator(); iter.hasNext();) {
		element = (Users) iter.next();
 		 val=element.getUsername();
 		 val1=element.getPassword();
     if((val.equals(uname))&&(val1.equals(pwd)))
     {
    	 return true;
     }
    	 
	}
	return false;
}

}