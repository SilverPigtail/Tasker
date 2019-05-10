package interfaces;

import javax.swing.JFrame;

import user.User;

public class Window extends JFrame{
	private RegisterUser RegisterUser;
	private StartScreen StartScreen;
	private User user;
	
	
	public Window() {
		super();
		this.setTitle("Registro");
		StartScreen=new StartScreen(this);
		this.setSize(600,600);
		this.setVisible(true);
		this.setContentPane(StartScreen);
		
		
		
		
		
	}
	
}
