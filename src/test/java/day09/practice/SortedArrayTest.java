package day09.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SortedArrayTest {

	@Test
	public void testSortTasksByPriority() {
		
		List<Task> array = new ArrayList<>();
		Task task1 = new Task(1,"Gardening","2015-06-05");
		Task task2 = new Task(2,"Swimming","2023-07-22");
		Task task3 = new Task(2,"Swimming","2023-08-22");
		Task task4 = new Task(3,"Playing with pets","2033-09-30");
		array.add(task1);
		array.add(task2);
		array.add(task3);
		array.add(task4);
		
		List<Task> sortedArray = new ArrayList<>();
		Task task5 = new Task(1,"Swimming","2023-07-22");
		Task task6 = new Task(2,"Swimming","2023-08-22");
		Task task7 = new Task(3,"Gardening","2015-06-05");
		Task task8 = new Task(2,"Playing with pets","2033-09-30");
		sortedArray.add(task5);
		sortedArray.add(task6);
		sortedArray.add(task7);
		sortedArray.add(task8);
		System.out.println(array);
	
		
		Collections.sort(sortedArray);
		System.out.println(sortedArray);
		
		assertEquals(array, sortedArray);
	}

	

}
