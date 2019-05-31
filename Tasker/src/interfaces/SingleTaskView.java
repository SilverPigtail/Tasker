package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class SingleTaskView extends JPanel{
	private String title;
	private String description;
	private String date;
	private Window w;
	
	public SingleTaskView(String title, String description, String date, Window wind) {
		this.title=title;
		this.description=description;
		this.date=date;
		this.w=wind;
		
		//
		Connection cnb=null;
		//
		
		setSize(500,100);
		setLayout(null);
		
		
		JLabel lblTitulo = new JLabel(title);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 26));
		lblTitulo.setBounds(10, 11, 247, 32);
		add(lblTitulo);
		
		JLabel lblFecha = new JLabel(date);
		lblFecha.setBounds(10, 46, 80, 14);
		add(lblFecha);
		
		JLabel lblDescripcion = new JLabel(description);
		lblDescripcion.setBounds(10, 71, 146, 14);
		add(lblDescripcion);
		
		JButton btnCompletar = new JButton("Complete!");
		btnCompletar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCompletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//databasefunctions.CompleteTaskFunction();
				
				try {
					Connection cnb=DriverManager.getConnection("jdbc:mysql://51.158.162.242:3306/tasker",
					        "tasker", "tasker");
					System.out.println(lblTitulo.getText());
					PreparedStatement updateBoolean= cnb.prepareStatement("update task set completada = true where title= '"+lblTitulo.getText()+"';");
					updateBoolean.execute();
					cnb.close();
					
					wind.loadCompletedTaskListFromTasks();
					
					/*JOptionPane.showMessageDialog(null,
						    "You will see your completed task in the completed task menu",
						    "Well done!",
						    JOptionPane.PLAIN_MESSAGE);*/
					/*System.out.println(w.getUser().getId());
					System.out.println( w.getUser().getNickname());*/
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				
			}
		});
		btnCompletar.setBounds(388, 11, 89, 74);
		add(btnCompletar);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("resources\\singletaskview Background.png"));
		lblBackground.setBounds(0, 0, 500, 100);
		add(lblBackground);
	}
}
