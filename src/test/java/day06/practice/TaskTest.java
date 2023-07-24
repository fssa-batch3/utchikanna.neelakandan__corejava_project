package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTest {

	@Test
	public void checkArrayListTaskNameData() {
		Task one = new Task("Finish report",1);
		System.out.println("The task name is : Finish report");
		if (one.getTaskName().equals(one.taskName)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getTaskName(), one.taskName);
	}

	

	@Test
	public void checkArrayListTaskIdData() {
		Task one = new Task("Finish report",2);
		System.out.println("The task ID is " + 1);
		if (one.getPriority() == one.priority) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getPriority(), one.priority);
	}

}