package databasefunctions;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Locale.Category;

import javax.swing.JOptionPane;

public class addTaskFunction {

	public static void addTaskFunction(String ttl, String dtl, String tolog, int id) {

		
		
		Connection cnl = null;

		try {
			cnl = DriverManager.getConnection("jdbc:mysql://51.158.162.242:3306/tasker", "tasker", "tasker");
			
			 PreparedStatement registerTaskStatement=cnl.prepareStatement("insert into task(title, description, expected_date, completada, user_id)"
			 		+ "values('"+ttl+"','" + dtl + "', '" + tolog + "', " + 0 + ", "+id+");");
			 registerTaskStatement.execute();
			
			 JOptionPane.showMessageDialog(null,
					    "You'll see that in the show task menu",
					    "Task registered!",
					    JOptionPane.PLAIN_MESSAGE);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
				    "try changing the date or the title",
				    "Error adding the task",
				    JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

}
