package day12.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day06.practice.*;
import day11.practice.DAOException;
import day11.solved.ConnectionUtil;

class Task {
	public int id;
	public String name;
	public String status;

}

public class TaskDAO {

	public void createTask(Task task) throws DAOException {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
				PreparedStatement stmt = connection
						.prepareStatement("INSERT INTO task (id, name, status) VALUES (?, ?, ?)")) {

			stmt.setInt(1, task.id);
			stmt.setString(2, task.name);
			stmt.setString(3, task.status);
			// Hint: Execute the update statement
			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
	}

	public void updateTask(Task task) throws DAOException {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456") ;

			PreparedStatement statement = connection
					.prepareStatement("UPDATE task SET name = ?, status = ? WHERE id = ?")){
			statement.setString(1, task.name);
			statement.setString(2, task.status);
			statement.setInt(3, task.id);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
	}

	public void deleteTask(int taskId) throws DAOException {
		// Hint: Add the try-with-resources for delete query here
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
				// Hint: Add the SQL update statement here
				PreparedStatement stmt = connection
						.prepareStatement("DELETE FROM task WHERE id = ?")) {

			// Hint: Set the value for the PreparedStatement using the taskId
			stmt.setInt(1, 2);
			// Hint: Execute the delete statement
			stmt.executeUpdate();
			// Hint: Catch the SQLException and throw DAOException with appropriate message
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
	}

	public List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT * FROM task");
				ResultSet rs = stmt.executeQuery()) {

			// Hint: Iterate over the ResultSet to create Task objects and add them to the
			// tasks list
			while (rs.next()) {
				Task task = new Task();
				task.id = rs.getInt("id");
				task.name = rs.getString("name");
				task.status = rs.getString("status");
				tasks.add(task);
			}

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return tasks;
	}
}