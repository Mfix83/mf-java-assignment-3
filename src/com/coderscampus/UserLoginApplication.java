package com.coderscampus;
import java.util.Scanner;

public class UserLoginApplication {
    private static String name;

	public static void main(String[] args) {
        UserService userService = new UserService();
        userService.loadDataFromFile("data.txt");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 5 && !loggedIn) {
            System.out.print("Enter your email: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (userService.validateUser(username, password)) {
                System.out.println("Welcome: " + name);
                loggedIn = true;
            } else {
                System.out.println("Invalid login, please try again");
                attempts++;
            }
        }

        if (attempts == 5 && !loggedIn) {
            System.out.println("Too many failed login attempts, you are now locked out.");
        }

        scanner.close();
    }
}

