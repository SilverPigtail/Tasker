package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/***
 * This class models the interface of the main Screen that appears when you log in
 * @author Alejandro Molina Lara
 *
 */
public class StartScreen extends JPanel {
	private Window wind;

	/***
	 * This is the constructor that models the Start Screen
	 * @param w -> the window that contains all the Window's functions and parameters.
	 */
	public StartScreen(Window w) {
		super();
		wind = w;
		setBackground(Color.ORANGE);
		setLayout(null);

		/***
		 * The label that is used as a title
		 */
		JLabel taskerLabelName = new JLabel("Welcome to Tasker");
		taskerLabelName.setFont(new Font("Verdana", Font.BOLD, 17));
		taskerLabelName.setBounds(151, 11, 182, 22);
		add(taskerLabelName);

		/***
		 * The button that allows the program to cast the log-in screen if it is successful
		 */
		JButton loginFunctionButton = new JButton("Login User");
		loginFunctionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				wind.loadLoginScreen();

			}
		});
		
		
		
			

			
		
		loginFunctionButton.setBounds(43, 301, 127, 47);
		add(loginFunctionButton);

		/***
		 * The button that allows the program to cast the sing-up screen
		 */
		JButton registerUserFunction = new JButton("Register User");
		registerUserFunction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked (MouseEvent e) {
				wind.loadRegisterScreen();
			}
		});
		registerUserFunction.setBounds(213, 301, 131, 47);
		add(registerUserFunction);

		/***
		 * The button that allows the program to exit the execution
		 */
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(390, 325, 89, 23);
		add(btnNewButton);

		/***
		 * The text that is used as a description of the program that appears in the center of the screen
		 */
		JTextArea txtrTaskerIsA = new JTextArea();
		txtrTaskerIsA.setEditable(false);
		txtrTaskerIsA.setOpaque(false);
		txtrTaskerIsA.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		txtrTaskerIsA.setBackground(new Color(255, 255, 255));
		txtrTaskerIsA.setText(
				"Tasker is a free application where you can add\r\n daily task that you have to do to\r\n remember them later.");
		txtrTaskerIsA.setBounds(78, 132, 382, 88);
		add(txtrTaskerIsA);

		/***
		 * The label that contains the image used as a background
		 */
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("resources\\interface_back_1.png"));
		lblNewLabel.setBounds(0, 0, 497, 494);
		add(lblNewLabel);
	}
}
