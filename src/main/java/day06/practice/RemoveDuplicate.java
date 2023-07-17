package day06.practice;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		System.out.println(cityList);
		
		List<String> newList = cityList.stream().distinct().toList();
		
		System.out.println(newList);
		

	}

}
