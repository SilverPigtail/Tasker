package interfaces;

import javax.swing.JPanel;

import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

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
		btnBack.setBounds(351, 11, 89, 50);
		add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("resources\\completed_task_back.png"));
		label.setBounds(0, 0, 639, 300);
		add(label);
	}
}
