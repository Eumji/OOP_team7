import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MultipleChoice_Game {

	JFrame frame;
	JTextArea textArea;
	MultipleChoice_Question mcq = new MultipleChoice_Question();
	private ArrayList<String> question = new ArrayList<String>(mcq.question());
	private ArrayList<String> answer = new ArrayList<String>(mcq.answer());
	private ArrayList<String> solution = new ArrayList<String>(mcq.solution());
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleChoice_Question mcqq = new MultipleChoice_Question();
					mcqq.mc_restart();
					MultipleChoice_Game window = new MultipleChoice_Game();
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
	public MultipleChoice_Game() {
		mcq.plus_counter(mcq.read_counter());
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setFont(new Font("±¼¸²", Font.PLAIN, 20));
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//String q = new String(question.get(mcq.read_counter()));
		//textArea.setText(q);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("Arial", Font.BOLD, 45));
		
		
		textArea_1.setText(question.get(mcq.read_counter()));
		
		JButton btnNewButton = new JButton("1.");
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if(answer.get(mcq.read_counter()).equals("1.") == true)
					mcs.textArea.setBackground(new Color(60,179,113));
				else
					mcs.textArea.setBackground(new Color(178,34,34));
				mcs.frame.setVisible(true);
				frame.setVisible(false);

			}
		});

		JButton btnNewButton_1 = new JButton("2.");
		btnNewButton_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if(answer.get(mcq.read_counter()).equals("2.") == true)
					mcs.textArea.setBackground(new Color(60,179,113));
				else
					mcs.textArea.setBackground(new Color(178,34,34));
				mcs.frame.setVisible(true);
				frame.setVisible(false);

			}
		});

		JButton button = new JButton("3.");
		button.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if(answer.get(mcq.read_counter()).equals("3.") == true)
					mcs.textArea.setBackground(new Color(60,179,113));
				else
					mcs.textArea.setBackground(new Color(178,34,34));
				mcs.frame.setVisible(true);
				frame.setVisible(false);
			}
		});

		JButton button_1 = new JButton("4.");
		button_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if(answer.get(mcq.read_counter()).equals("4.") == true)
					mcs.textArea.setBackground(new Color(60,179,113));
				else
					mcs.textArea.setBackground(new Color(178,34,34));
				mcs.frame.setVisible(true);
				frame.setVisible(false);
			}
		});

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 25));
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Monospaced", Font.PLAIN, 25));

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Monospaced", Font.PLAIN, 25));
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("Monospaced", Font.PLAIN, 25));

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textArea_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
								.addComponent(textArea_3, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
								.addComponent(textArea_4, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
								.addComponent(textArea_5, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 461, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textArea_2)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textArea_3)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textArea_4)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textArea_5)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
					.addGap(37))
		);
		frame.getContentPane().setLayout(groupLayout);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBackground(SystemColor.activeCaption);
		mnMenu.setForeground(SystemColor.controlDkShadow);
		mnMenu.setFont(new Font("Castellar", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to menu");
		mntmGoToMenu.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU home = new MENU();
				home.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mnMenu.add(mntmGoToMenu);

		JMenu mnQuestion = new JMenu("Question");
		mnQuestion.setBackground(SystemColor.info);
		mnQuestion.setForeground(SystemColor.controlDkShadow);
		mnQuestion.setFont(new Font("Castellar", Font.PLAIN, 25));
		menuBar.add(mnQuestion);

		JMenuItem mntmQ = new JMenuItem("No.1");
		mntmQ.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ.setBackground(SystemColor.menu);
		mntmQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(-1);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
			
			}
		});
		mnQuestion.add(mntmQ);

		JMenuItem mntmQ_1 = new JMenuItem("No.2");
		mntmQ_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(0);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_1);

		JMenuItem mntmQ_2 = new JMenuItem("No.3");
		mntmQ_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(1);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_2);

		JMenuItem mntmQ_3 = new JMenuItem("No.4");
		mntmQ_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(2);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mnQuestion.add(mntmQ_3);

		JMenuItem mntmQ_4 = new JMenuItem("No.5");
		mntmQ_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(3);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_4);

		JMenuItem mntmQ_5 = new JMenuItem("No.6");
		mntmQ_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(4);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_5);

		JMenuItem mntmQ_6 = new JMenuItem("No.7");
		mntmQ_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(5);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_6);

		JMenuItem mntmQ_7 = new JMenuItem("No.8");
		mntmQ_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(6);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_7);

		JMenuItem mntmQ_8 = new JMenuItem("No.9");
		mntmQ_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(7);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_8);

		JMenuItem mntmQ_9 = new JMenuItem("No.10");
		mntmQ_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		mntmQ_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(8);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		mnQuestion.add(mntmQ_9);
	}
	
}
