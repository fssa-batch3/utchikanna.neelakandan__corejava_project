package day11.practice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import day11.solved.ConnectionUtil;

 class Task {
	int id;
	String name;
	String status;
}

public class TaskDAO {
	public void createTask(Task task) throws DAOException, SQLException {
		// Write code here to get connection
		Connection connection = ConnectionUtil.getConnection();

		// Step 02: Create a Statement
		Statement stmt = connection.createStatement();

		// Getting the data
 
		Task one = new Task();
		one.id = 1;
		one.name = "Sample Task";
		one.status = "Pending";

		// Step 04: Execute Insert Query
		String query = "INSERT INTO Task (id, name, status) VALUES (" + one.id + ", '" + one.name + "', '" + one.status
				+ "')";
		int rows = stmt.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		// Step 04: close the connection resources
		ConnectionUtil.close(connection, stmt, null);
	}

}