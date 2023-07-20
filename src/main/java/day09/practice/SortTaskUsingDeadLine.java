package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task>{

    private int id;
    private String name;
    private LocalDate deadline;

    public Task(){}
    public Task(int id, String name, String date){
        this.id = id;
        this.name = name;
        this.deadline = LocalDate.parse(date);
    }

    @Override
    public String toString() {
        return "Id : " + id + " Task : " + name + " Deadline : " + deadline;
    }


    @Override
    public int compareTo(Task o) {
        if (this.deadline == o.deadline){
            return 0;
        }
        return this.deadline.compareTo(o.deadline);
    }
}


public class SortTaskUsingDeadLine {
    public static void main(String[] args) {
        ArrayList<Task> arr = new ArrayList<>();
        arr.add(new Task(3,"Coding","2022-10-22"));
        arr.add(new Task(5,"Product Design","2022-10-01"));
        arr.add(new Task(1,"Software Design", "2022-10-07"));
        arr.add(new Task(3,"Coding","2022-10-22"));

        System.out.println("Before Sorting : ");
        for (Task i : arr) {
            System.out.println(i);
        }
        Collections.sort(arr);
        System.out.println("After Sorting : ");
        for (Task i : arr) {
            System.out.println(i);
        }

    }
}

