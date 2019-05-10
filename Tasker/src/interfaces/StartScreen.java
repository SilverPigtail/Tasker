package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartScreen extends JPanel{
	private Window w;
	public StartScreen(Window w) {
		setBackground(Color.ORANGE);
		setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welconme to Tasker. What do you want to do?");
		welcomeLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		welcomeLabel.setBounds(78, 11, 452, 78);
		add(welcomeLabel);
		
		JButton loginFunctionButton = new JButton("Login User");
		loginFunctionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		loginFunctionButton.setBounds(231, 114, 127, 47);
		add(loginFunctionButton);
		
		JButton registerUserFunction = new JButton("Register User");
		registerUserFunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerUserFunction.setBounds(231, 241, 127, 42);
		add(registerUserFunction);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(255, 394, 89, 23);
		add(btnNewButton);
	}
}
