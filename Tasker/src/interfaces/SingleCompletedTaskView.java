package interfaces;

import javax.swing.JPanel;

import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleCompletedTaskView extends JPanel {
	
	
	
	public SingleCompletedTaskView(String title, String today, Window w) {
		setLayout(null);
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setBounds(10, 42, 142, 14);
		add(lblTitle);
		
		JLabel lblDate = new JLabel(today);
		lblDate.setBounds(214, 42, 212, 14);
		add(lblDate);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				w.backToSelectScreenFromCompletedTasksList();
				
			}
		});
		btnBack.setBounds(385, 11, 55, 50);
		add(btnBack);
	}
}
