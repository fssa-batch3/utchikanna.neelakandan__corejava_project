
package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class NameCounterTest {

	@Test
	public void checkDepartmentName() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the strings: ");

		String[] array = new String[number];

		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextLine();
		}

		HashMap<String, List<String>> department = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			String[] splitValue = array[i].split(",");
			String departName = splitValue[0].trim();
			String employeeName = splitValue[1].trim();

			if (department.containsKey(departName)) {
				List<String> employees = department.get(departName);
				employees.add(employeeName);
			} else {
				List<String> employees = new ArrayList<>();
				employees.add(employeeName);
				department.put(departName, employees);
			}
		}

		for (String departmentName : department.keySet()) {
			List<String> employees = department.get(departmentName);
			System.out.println(departmentName + ": " + employees);
		}

		scanner.close();
	}
}