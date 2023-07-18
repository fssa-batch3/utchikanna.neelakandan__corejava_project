package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(56);
		list.add(56);
		list.add(93);
		
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println("Using Set :" + set);

	}

}
