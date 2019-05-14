package interfaces;

import javax.swing.JFrame;

import user.User;

public class Window extends JFrame{
	private RegisterScreen registerS;
	private LoginScreen loginS;
	private StartScreen startS;
	private User user;
	
	
	public Window() {
		super();
		setResizable(false);
		this.setTitle("Registro");
		startS=new StartScreen(this);
		this.setSize(500,500);
		this.setVisible(true);
		this.setContentPane(startS);
		
		
		
		
	
		
		
	}
	
	
	public void loadRegisterScreen() {
		
		if(this.registerS==null) {
			
			this.registerS=new RegisterScreen(this);
			
		}else {
			this.setTitle("Sing-Up");
			this.startS.setVisible(false);
			this.setContentPane(this.registerS);
		}
		
		
	}
	
	
	public void loadLoginScreen() {
		
		if(this.loginS==null) {
			
			this.loginS=new LoginScreen(this);
			
		}else {
			this.setTitle("Sign-In");
			this.startS.setVisible(false);
			this.setContentPane(this.loginS);
		}
		
		
	}
	
	public void loadStartScreen() {
		
		this.setTitle("Tasker, all what do you have to do here!");
		if(this.loginS!=null) {
			
			this.loginS.setVisible(false);
			
		}else if(this.registerS!=null) {
			
			this.registerS.setVisible(false);
		}
		this.startS.setVisible(true);
		this.setContentPane(startS);
	}
	
}
