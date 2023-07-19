package day08.practice;

import java.util.*;

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<String, String> arr = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	        int x = 5;
	        while (x > 0){
	            String str = sc.nextLine();
	            String[] strArr = str.split(",");
	            String key = strArr[0],value = strArr[1].trim();
	            arr.put(key,arr.merge(key,value,(oldValue, newValue) -> oldValue + ", " + newValue));
	            x--;
	        }

	        Set<String> keySet = arr.keySet();
	        for (String i: keySet) {
	            System.out.println(i + ": " + arr.get(i));
	        }


	}

}
