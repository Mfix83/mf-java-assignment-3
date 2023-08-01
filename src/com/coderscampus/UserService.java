package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public List<User> loadDataFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String username = parts[0];
                    String password = parts[1];
                    String name = parts[2];
                    User user = new User(username, password, name);
                    users.add(user);
                }
            }
            return this.users;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean validateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                UserLoginApplication.setName(user.getName());
                return true;
            }
        }
        return false;
    }
}




//package com.coderscampus;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserService {
//    private List<User> users = new ArrayList<>();
//
//    public List<User> loadDataFromFile(String filename) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
//                if (parts.length == 3) {
//                    String username = parts[0];
//                    String password = parts[1];
//                    String name = parts[2];
//                    User user = new User(username, password, name);
//                    users.add(user);
//                }
//            }
//            System.out.println(users);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//       return this.users;
//    }
//
//	public boolean validateUser(String username, String password) {
//		
//		return false;
//	}
//
//
//		}

