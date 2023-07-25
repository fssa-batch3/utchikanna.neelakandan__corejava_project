package day12.practice;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.DAOException;

public class TestTaskDAO {

	@Test
	public void checkCreateTask() {
		TaskDAO taskDAO = new TaskDAO();

		Task one = new Task();
		one.id = 12;
		one.name = "Playing Cricket";
		one.status = "Waiting for sun";
		try {
			taskDAO.createTask(one);
		} catch (DAOException e) {
			Assertions.fail("Failed to create task : " + e);
		}
	}

	@Test
	public void checkUpdateTask() throws DAOException, SQLException {
		TaskDAO taskDAO = new TaskDAO();

		Task one = new Task();
		one.id = 12;
		one.name = "Playing Cricket";
		one.status = "Waiting for sun";
		try {
			taskDAO.updateTask(one);
		} catch (DAOException e) {
			Assertions.fail("Failed to update task : " + e);
		}
	}

	@Test
	public void checkDeleteTask() throws DAOException, SQLException {
		TaskDAO taskDAO = new TaskDAO();

		try {
			taskDAO.deleteTask(12);
		} catch (DAOException e) {
			Assertions.fail("Failed to delete task : " + e);
		}
	}

	@Test
	public void checkListOutData() throws DAOException, SQLException {
		try {
			TaskDAO taskDAO = new TaskDAO();
			List<Task> allTasks = taskDAO.getAllTasks();
			for (Task task : allTasks) {
				System.out.println("ID: " + task.id + ", Name: " + task.name + ", Status: " + task.status);
			}
		} catch (DAOException e) {
			Assertions.fail("Failed to list out the task : " + e);
		}
	}

}
