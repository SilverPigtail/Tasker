package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import databasefunctions.addTaskFunction;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale.Category;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

/***
 * This class create the add task screen interface that allows you to create tasks.
 * @author Alejandro Molina Lara (SilverPigtail)
 *
 */
public class NewTaskScreen extends JPanel{
	private JTextField taskNameField;
	private JTextField textDateField;
	private JTextField textFieldOfDate;


	
	/***
	 * This is the function that contains all the visual interface information about the add task screen.
	 * @param w -> The window of the Window class that contains all the screen functions and data from it.
	 */
	public NewTaskScreen(Window w) {
		

		
		/***
		 * Here are all the interface settings and visual parameter of the interface class.
		 */
		setBackground(Color.ORANGE);
		setLayout(null);
		
		
		/***
		 * The label of the task name text
		 */
		JLabel lblTaskName = new JLabel("Task name:");
		lblTaskName.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTaskName.setBounds(29, 85, 147, 19);
		add(lblTaskName);
		
		/***
		 * The label of description text
		 */
		JLabel lblTaskDescription = new JLabel("Task description:");
		lblTaskDescription.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTaskDescription.setBounds(29, 198, 169, 34);
		add(lblTaskDescription);
		
		/***
		 * The label of expected_date text
		 */
		JLabel lblExpectedDate = new JLabel("Expected date:");
		lblExpectedDate.setFont(new Font("Verdana", Font.BOLD, 16));
		lblExpectedDate.setBounds(33, 299, 143, 20);
		add(lblExpectedDate);
		
		/***
		 * The field of where you write the name of you'r new task
		 */
		taskNameField = new JTextField();
		taskNameField.setBounds(208, 87, 119, 20);
		add(taskNameField);
		taskNameField.setColumns(10);
		
		
		
		/***
		 * The field of the description input of your new task
		 */
		JTextArea taskDescriptionField = new JTextArea();
		taskDescriptionField.setLineWrap(true);
		taskDescriptionField.setBounds(191, 175, 158, 88);
		
		add(taskDescriptionField);
		
		/***
		 * The field where you write the date of your new task
		 */
		textFieldOfDate = new JTextField();
		textFieldOfDate.setBounds(208, 302, 119, 20);
		add(textFieldOfDate);
		textFieldOfDate.setColumns(10);
		
		/***
		 * The button that allows to the program to cast the function that create a task in the database
		 */
		JButton addTaskButton = new JButton("Add Task");
		addTaskButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/***
				 * This function allows the program to get all the information written in the fields of the interface and
				 * send it to the function that send the task's data to the database.
				 */
				addTaskFunction.addTaskFunction(taskNameField.getText(), taskDescriptionField.getText(), textFieldOfDate.getText(), w.getUser().getId());

			}
		});
		addTaskButton.setBounds(208, 368, 119, 34);
		add(addTaskButton);
		
		/***
		 * The button back that allows the program to back to the select Action Screen
		 */
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				w.backSelectActionScreenAdd();
			}
		});
		btnBack.setBounds(360, 437, 89, 23);
		add(btnBack);
		
		/***
		 * The label that awares the user of the format of the date that he has to use
		 */
		JLabel lblDateFormat = new JLabel("FORMAT (YYYY-MM-dd)");
		lblDateFormat.setFont(new Font("Verdana", Font.BOLD, 11));
		lblDateFormat.setBounds(191, 274, 158, 14);
		add(lblDateFormat);
		
		/***
		 * The label that awares the user of the max length of the description
		 */
		JLabel lblCharacters = new JLabel("45 Characters");
		lblCharacters.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCharacters.setBounds(208, 130, 119, 34);
		add(lblCharacters);
		
		/**
		 * The label that awares the user of the max length of the task name
		 */
		JLabel lblCharacters_1 = new JLabel("15 characters");
		lblCharacters_1.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCharacters_1.setBounds(208, 41, 119, 14);
		add(lblCharacters_1);
		
		/***
		 * The label that contains the image used as a background
		 */
		JLabel fieldOfDate = new JLabel("");
		fieldOfDate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		fieldOfDate.setIcon(new ImageIcon("resources\\new_task_background.png"));
		fieldOfDate.setBounds(0, 0, 500, 500);
		add(fieldOfDate);
		
	
		
		
	}
}
