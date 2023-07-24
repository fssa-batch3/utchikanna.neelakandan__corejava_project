package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserRegisterTest {

	@Test
	public void checkUserRegistration() {
		UserManager userManager = new UserManager();
		
		User user = new User(2, "Alice", "alice@gmail.com");

		try {
		
			userManager.register(user);
			User duplicateUser = new User(3, "Jane", "john@example.com");
			userManager.register(duplicateUser);
			assertEquals("alice@gmail.com",user.emailId);
			System.out.println("Registration successfully completed...");
		} catch (UserAlreadyExistsException e) {
			System.out.println("Registration failed");
			System.out.println("Error: " + e.getMessage());
		}
	}

}