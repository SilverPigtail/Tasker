package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class RegisterUser extends JPanel{
	private JTextField nickTextField;
	private JTextField emailField;
	private JPasswordField passwordRegField;
	public RegisterUser() {
		setBackground(new Color(102, 153, 255));
		setLayout(null);
		
		JLabel lblTaskerSignup = new JLabel("Tasker Sign-up");
		lblTaskerSignup.setBackground(new Color(0, 0, 0));
		lblTaskerSignup.setBounds(193, 11, 77, 14);
		add(lblTaskerSignup);
		
		JLabel nicknameLabel = new JLabel("Nickname:");
		nicknameLabel.setFont(new Font("Arial", Font.BOLD, 17));
		nicknameLabel.setBounds(56, 120, 94, 29);
		add(nicknameLabel);
		
		JLabel emailLabel = new JLabel("E-mail:");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 17));
		emailLabel.setBounds(56, 193, 94, 29);
		add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 17));
		passwordLabel.setBounds(56, 263, 106, 40);
		add(passwordLabel);
		
		nickTextField = new JTextField();
		nickTextField.setBounds(184, 126, 136, 23);
		add(nickTextField);
		nickTextField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setBounds(184, 199, 141, 23);
		add(emailField);
		emailField.setColumns(10);
		
		passwordRegField = new JPasswordField();
		passwordRegField.setBounds(179, 275, 149, 23);
		add(passwordRegField);
		
		JButton registerButton = new JButton("SING-UP!");
		registerButton.setBounds(181, 359, 94, 40);
		add(registerButton);
	}
}
