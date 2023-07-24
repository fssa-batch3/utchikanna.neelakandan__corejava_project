package day10.practice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class EmailExceptionTest {
	
	@Test
	public void checkEmail() {
		
		Scanner scan = new Scanner(System.in);
		
		String email = scan.nextLine();
		System.out.println("Your given email id is "+ email);

		try {
			boolean isValid = EmailValidator.isValidEmail(email);
			System.out.println("Is the email valid? " + isValid);
            assetTrue(true, isValid);
		} catch (ValidateEmailException e) {
			System.out.println("Email is invalid !");
			System.out.println("Error: " + e.getMessage());
		} finally {
			scan.close();
		}
	}

	private void assetTrue(boolean b, boolean isValid) {
		// TODO Auto-generated method stub
		
	}

}