package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompletedTaskList extends JPanel{

	
	public CompletedTaskList(Window w) {
		
		
		super();
		Calendar fecha= Calendar.getInstance();
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\"");
		LocalDateTime now=LocalDateTime.now();
		
		
		setLayout(new BorderLayout(0, 0));

		w.setSize(540, 600);

		JPanel completedListado = new JPanel();

		completedListado.setBackground(new Color(165, 42, 42));

		completedListado.setBorder(BorderFactory.createLineBorder(Color.red));
		// listado.setPreferredSize(new Dimension(300, 800));

		JScrollPane scrollPane = new JScrollPane(completedListado);
		add(scrollPane);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);
		scrollPane.setViewportView(completedListado);
		completedListado.setLayout(null);
		
		
		
		
		try {
			Connection cnc = DriverManager.getConnection("jdbc:mysql://51.158.162.242:3306/tasker", "tasker", "tasker");

			PreparedStatement askForLength2 = cnc
					.prepareStatement("select * from task where user_id=" + w.getUser().getId()+" and completada=true");
			ResultSet resultLength2 = askForLength2.executeQuery();
			
			if (resultLength2.next()) {

				int i = 0;
				
				
				do {
					
					
					SingleCompletedTaskView btnNewButton = new SingleCompletedTaskView(resultLength2.getString("title"), now.toString());
					btnNewButton.setSize(500,100);
					btnNewButton.setBounds(8, i, 500, 100);
					completedListado.setPreferredSize(new Dimension(300, i + 100));
					completedListado.add(btnNewButton);
					i += 110;
				

				} while (resultLength2.next());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}