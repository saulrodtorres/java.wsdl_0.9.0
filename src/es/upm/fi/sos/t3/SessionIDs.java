package es.upm.fi.sos.t3;

import java.util.ArrayList;
import java.util.LinkedList;

import es.upm.fi.sos.t3.usermanagement.User;

public class SessionIDs {
	private static int counter= 1;
private User user;
private LinkedList<Integer> SessionNumberList = new LinkedList();
private LinkedList<String> SessionContextList = new LinkedList();


public SessionIDs(User u){
	this.user = u;
	this.SessionNumberList.add(counter);
	this.counter =counter + 3; 
}
public SessionIDs(User u, String c){
	this.user = u;
	this.SessionNumberList.add(counter);
	this.SessionContextList.add(c);
	this.counter =counter + 3; 
}
public void addSession(){
	//puede que esta sesión la tenga que devolver
	this.SessionNumberList.add(counter);
	this.counter =counter + 3;  
}
public void addSession(String c){
	//puede que esta sesión la tenga que devolver
	this.SessionNumberList.add(counter);
	this.SessionContextList.add(c);
	this.counter =counter + 3;  
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public LinkedList<Integer> getSessionNumberList() {
	return SessionNumberList;
}
public void setSessionNumberList(LinkedList<Integer> sessionNumberList) {
	SessionNumberList = sessionNumberList;
}

	
}
