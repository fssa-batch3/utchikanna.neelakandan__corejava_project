package day06.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class RemoveDuplicateTest {

	@Test
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		System.out.println("ArrayList with duplicates: " + cityList);

		List<String> newList = cityList.stream().distinct().collect(Collectors.toList());

		System.out.println("ArrayList with duplicates removed: " + newList);
	}

}