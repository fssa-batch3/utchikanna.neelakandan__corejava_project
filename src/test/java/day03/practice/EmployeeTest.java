package day03.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	@Test
	public void checkEmployeeId() {

		EmId one = new EmId("130", "Susikumar");
		String id = "130";
		System.out.println("Employee ID is : "+ id);
		
		if(one.getId() == id) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		assertEquals(one.getId(), id);

	}
	
	@Test
	public void checkEmployeeName() {

		EmId one = new EmId("130", "Utchikanna");
		String name = "Utchikanna";
		System.out.println("Employee Name is : "+ name);
		
		if(one.getName().equals(name)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		assertEquals(one.getName(), name);

	}

}