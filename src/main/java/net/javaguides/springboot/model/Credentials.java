package net.javaguides.springboot.model;


public class Credentials {

	
	private String username;
	
	
	private String password;


	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
	}


	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Credentials() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
}
