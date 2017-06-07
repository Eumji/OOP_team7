import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ox_Game {
	
	int oxcounter = 0;
	ox_solution ans = new ox_solution();

	JFrame oxgame;
	JButton button, button_1;
	JTextArea textArea;
	ox_question oxq = new ox_question();
	private ArrayList<String> question = new ArrayList<String>(oxq.question());
	private ArrayList<String> answer = new ArrayList<String>(oxq.answer());
	private ArrayList<String> solution = new ArrayList<String>(oxq.solution());
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ox_Game window = new ox_Game();
					window.oxgame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public ox_Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		oxgame = new JFrame();
		oxgame.setBounds(100, 100, 1000, 1000);
		oxgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.LIGHT_GRAY);
		oxgame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton button = new JButton("O");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//"O" 눌렀을 때
				if(answer.get(oxcounter).equals("O"))
					ans.ox_isCorrect = true;
				else
					ans.ox_isCorrect = false;

				ox_solution oxs = new ox_solution();
				oxs.frame.setVisible(true);
				oxgame.setVisible(false);
				
			}
		});
		button.setForeground(Color.GREEN);
		button.setFont(new Font("Arial Black", Font.PLAIN, 250));
		button.setBackground(Color.BLACK);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.BOLD, 50));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.DARK_GRAY);
		
		textArea.setText(question.get(oxcounter));
		
		JButton button_2 = new JButton("X");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//"X" 눌렀을 때
				if(answer.get(oxcounter).equals("X"))
					ans.ox_isCorrect = true;
				else
					ans.ox_isCorrect = false;

				ox_solution oxs = new ox_solution();
				oxs.frame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 250));
		button_2.setBackground(Color.BLACK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(92)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(34)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 901, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 462, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		panel.setLayout(gl_panel);
		
		JMenuBar menuBar = new JMenuBar();
		oxgame.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 25));
		menuBar.add(mnMenu);
		
		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 20));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//menu로 돌아가기
				MENU home = new MENU();
				home.frame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mnMenu.add(mntmGoToMenu);
		
		JMenu mnQuestion = new JMenu("Question");
		mnQuestion.setFont(new Font("Arial", Font.PLAIN, 25));
		menuBar.add(mnQuestion);
		
		JMenuItem mntmNo = new JMenuItem("No.1");
		mntmNo.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo);
		
		JMenuItem mntmNo_1 = new JMenuItem("No.2");
		mntmNo_1.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_1);
		
		JMenuItem mntmNo_2 = new JMenuItem("No.3");
		mntmNo_2.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_2);
		
		JMenuItem mntmNo_3 = new JMenuItem("No.4");
		mntmNo_3.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_3);
		
		JMenuItem mntmNo_4 = new JMenuItem("No.5");
		mntmNo_4.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_4);
		
		JMenuItem mntmNo_5 = new JMenuItem("No.6");
		mntmNo_5.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_5);
		
		JMenuItem mntmNo_6 = new JMenuItem("No.7");
		mntmNo_6.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_6);
		
		JMenuItem mntmNo_7 = new JMenuItem("No.8");
		mntmNo_7.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_7);
		
		JMenuItem mntmNo_8 = new JMenuItem("No.9");
		mntmNo_8.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_8);
		
		JMenuItem mntmNo_9 = new JMenuItem("No.10");
		mntmNo_9.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_9);
		
		
	}
}
