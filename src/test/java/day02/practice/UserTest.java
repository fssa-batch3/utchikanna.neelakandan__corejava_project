package day02.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	public void checkUserName() {
		User user = new User();
		String name = "Utchikanna";
		user.setName(name);
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
		User user = new User();
		String email = "Utchikanna@gmail.com";
		user.setEmail(email);
		System.out.println("User Email ID is : " + email);

		if (user.getEmail().equals(email)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getEmail(), email);
	}
	
	@Test
	public void checkUserPassword() {
		User user = new User();
		String password = "Utchi@2003`";
		user.setPass(password);
		System.out.println("User password is : " + password);

		if (user.getPass().equals(password)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		assertEquals(user.getPass(), password);
	}
	
	
	

}