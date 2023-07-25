package day12.practice;

import java.util.List;

import day11.practice.DAOException;

public class TaskMain {

	public static void main(String[] args) throws DAOException {

		TaskDAO taskDAO = new TaskDAO();

		Task newTask = new Task();
		newTask.id = 125;
		newTask.name = "Playing Cricket";
		newTask.status = "Completed..";
		taskDAO.createTask(newTask);

		Task exitTask = new Task();
		exitTask.id = 12;
		exitTask.name = "Learning new things";
		exitTask.status = "Pending..";
		taskDAO.updateTask(exitTask);

		int taskIdDelete = 1;
		taskDAO.deleteTask(taskIdDelete);

		try {

			List<Task> allTasks = taskDAO.getAllTasks();
			for (Task task : allTasks) {
				System.out.println("ID: " + task.id + ", Name: " + task.name + ", Status: " + task.status);
			}
		} catch (DAOException e) {
			System.err.println(e.getMessage());
		}

	}

}
