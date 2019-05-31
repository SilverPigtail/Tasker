package interfaces;

import javax.swing.JPanel;

import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class SingleCompletedTaskView extends JPanel {
	
	
	
	public SingleCompletedTaskView(String title, String today) {
		setLayout(null);
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setBounds(10, 42, 142, 14);
		add(lblTitle);
		
		JLabel lblDate = new JLabel(today);
		lblDate.setBounds(214, 42, 212, 14);
		add(lblDate);
	}
}
