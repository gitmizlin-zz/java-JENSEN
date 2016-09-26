package jdbc_miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectManager {	
	
	public static Project getProject(ResultSet rs) throws SQLException {
		Project project = new Project();
		project.setId(rs.getInt("id"));
		project.setName(rs.getString("name"));
		
		return project;
	}
	
	public static void getAllRows(ResultSet rs) throws SQLException {		
		while (rs.next()) {
            System.out.print(rs.getInt("id") + " " + rs.getString("name") + "\n");
		}
	}
	
	public static void editTable(ResultSet rs, Connection conn) throws SQLException {
	
		getAllRows(rs);
		
		System.out.println("------------------------");
		System.out.println("1: Add data");
		System.out.println("2: Delete data");
		System.out.println("3: Search data");
		System.out.println("4: Go back to main menu\n");
		
		try {				

			int input = InputHelper.getIntegerInput("Select a number: "); 
			
			switch(input) {
				case 1:	System.out.println("Add data");
					addRow(conn);
					break;
						
				case 2: System.out.println("Delete data");	
					deleteRow(conn);
					break;
					
				case 3: System.out.println("Search data");	
					search(rs, conn);
					break;
						
				case 4: System.out.println("Go back to main");
					break;			
			}
			
		} catch (Exception e) {
			System.out.println("Invalid input.");	
			System.err.println(e.getMessage());							
		}
	}
	
	public static void addRow(Connection conn) throws SQLException {
		
		String projectName = InputHelper.getStringInput("Enter a project name: "); 
		
		String query = "INSERT INTO projects (name) VALUES ('" + projectName + "')";
		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.executeUpdate(query);
		System.out.println("A row has been inserted.");	

		// Print out the last row
		String query2 = "SELECT * FROM projects ORDER by id DESC LIMIT 1";
		PreparedStatement stmt2 = conn.prepareStatement(query2);
		ResultSet rs = stmt2.executeQuery();
		rs.last();
		System.out.println(getProject(rs).toString());		
	}
	
	public static void deleteRow(Connection conn) throws SQLException {		
		
		int input = InputHelper.getIntegerInput("----------------------------\n"
				+ "Enter a row number to "
				+ "delete.\nTo delete the last row, enter 0: "); 
		
		if (input == 0) {
			String query = "SELECT * FROM projects ORDER by id DESC LIMIT 1";
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			rs.last();
			input = getProject(rs).getId();		
		} 
		
		try {
			
			String queryDelete = "DELETE FROM projects WHERE id = " + input;
			PreparedStatement stmt2 = conn.prepareStatement(queryDelete);
			stmt2.executeUpdate();
			System.out.println("The row " + input + " has been deleted.");
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void search(ResultSet rs, Connection conn) throws SQLException {
		
		System.out.println("------------------------");
		System.out.println("1: Search project by name");
		System.out.println("2: Search project by office");
		System.out.println("3: Go back to main menu\n");
		
		try {				

			int input = InputHelper.getIntegerInput("Select a number: "); 
			
			switch(input) {
				case 1:	
					getProjectByName(conn);
					break;
						
				case 2:
					getProjectByOffice(conn);
					break;
						
				case 3: System.out.println("Go back to main");
					break;			
			}
			
		} catch (Exception e) {
			System.out.println("Invalid input.");	
			System.err.println(e.getMessage());							
		}
	}
	
	public static void getProjectByName(Connection conn) throws SQLException {		
		System.out.println("*****************************");
		
		String input = InputHelper.getStringInput("Enter a letter / letters. \n"
				+ "All the projects with a name containing the letter(s) will be "
				+ "displayed: "); 
		
		try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM projects "
				+ "WHERE name LIKE ?");) {
			
			stmt.setString(1, "%" + input + "%");
			
			ResultSet rs = stmt.executeQuery();
			getAllRows(rs);			
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public static void getProjectByOffice(Connection conn) throws SQLException {	
		System.out.println("*****************************");
		
		int input = InputHelper.getIntegerInput("Enter an office ID: "); 
		
		try {
			
			String query = "SELECT DISTINCT projects.id, projects.name FROM projects "
					+ "INNER JOIN employees ON projects.id = employees.project "
					+ "JOIN offices on offices.id = employees.office "					
					+ "where offices.id = " + input + " ORDER BY projects.id ASC";
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			System.out.println("---------------------");
			System.out.println("Projects running in the office:");
			getAllRows(rs);			
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
}
