import java.awt.EventQueue;
import java.awt.Menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;

public class Blank_Game {

	JFrame frame;
	private JTextField textField;
	boolean isright = false;
	Blank_question bq = new Blank_question();
	
	private ArrayList<String> answer = new ArrayList<String>(bq.answer());
	private ArrayList<String> solution = new ArrayList<String>(bq.solution());
	private ArrayList<Icon> img = new ArrayList<Icon>(bq.question());
	private int num = bq.num();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blank_Game window = new Blank_Game();
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
	public Blank_Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
					.addGap(38))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
		);
		
		JLabel lblAnser = new JLabel("Answer : ");
		lblAnser.setFont(new Font("Arial", Font.BOLD, 45));
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 35));
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		//Icon image = (Icon)img.get(num); 
		//lblNewLabel.setIcon(image);
		
		lblNewLabel.setBackground(Color.DARK_GRAY);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Blank_solution bs = new Blank_solution();
				String s = answer.get(num);
	
				if(textField.getText().equals(s)){
					bs.textArea.setBackground(Color.GREEN);
				}
				else{
					bs.textArea.setBackground(Color.RED);
					
				}
				frame.setVisible(false);
				bs.frame.setVisible(true);
				
			}
		});
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 35));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(101)
					.addComponent(lblAnser, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
					.addGap(60)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(78, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 919, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 597, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(69)
							.addComponent(lblAnser, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(97)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MENU m= new MENU();
				frame.setVisible(false);
				m.frame.setVisible(true);
			}
		});
		mnMenu.add(mntmGoToMenu);
		
		JMenu mnQuestion = new JMenu("Question");
		menuBar.add(mnQuestion);
		
		JMenuItem mntmNo = new JMenuItem("No.1");
		mnQuestion.add(mntmNo);
		
		JMenuItem mntmNo_1 = new JMenuItem("No.2");
		mnQuestion.add(mntmNo_1);
		
		JMenuItem mntmNo_2 = new JMenuItem("No.3");
		mnQuestion.add(mntmNo_2);
		
		JMenuItem mntmNo_3 = new JMenuItem("No.4");
		mnQuestion.add(mntmNo_3);
		
		JMenuItem mntmNo_4 = new JMenuItem("No.5");
		mnQuestion.add(mntmNo_4);
		
		JMenuItem mntmNo_5 = new JMenuItem("No.6");
		mnQuestion.add(mntmNo_5);
		
		JMenuItem mntmNo_6 = new JMenuItem("No.7");
		mnQuestion.add(mntmNo_6);
		
		JMenuItem mntmNo_7 = new JMenuItem("No.8");
		mnQuestion.add(mntmNo_7);
		
		JMenuItem mntmNo_8 = new JMenuItem("No.9");
		mnQuestion.add(mntmNo_8);
		
		JMenuItem mntmNo_9 = new JMenuItem("No.10");
		mnQuestion.add(mntmNo_9);
	}
	
}
