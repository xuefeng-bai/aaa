package com.example.demosink;

public class DatabaseInfo {
	@Override
	
	public String toString() {
		return "DatabaseInfo [username=" + username + ", password=" + password + ", sid=" + sid + ", host=" + host
				+ "]";
	}

	private String username;
	private String password;
	private String sid;
	private String host;
	
	
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

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
}
