package interfaces;

import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;

//
import databasefunctions.CountAllTasksFunction;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//
/***
 * The class that models the task list of the program
 * @author Alejandro Molina Lara (SilverPigtail)
 *
 */
public class TaskList extends JPanel {


	/***
	 * The constructor of the task list
	 * @param w -> the window that contains all the Window's functions and parameters.
	 */
	public TaskList(Window w) {
		super();
		setLayout(new BorderLayout(0, 0));

		
		w.setSize(540, 600);
		w.setTitle("Total tasks: "+CountAllTasksFunction.countAllTasksFunction(w.getUser().getId()));
		JPanel listado = new JPanel();

		listado.setBackground(new Color(165, 42, 42));

		listado.setBorder(BorderFactory.createLineBorder(Color.red));
		// listado.setPreferredSize(new Dimension(300, 800));
		
		/***
		 * Here I set the JScrollPane
		 */
		JScrollPane scrollPane = new JScrollPane(listado);
		add(scrollPane);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);
		scrollPane.setViewportView(listado);
		listado.setLayout(null);

		Connection cnt = null;

		/***
		 * This part of the code allows the program to create single task view screens as many as you have uncompleted and
		 * put it in the listed tasks.
		 */
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://51.158.162.242:3306/tasker", "tasker", "tasker");

			PreparedStatement askForLength = cn
					.prepareStatement("select * from task where user_id=" + w.getUser().getId()+" and completada=false");
			ResultSet resultLength = askForLength.executeQuery();
			if (resultLength.next()) {

				int i = 0;
				
				//w.setTitle();
			
				do {

				
					SingleTaskView btnNewButton = new SingleTaskView(resultLength.getString("title"),
							resultLength.getString("description"), resultLength.getDate("expected_date").toString(), w, resultLength.getInt("id"));
					// btnNewButton.setSize(500,100);
					btnNewButton.setBounds(8, i, 500, 100);
					listado.setPreferredSize(new Dimension(300, i + 100));
					listado.add(btnNewButton);
					i += 110;
					

				} while (resultLength.next());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
