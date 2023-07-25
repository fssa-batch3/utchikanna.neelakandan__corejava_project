package day11.practice;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import day11.practice.DAOException;

public class TaskDAOTest {
	
	 @Test
	    void testCreateTask() throws SQLException {
		    TaskDAO one = new TaskDAO();
	        
	        Task task = new Task();
	        task.id = 4;
	        task.name = "Task 1";
	        task.status = "Pending";

	        try {
	            one.createTask(task);
	        } catch (DAOException e) {
	            e.printStackTrace();
	        }
	    }

}