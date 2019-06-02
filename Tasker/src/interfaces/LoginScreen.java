package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import databasefunctions.LoginUser;
import user_task.User;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/***
 * This class is the interface that appears when you click the login button in the start screen.
 * @author Alejandro Molina Lara
 *
 */
public class LoginScreen extends JPanel{
	private JTextField nickNameLoginField;
	private JPasswordField passwordLoginField;	
	
	
	
	
	public LoginScreen(Window w) {
		super();
		setBackground(Color.CYAN);
		setLayout(null);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNickname.setBounds(83, 164, 100, 23);
		add(lblNickname);
		
		nickNameLoginField = new JTextField();
		nickNameLoginField.setBounds(231, 163, 159, 30);
		add(nickNameLoginField);
		nickNameLoginField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 16));
		lblPassword.setBounds(83, 302, 93, 23);
		add(lblPassword);
		
		passwordLoginField = new JPasswordField();
		passwordLoginField.setBounds(231, 301, 159, 30);
		add(passwordLoginField);
		
		JButton btnSignIn = new JButton("Sign In!");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				User userToLog= LoginUser.LoginUserFunction(nickNameLoginField.getText(), passwordLoginField.getText());
				if(userToLog!=null) {
					w.setUser(userToLog);
					w.loadSelectActionScreen();
				}
					
				
			}
		});
		
		btnSignIn.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSignIn.setBounds(192, 360, 100, 30);
		add(btnSignIn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				w.loadStartScreen();
				
			}
		});
		btnBack.setBounds(321, 365, 69, 23);
		add(btnBack);
		
		JLabel lblWelcomeToTasker = new JLabel("Welcome to Tasker again!");
		lblWelcomeToTasker.setFont(new Font("Verdana", Font.BOLD, 16));
		lblWelcomeToTasker.setBounds(115, 81, 262, 54);
		add(lblWelcomeToTasker);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("resources\\login_background.png"));
		lblNewLabel.setBounds(0, 0, 500, 500);
		add(lblNewLabel);
	
	
	
	
	}
	
}
