package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class EmployeesTest {

	
	@Test
	public void checkRepeatedKey() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = scanner.nextLine();

	
		input = input.trim().toLowerCase();

		// Split the input into individual names using comma as the separator
		String[] names = input.split(",");

		// Create a HashMap to store the count of each name
		HashMap<String, Integer> nameCount = new HashMap<>();

		// Count the occurrences of each name
		for (String name : names) {
			nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
		}
		
		System.out.println(nameCount); 

		// Print the name and its count
		nameCount.forEach((key, value) -> System.out.println(key + ": " + value));
		
		scanner.close();
	}
}