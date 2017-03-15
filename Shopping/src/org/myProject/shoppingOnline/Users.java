package org.myProject.shoppingOnline;

public class Users {
private long id=0;
private String username;
private String password;
private boolean available;

public Users(long id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isAvailable() {
    return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}


}
