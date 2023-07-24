package day10.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

class ValidateEmailException extends Exception {

	public ValidateEmailException(String msg) {
		super(msg);
	}

	public ValidateEmailException(Throwable te) {
		super(te);
	}

	public ValidateEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws ValidateEmailException {
		final String EMAIL_PATTERN = "^[a-z]+[a-z0-9._-]*@[a-z]+\\.[a-z]{2,}$";

		if (emailId == null) {
			throw new ValidateEmailException("Email ID is null");
		} else if (emailId.isEmpty()) {
			throw new ValidateEmailException("Email ID is null");
		} else if (!Pattern.matches(EMAIL_PATTERN, emailId)) {
			throw new ValidateEmailException("Invalid email format");
		}

		return true;
	}

}

public class EmailException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an email address: ");
		String email = scan.nextLine();

		try {
			boolean isValid = EmailValidator.isValidEmail(email);
			System.out.println("Is the email valid? " + isValid);
		} catch (ValidateEmailException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scan.close();
		}
	}
}