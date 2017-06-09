import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ox_Game extends TestGame {

	JFrame oxgame;
	JButton button, button_1;
	JTextArea textArea;
	private ox_question oxq = new ox_question();
	int heart = 0;
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
					ox_question ooxq = new ox_question();
					ooxq.ox_restart();
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
		oxq.plus_counter(oxq.read_counter());
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

		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 36, 901, 462);
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.BOLD, 50));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.DARK_GRAY);
		String q = new String(question.get(oxq.read_counter()));
		textArea.setText(q);

		// 하트 띠우기
		ImageIcon img4 = new ImageIcon("heart4.png");
		ImageIcon img3 = new ImageIcon("heart3.png");
		ImageIcon img2 = new ImageIcon("heart2.png");
		ImageIcon img1 = new ImageIcon("heart1.png");
		JLabel hearticon = new JLabel(img4);

		switch (heart) {
		case 3:
			hearticon = new JLabel(img3);
			break;
		case 2:
			hearticon = new JLabel(img2);
			break;
		case 1:
			hearticon = new JLabel(img1);
			break;
		case 0:
			//study = true;
		default:
			break;
		}
		hearticon.setBounds(39, 413, 354, 85);
		panel.add(hearticon);
		panel.add(textArea);

		JButton button = new JButton("O");
		button.setBounds(97, 532, 342, 334);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// "O" 눌렀을 때
				ox_solution oxs = new ox_solution();
				if (answer.get(oxq.read_counter()).equals("O"))
					oxs.textArea.setBackground(new Color(60, 179, 113));

				else {
					oxs.textArea.setForeground(new Color(255, 250, 250));
					oxs.textArea.setBackground(new Color(178, 34, 34));
				}

				oxs.textArea.setText(solution.get(oxq.read_counter()));
				oxs.frame.setVisible(true);
				oxgame.setVisible(false);
				/*if (study == true) {
					JOptionPane.showMessageDialog(null, "Study Hard!!!!!", "Notice", JOptionPane.INFORMATION_MESSAGE);
					BasicMenu basic = new BasicMenu();
					basic.setVisible(true);
					frame.setVisible(false);
				}*/
			}
		});
		button.setForeground(Color.GREEN);
		button.setFont(new Font("Arial Black", Font.PLAIN, 250));
		button.setBackground(Color.BLACK);

		JButton button_2 = new JButton("X");
		button_2.setBounds(542, 532, 342, 334);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// "X" 눌렀을 때
				ox_solution oxs = new ox_solution();
				if (answer.get(oxq.read_counter()).equals("X"))
					oxs.textArea.setBackground(new Color(60, 179, 113));
				else {
					oxs.textArea.setForeground(new Color(255, 250, 250));
					oxs.textArea.setBackground(new Color(178, 34, 34));
				}

				oxs.textArea.setText(solution.get(oxq.read_counter()));
				oxs.frame.setVisible(true);
				oxgame.setVisible(false);
				/*if (study == true) {
					JOptionPane.showMessageDialog(null, "Study Hard!!!!!", "Notice", JOptionPane.INFORMATION_MESSAGE);
					BasicMenu basic = new BasicMenu();
					basic.setVisible(true);
					frame.setVisible(false);
				}*/
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 250));
		button_2.setBackground(Color.BLACK);
		panel.setLayout(null);
		panel.add(button);
		panel.add(button_2);

		JMenuBar menuBar = new JMenuBar();
		oxgame.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 25));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 20));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// menu로 돌아가기
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
		mntmNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				oxq.plus_counter(-1);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo);

		JMenuItem mntmNo_1 = new JMenuItem("No.2");
		mntmNo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(0);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_1.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_1);

		JMenuItem mntmNo_2 = new JMenuItem("No.3");
		mntmNo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(1);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_2.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_2);

		JMenuItem mntmNo_3 = new JMenuItem("No.4");
		mntmNo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(2);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_3.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_3);

		JMenuItem mntmNo_4 = new JMenuItem("No.5");
		mntmNo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(3);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_4.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_4);

		JMenuItem mntmNo_5 = new JMenuItem("No.6");
		mntmNo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(4);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_5.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_5);

		JMenuItem mntmNo_6 = new JMenuItem("No.7");
		mntmNo_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(5);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_6.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_6);

		JMenuItem mntmNo_7 = new JMenuItem("No.8");
		mntmNo_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(6);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_7.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_7);

		JMenuItem mntmNo_8 = new JMenuItem("No.9");
		mntmNo_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(7);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_8.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_8);

		JMenuItem mntmNo_9 = new JMenuItem("No.10");
		mntmNo_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oxq.plus_counter(8);
				ox_Game newOX = new ox_Game();
				newOX.oxgame.setVisible(true);
				oxgame.setVisible(false);
			}
		});
		mntmNo_9.setFont(new Font("Arial", Font.PLAIN, 20));
		mnQuestion.add(mntmNo_9);

	}
}
