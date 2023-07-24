package day05.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest {

	@Test
	public void checkInitialAxisBankBalance() {
		double balance = 50000;
		Account axisAccount = new Account("AX001", balance);
		double initialBalance = axisAccount.getBalance();

		if (initialBalance == balance) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		assertEquals(initialBalance, balance);

	}

	
	


	@Test
	public void checkDepositAxisBank() {
		double balance = 4500;
		Account axisAccount = new Account("AX001", balance);
		double initialBalance = axisAccount.getBalance();

		if (initialBalance == balance) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		assertEquals(initialBalance, balance);

	}

	@Test
	public void checkInitialICICIBankBalance() {
		double balance = 2100;
		Account iciciAccount = new Account("AX001", balance);
		double initialBalance = iciciAccount.getBalance();

		if (initialBalance == balance) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		assertEquals(initialBalance, balance);

	}

}
