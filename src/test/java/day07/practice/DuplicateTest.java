package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class DuplicateTest {

	@Test
	public void checkArrayValue() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(4);
		array.add(5);
		array.add(6);

		System.out.println("The duplicate array list : " + array);

		HashSet<Integer> secondArray = new HashSet<Integer>(array);

		System.out.println("The duplicate removed HashSet : " + secondArray);

	}

}
