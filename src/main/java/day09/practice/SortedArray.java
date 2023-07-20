package day09.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }


        System.out.println("Array List Before Sorting : " + arr);
        Collections.sort(arr);
        System.out.println("Array List After Sorting : " + arr);
    }
}