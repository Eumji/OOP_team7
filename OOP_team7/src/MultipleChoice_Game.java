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

public class MultipleChoice_Game {

	JFrame frame;
	JTextArea textArea;
	MultipleChoice_Question mcq = new MultipleChoice_Question();
	private ArrayList<String> question = new ArrayList<String>(mcq.question());
	private ArrayList<String> answer = new ArrayList<String>(mcq.answer());
	private ArrayList<String> solution = new ArrayList<String>(mcq.solution());
	int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		//System.out.println(count);
		textArea_1.setText(question.get(count));
		//System.out.println("q" + count);
		JButton btnNewButton = new JButton("1.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(count).equals("1.")) {
					//System.out.println("a" + count);
					mcs.textArea.setBackground(Color.GREEN);
				} else
					mcs.textArea.setBackground(Color.RED);
				mcs.frame.setVisible(true);
				frame.setVisible(false);

			}
		});

		JButton btnNewButton_1 = new JButton("2.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(count).equals("2."))
					mcs.textArea.setBackground(Color.GREEN);
				else
					mcs.textArea.setBackground(Color.RED);

				mcs.frame.setVisible(true);
				frame.setVisible(false);

			}
		});

		JButton button = new JButton("3.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(count).equals("3."))
					mcs.textArea.setBackground(Color.GREEN);
				else
					mcs.textArea.setBackground(Color.RED);
				mcs.frame.setVisible(true);
				frame.setVisible(false);
			}
		});

		JButton button_1 = new JButton("4.");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(count).equals("4."))
					mcs.textArea.setBackground(Color.GREEN);
				else
					mcs.textArea.setBackground(Color.RED);
				mcs.frame.setVisible(true);
				frame.setVisible(false);
			}
		});

		JTextArea textArea_2 = new JTextArea();

		JTextArea textArea_3 = new JTextArea();

		JTextArea textArea_4 = new JTextArea();

		JTextArea textArea_5 = new JTextArea();

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup().addComponent(button)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(textArea_4,
												GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button_1).addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(textArea_5, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnNewButton_1).addComponent(btnNewButton))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textArea_3, GroupLayout.DEFAULT_SIZE, 401,
														Short.MAX_VALUE)
												.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 401,
														Short.MAX_VALUE))))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE).addGap(37)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton).addComponent(
						textArea_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton_1).addComponent(
						textArea_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button).addComponent(
						textArea_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button_1).addComponent(
						textArea_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(14, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to menu");
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU home = new MENU();
				home.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mnMenu.add(mntmGoToMenu);

		JMenu mnQuestion = new JMenu("Question");
		menuBar.add(mnQuestion);

		JMenuItem mntmQ = new JMenuItem("Q1");
		mnQuestion.add(mntmQ);

		JMenuItem mntmQ_1 = new JMenuItem("Q2");
		mnQuestion.add(mntmQ_1);

		JMenuItem mntmQ_2 = new JMenuItem("Q3");
		mnQuestion.add(mntmQ_2);

		JMenuItem mntmQ_3 = new JMenuItem("Q4");
		mnQuestion.add(mntmQ_3);

		JMenuItem mntmQ_4 = new JMenuItem("Q5");
		mnQuestion.add(mntmQ_4);

		JMenuItem mntmQ_5 = new JMenuItem("Q6");
		mnQuestion.add(mntmQ_5);

		JMenuItem mntmQ_6 = new JMenuItem("Q7");
		mnQuestion.add(mntmQ_6);

		JMenuItem mntmQ_7 = new JMenuItem("Q8");
		mnQuestion.add(mntmQ_7);

		JMenuItem mntmQ_8 = new JMenuItem("Q9");
		mnQuestion.add(mntmQ_8);

		JMenuItem mntmQ_9 = new JMenuItem("Q10");
		mnQuestion.add(mntmQ_9);
	}
}
