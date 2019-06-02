package interfaces;

import javax.swing.JFrame;

import databasefunctions.LoginUser;
import user_task.User;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/***
 * This is the main JFrame class that contains all the Screen functions and the window
 * @author Alejandro Molina Lara (SilverPigtail)
 *
 */
public class Window extends JFrame{
	private RegisterScreen registerS;
	private LoginScreen loginS;
	private StartScreen startS;
	private SelectActionScreen sas;
	private NewTaskScreen nts;
	private TaskList tl;
	private CompletedTaskList ctl;
	private User user;
	
	/***
	 * The constructor of the window class
	 */
	public Window() {
		super();
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\pixil-frame-0 (7).png"));
		setResizable(false);
		this.setTitle("Registro");
		startS=new StartScreen(this);
		this.setSize(500,500);
		this.setContentPane(startS);
		this.setVisible(true);
		
		this.registerS=new RegisterScreen(this);
		this.loginS=new LoginScreen(this);
		this.sas=new SelectActionScreen(this);
		this.nts=new NewTaskScreen(this);
		
		
	
		
		
	}
	
	/***
	 * This function loads the sing-up screen
	 */
	public void loadRegisterScreen() {
		
		
			this.registerS.setVisible(true);
			this.setTitle("Sing-Up");
			this.startS.setVisible(false);
			this.setContentPane(this.registerS);
		
		
		
	}
	
	/***
	 * This function loads the log-in screen
	 */
	public void loadLoginScreen() {
		
		
			this.registerS.setVisible(false);
			this.loginS.setVisible(true);
			this.setTitle("Sign-In");
			this.startS.setVisible(false);
			this.setContentPane(this.loginS);
		
		
		
	}
	
	/***
	 * Thi function loads the Start Screen
	 */
	public void loadStartScreen() {
		
		this.setTitle("Tasker, all what do you have to do here!");
		if(this.loginS!=null) {
			
			this.loginS.setVisible(false);
			
		}else if(this.registerS!=null) {
			
			this.registerS.setVisible(false);
			
		}
		
		this.registerS.setVisible(false);
		this.startS.setVisible(true);
		this.setContentPane(startS);
	}
	
	/***
	 * This function load the select action screen
	 */
	public void loadSelectActionScreen() {
		
		
		this.setTitle("Hello, what do you want to do?");
		
		
		
		this.loginS.setVisible(false);
		this.setContentPane(sas);
		
	}
	
	/***
	 * This class the new task screen
	 */
	public void loadNewTaskScreen() {

		this.setTitle("Add a task!");
		
		
		this.sas.setVisible(false);
		this.setContentPane(nts);
	}
	
	/***
	 * This class load the task Screen
	 */
	public void loadTaskScreen() {
		
		this.tl=new TaskList(this);
		this.sas.setVisible(false);
		this.setContentPane(tl);
		
	}

	/***
	 * This function loads the select action screen again
	 */
	public void backSelectActionScreenAdd() {
		
		this.setTitle("Hello, what do you want to do?");

		this.sas.setVisible(false);
		this.setContentPane(sas);
		this.sas.setVisible(true);
		
	}

	/***
	 * This function loads the completed tasks list
	 */
	public void loadCompletedTaskList() {
		
		this.setTitle("See what you have done!");
		this.ctl=new CompletedTaskList(this);
		this.sas.setVisible(false);
		this.setContentPane(ctl);
	}
	
	/***
	 * This function loads the comleted task lists from the uncompleted task list
	 */
	public void loadCompletedTaskListFromTasks() {
		
		this.setTitle("See what you have done!");
		this.ctl=new CompletedTaskList(this);
		this.tl.setVisible(false);
		this.setContentPane(ctl);
	}
	
	
	/***
	 * This function load the select Action Screen from the task list Screen
	 */
	public void backToSelectScreenFromTaskList() {
		
		this.setTitle("Hello, what do you want to do?");
		
		
		
		this.tl.setVisible(false);
		this.sas.setVisible(true);
		this.sas.setSize(500, 500);
		this.setSize(500, 500);
		this.setContentPane(sas);
		
		
	}
	
	
	/***
	 * This function loads the select Action Screen from the completed task screen
	 */
	public void backToSelectScreenFromCompletedTasksList() {
		
		this.setTitle("Hello, what do you want to do?");
		
		
		
		this.ctl.setVisible(false);
		this.sas.setVisible(true);
		this.sas.setSize(500, 500);
		this.setSize(500, 500);
		this.setContentPane(sas);
		
		
	}
	
	/***
	 * This allows to the rest of the classes to get the user of the user from the database
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/***
	 * This allows the rest of the classes to set user from the database
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
