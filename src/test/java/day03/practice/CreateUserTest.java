package day03.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CreateUserTest {

	@Test
	public void checkUserName() {
		CreateUser user = new CreateUser("Utchikanna", "Utchikanna@gmail.com", "kanna@123");
		String name = "Utchikanna";
		System.out.println("User name is : " + name);

		if (user.getName().equals(name)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getName(), name);
	}

	@Test
	public void checkEmailId() {
		CreateUser user = new CreateUser("Utchikanna", "Utchikanna@gmail.com", "kanna@123");

		String email = "Utchikanna@gmail.com";

		System.out.println("User Email ID is : " + email);

		if (user.getEmailId().equals(email)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getEmailId(), email);
	}

	@Test
	public void checkUserPassword() {
		CreateUser user = new CreateUser("Utchikanna", "Utchikanna@gmail.com", "kanna@123");

		String password = "kanna@123";
		System.out.println("User password is : " + password);

		if (user.getPass().equals(password)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getPass(), password);
	}

	

}
