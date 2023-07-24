package day07.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DuplicateTaskTest {

	@Test
	public void checkArrayListTaskNameData() {
		DuplicateTask one = new DuplicateTask("Swimming", 1, "2023-07-22");
		System.out.println("The task name is : Finish report");
		if (one.getName().equals(one.name)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getName(), one.name);
	}

	@Test
	public void checkArrayListTaskDeadlineData() {
		DuplicateTask one = new DuplicateTask("Swimming", 1, "2023-07-22");
		System.out.println("The task deadline is 2023-07-22");

		if (one.getDeadline().equals(one.deadline)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getDeadline(), one.deadline);
	}

	@Test
	public void checkArrayListTaskIdData() {
		DuplicateTask one = new DuplicateTask("Swimming", 1, "2023-07-22");
		System.out.println("The task ID is " + 1);
		if (one.getId() == one.id) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getId(), one.id);
	}

}
