package net.javaguides.springboot.model;

public class JwtResponse {
	
	String token;
	
	
	
	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}



	@Override
	public String toString() {
		return "JwtResponse [token=" + token + "]";
	}



	public JwtResponse(String token) {
		super();
		this.token = token;
	}



	public JwtResponse() {
		// TODO Auto-generated constructor stub
	}

}
