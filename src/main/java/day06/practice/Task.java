package day06.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task {
	 
    public String taskName;
     
    public int priority;
    
    public Task(String taskName , int priority) {
    	this.priority = priority;
    	this.taskName = taskName;
    }
    
    public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
    public String toString() {
    	return "The Task is : "+ taskName +", Priority : "+priority;
    }
    
	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("Wake up", 2));
		taskList.add(new Task("Nets session" , 1));
		taskList.add(new Task("go to office",3));
		
		for(int i=0;i<taskList.size();i++) {
			System.out.println(taskList.get(i));
		}

	}

}
