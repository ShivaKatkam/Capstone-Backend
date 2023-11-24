package com.infinite.Project.pojo;

public class LoginMessage {
	
	//Reference class for passing the message to front end
	
	String message;
	Boolean status;
	
	//constructors for creating object
	
	public LoginMessage(String message, boolean b) {
		// super();
		this.message = message;
		this.status = status;
	}
	
	//setters and getters
	
	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
 
	public Boolean getStatus() {
		return status;
	}
 
	public void setStatus(Boolean status) {
		this.status = status;
	}
 
}
