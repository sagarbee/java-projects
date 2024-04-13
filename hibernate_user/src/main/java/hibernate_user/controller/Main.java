package hibernate_user.controller;

import java.util.Scanner;

import hibernate_user.dao.UserDao;
import hibernate_user.dto.User;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose option:\n1.Signin \n2.Log in");
		User user = new User();
		UserDao dao = new UserDao();

		switch (scanner.nextInt()) {
		case 1: {
			System.out.println("Enter id: ");
			user.setId(scanner.nextInt());
			System.out.println("Name: ");
			user.setName(scanner.next());
			System.out.println("Phone no: ");
			user.setPhone(scanner.nextLong());
			System.out.println("Email: ");
			user.setEmail(scanner.next());
			System.out.println("Password: ");
			user.setPassword(scanner.next());

			dao.userInsert(user);
		}
		case 2: {
			System.out.println("Enter email:");
			String email = scanner.next();
			System.out.println("Enter Password: ");
			String password = scanner.next();

			boolean login = false;

			User getUser = dao.getUser(email);

			if (getUser != null) {
				if (password.equals(getUser.getPassword())) {
					System.out.println("Login Succefull");
					login = true;
				} else {
					System.out.println("Login Failed");
				}
			} else {
				System.out.println("User does not found");
			}
			if (login) {
				System.out.println("\n1.Display Passwords\n2.Update Password");
				switch (scanner.nextInt()) {
				case 1: {
					dao.displayPassword(user.getId());
					user.getFacebook();
					user.getInstagram();
					user.getSnapchat();
					user.getX();
				}

				}
			}

		}

		}

	}
}
