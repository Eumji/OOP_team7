import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JAVA {

	private JFrame frame;
	private JTextField textField;
	private String Nickname;
	private JPasswordField textField_1;
	
	/**
	 * Launch the application.
	 */
	
	public String getNickname(){
		return Nickname;
	}
	public void setNickname(String Nickname){
		this.Nickname = Nickname;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAVA window = new JAVA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JAVA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Java");
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblJavaGame = new JLabel("JAVA GAME");
		lblJavaGame.setForeground(new Color(0, 0, 0));
		lblJavaGame.setBackground(new Color(255, 255, 255));
		lblJavaGame.setFont(new Font("Bauhaus 93", Font.PLAIN, 60));
		
		JLabel label_1 = new JLabel("ID :");
		label_1.setFont(new Font("Arial", Font.PLAIN, 27));
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Arial", Font.PLAIN, 30));
		textField.setBackground(new Color(255, 255, 255));
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("Password : ");
		label_2.setFont(new Font("Arial", Font.PLAIN, 27));
		
		JButton button = new JButton("sign up");
		button.setFont(new Font("Arial", Font.PLAIN, 30));
		button.setBackground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton("login");
		button_1.setBackground(new Color(255, 255, 255));
		button_1.setFont(new Font("Arial", Font.PLAIN, 30));

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				ArrayList<People> people = new ArrayList<>();
				people = su.loadFromCSV();
				
				boolean loginPW = false;
				boolean loginID=false;
				for(People p : people){
					if(p.getID().equals(textField.getText())==true){
						loginID = true;
						
						if(p.getpassword().equals(textField_1.getText())==true)
							loginPW=true;
						Nickname = p.getnickname();
						break;
					}
				}
				
				
				if(loginID==false){
					JOptionPane.showMessageDialog(null, "ID is not available");
				}
				else if(loginPW==false){
					JOptionPane.showMessageDialog(null, "password wrong;(");	
				}

				else{
					JOptionPane.showMessageDialog(null, "Welcome "+ Nickname);	
					MENU m = new MENU();
					m.frame.setVisible(true);
					frame.setVisible(false);
					}
			}
		});
		
		textField_1 = new JPasswordField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 30));
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()=='\n'){
					SignUp su = new SignUp();
					ArrayList<People> people = new ArrayList<>();
					people = su.loadFromCSV();
					
					boolean loginPW = false;
					boolean loginID=false;
					for(People p : people){
						if(p.getID().equals(textField.getText())==true){
							loginID = true;
							
							if(p.getpassword().equals(textField_1.getText())==true)
								loginPW=true;
							Nickname = p.getnickname();
							break;
						}
					}
					
					
					if(loginID==false){
						JOptionPane.showMessageDialog(null, "ID is not available");
					}
					else if(loginPW==false){
						JOptionPane.showMessageDialog(null, "password wrong;(");	
					}

					else{
						JOptionPane.showMessageDialog(null, "Welcome "+ Nickname);	
						MENU m = new MENU();
						m.frame.setVisible(true);
						frame.setVisible(false);
						}
				}
			}
		});

		char echoChar = textField_1.getEchoChar(); 
		
		JRadioButton rdbtnShowPassword = new JRadioButton("Show password");
		rdbtnShowPassword.setFont(new Font("Arial", Font.PLAIN, 23));
		rdbtnShowPassword.setBackground(new Color(135, 206, 250));
		rdbtnShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getEchoChar()==echoChar){ 
					 textField_1.setEchoChar((char)0); 
				}else{ 
					textField_1.setEchoChar(echoChar); 
				} 


			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnShowPassword))
							.addGap(25))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(48))))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(102, Short.MAX_VALUE)
					.addComponent(lblJavaGame, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(lblJavaGame, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnShowPassword)
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
