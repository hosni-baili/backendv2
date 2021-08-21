package com.sip.ams.entities;

public class Auth {
	private String message;

	public Auth(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		//return String.format("Bienvenue dans backend [message=%s]", message);
		return "Basic Auth" + this.message;
	}
}
