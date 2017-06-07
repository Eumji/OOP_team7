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
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblJavaGame = new JLabel("JAVA GAME");
		lblJavaGame.setFont(new Font("Baskerville Old Face", Font.PLAIN, 50));
		
		JLabel label_1 = new JLabel("ID :");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("Password : ");
		
		JButton button = new JButton("sign up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton("login");

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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(39)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
									.addGap(90)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(66)
											.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
										.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
									.addGap(68)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_1)
										.addComponent(textField)
										.addComponent(rdbtnShowPassword)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addComponent(lblJavaGame, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(174, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblJavaGame, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnShowPassword)
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
