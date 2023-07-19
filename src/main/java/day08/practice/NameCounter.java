package day08.practice;

import java.util.*;

public class NameCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String [] strArr = str.split(",");
		
		
		for(String newStr : strArr) {
			newStr = newStr.trim();
			nameMap.put(newStr, nameMap.getOrDefault(newStr, 0)+1);
		}
		
		nameMap.forEach((key,value) -> System.out.println(key + " = " + value));
		
		

	}

}
