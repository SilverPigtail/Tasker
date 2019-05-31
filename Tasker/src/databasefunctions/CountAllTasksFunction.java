package databasefunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CountAllTasksFunction {

	//private ArrayList<int>TotalUserTasks=new ArrayList<int>();
	
	
	public static int countAllTasksFunction(int id) {
		
		Connection cnc=null;
		
		try {
			cnc=DriverManager.getConnection("jdbc:mysql://51.158.162.242:3306/tasker",
			"tasker", "tasker");
			PreparedStatement QueryUserTask=cnc.prepareCall("select* from task where user_id="+id+" and completada=false");
			ResultSet QueryUserTaskResult=QueryUserTask.executeQuery();
			
			if(QueryUserTaskResult.next()) {
				
				ArrayList<String>TotalUserTasks=new ArrayList<String>();
				String titleToAdd="";
				int size=TotalUserTasks.size();

				do {
					
					TotalUserTasks.add(QueryUserTaskResult.getString("title"));
				
					
					}while(QueryUserTaskResult.next());
				size=TotalUserTasks.size();
				return size;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
		
		
	}
}
