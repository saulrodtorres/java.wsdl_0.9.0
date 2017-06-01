
/**
 * UserManagementWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.fi.sos.t3;

import java.util.HashMap;
import java.util.LinkedList;

import es.upm.fi.sos.t3.usermanagement.Response;
import es.upm.fi.sos.t3.usermanagement.User;
/**
 *  UserManagementWSSkeleton java skeleton for the axisService
 */


public class UserManagementWSSkeleton{


	private LinkedList<SessionIDs> registeredUsers = new LinkedList<SessionIDs>();
	private User userID = new User();

	public UserManagementWSSkeleton(){
		User root = new User();
		root.setName("root");
		root.setPwd("root");
		SessionIDs s = new SessionIDs(root);
		registeredUsers.add(s);
	}
	
	/**
	 * Auto generated method signature
	 * Ma
	 * @return  
	 */

	public void logout( )
	{
		//TODO : fill this with the necessary business logic

	}


	/**
	 * Auto generated method signature
	 * 
	 * @param user 
	 * @return response 
	 */
	private boolean permission (User u){
		boolean userCorrect = false;
		boolean pwdCorrect = false;
		String username = u.getName();
		String userpwd = u.getPwd();
		int i = 0;
		//el while tiene la ventaja de que una vez encontrado sale del bucle pero hay que tener cuidado de que haya dos usuarios .
		while(i<this.registeredUsers.size()){

			if (registeredUsers.get(i).getUser().getName().equals(username))
			{
				userCorrect = true;
				pwdCorrect = registeredUsers.get(i).getUser().getPwd().equals(userpwd);
			}
			i++;
		}
		return userCorrect && pwdCorrect;
	}

	public es.upm.fi.sos.t3.usermanagement.Response login
	(
			es.upm.fi.sos.t3.usermanagement.User user
			)
	{
		//TODO : fill this with the necessary business logic
		//throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#login");
		Response response = new Response();
		response.setResponse(permission(user));
		return response;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param user1 
	 * @return response2 
	 */

	public es.upm.fi.sos.t3.usermanagement.Response addUser
	(
			es.upm.fi.sos.t3.usermanagement.User user1
			)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#addUser");
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param passwordPair 
	 * @return response3 
	 */

	public es.upm.fi.sos.t3.usermanagement.Response changePassword
	(
			es.upm.fi.sos.t3.usermanagement.PasswordPair passwordPair
			)
	{
		//TODO : fill this with the necessary business logic
		//throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#changePassword");
		return new Response();
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param username 
	 * @return response4 
	 */

	public es.upm.fi.sos.t3.usermanagement.Response removeUser
	(
			es.upm.fi.sos.t3.usermanagement.Username username
			)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#removeUser");
	}

}
