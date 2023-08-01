package com.coderscampus;

public class User {
    private String username;
    private String password;
    private String name;

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}


//package com.coderscampus;
//
//public class User {
//	
//	@Override
//	public String toString() {
//		return "User [username=" + username + ", password=" + password + ", name=" + name + "]";
//	}
//
//	private String username;
//	private String password;
//	private String name;
//
//	public User(String username, String password, String name) {
//		
//	this.username = username;
//    this.password = password;
//    this.name = name;
//		
//	}
//	public String getUsername () {
//		return username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	}

