package lektionmedjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class JDBC {
	
	final static String CONN_STRING = "jdbc:mysql://localhost/epic_rpg";
	final static String USER = "root";
	final static String PASSWORD = "";

	public static void main(String[] args) {
		
		Savepoint savepoint = null;	
		
		try  (
				
			// parameter for try-method
			Connection conn = DriverManager.getConnection(CONN_STRING, USER, PASSWORD);
				
			PreparedStatement preparedStmtItem = conn.prepareStatement
					("SELECT * FROM items WHERE id = ?");
			)	
		{
			conn.setAutoCommit(false); // does not occur before commit
			savepoint = conn.setSavepoint(); // kommer tillbaka hit när det blir rollback
			
			preparedStmtItem.setInt(1, 3); // set 3 to the 1st "?" in the query
			ResultSet rs1 = preparedStmtItem.executeQuery();
			rs1.next();			
			Item item =ItemManager.getItem(rs1);
			
			System.out.println(item);
			
			
			if (item.getId() > 2) {
				conn.rollback(savepoint); // goes back to savepoint
				System.out.println("Transaction rolled back.");
			}
			
			conn.commit();
			
			PreparedStatement preparedStmtCharacter = conn.prepareStatement
					("SELECT * FROM characters WHERE id = ?");
			preparedStmtCharacter.setInt(1, 5);
			ResultSet rs2 = preparedStmtCharacter.executeQuery();
			rs2.next();
			Character character =CharacterManager.getCharacter(rs2);
			System.out.println(character);
			
			PreparedStatement preparedStmtCharacterClass = conn.prepareStatement
					("SELECT * FROM class WHERE id = ?");
			
			preparedStmtCharacterClass.setInt(1, 2);
			ResultSet rs3 = preparedStmtCharacterClass.executeQuery();
			rs3.next();
			CharacterClass characterClass = ClassManager.getCharacterClass(rs3);
			System.out.println(characterClass);
	
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}

}


//Connection
//Statement
//ResultSet

//getConnection tar tre parametrar. FÖrsta är en URL-string till vår databas
//användarmn och lösenord''

//ResultSet-metoder
//next()
//previous()
//absolute(int id)
//first()
//last()
//getRow()
//isBeforeFirst()
//isAfterLast()
//isFirst()
//isLast()
//getString(String columname)
//getInt(int columnID)
