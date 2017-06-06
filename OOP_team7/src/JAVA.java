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

public class JAVA {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private String Nickname;

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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(68)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(39)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
									.addGap(90)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(66)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addGap(76)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addComponent(lblJavaGame, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(101, Short.MAX_VALUE))
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
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(92)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
