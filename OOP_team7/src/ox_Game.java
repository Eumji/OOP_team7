import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
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
	private ox_content oxq;
	private ArrayList<String> question;
	private ArrayList<String> answer;
	private ArrayList<String> solution;
	private HEART h;
	private ArrayList<Icon> ht;



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

		h = new HEART();
		ht = new ArrayList<Icon>(h.heart());
		oxq = new ox_content();
		question = new ArrayList<String>(oxq.question());
		answer = new ArrayList<String>(oxq.answer());
		solution = new ArrayList<String>(oxq.solution());

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
		String q = new String(question.get(getOXnum()));
		textArea.setText(q);

		// 하트 띠우기
		Icon heart = ht.get(h.getheart());
		JLabel hearticon = new JLabel(heart);
		hearticon.setBounds(39, 413, 354, 85);
		panel.add(hearticon);
		panel.add(textArea);

		JButton button = new JButton("O");
		button.setBounds(97, 532, 342, 334);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// "O" 눌렀을 때
				if (answer.get(getOXnum()).equals("O"))
					istrue();
				else
					isfalse();
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
				if (answer.get(getOXnum()).equals("X"))
					istrue();
				else
					isfalse();

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
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
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
		mnQuestion.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnQuestion);

		JMenuItem mntmNo = new JMenuItem("No.1");
		mntmNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				go(0);
			}
		});
		mntmNo.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo);

		JMenuItem mntmNo_1 = new JMenuItem("No.2");
		mntmNo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(1);
			}
		});
		mntmNo_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_1);

		JMenuItem mntmNo_2 = new JMenuItem("No.3");
		mntmNo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(2);
			}
		});
		mntmNo_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_2);

		JMenuItem mntmNo_3 = new JMenuItem("No.4");
		mntmNo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(3);
			}
		});
		mntmNo_3.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_3);

		JMenuItem mntmNo_4 = new JMenuItem("No.5");
		mntmNo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(4);
			}
		});
		mntmNo_4.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_4);

		JMenuItem mntmNo_5 = new JMenuItem("No.6");
		mntmNo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(5);
			}
		});
		mntmNo_5.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_5);

		JMenuItem mntmNo_6 = new JMenuItem("No.7");
		mntmNo_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(6);
			}
		});
		mntmNo_6.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_6);

		JMenuItem mntmNo_7 = new JMenuItem("No.8");
		mntmNo_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(7);
			}
		});
		mntmNo_7.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_7);

		JMenuItem mntmNo_8 = new JMenuItem("No.9");
		mntmNo_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(8);
			}
		});
		mntmNo_8.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_8);

		JMenuItem mntmNo_9 = new JMenuItem("No.10");
		mntmNo_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(9);
			}
		});
		mntmNo_9.setFont(new Font("Arial", Font.PLAIN, 25));
		mnQuestion.add(mntmNo_9);

	}

	@Override
	public void go(int num) {
		setOXnum(num);
		ox_Game newOX = new ox_Game();
		newOX.oxgame.setVisible(true);
		oxgame.setVisible(false);
	}

	@Override
	public void istrue() {
		ox_solution oxs = new ox_solution();
		oxs.textArea.setBackground(new Color(60, 179, 113));
		oxs.textArea.setForeground(Color.BLACK);
		oxs.frame_this.setVisible(true);
		oxgame.setVisible(false);
	}

	@Override
	public void isfalse() {
		ox_solution oxs = new ox_solution();
		if (h.getheart() == 0) {
			JOptionPane.showMessageDialog(null, "Study Hard!!");
			oxgame.setVisible(false);
			Study study = new Study();
			study.frame.setVisible(true);
		} else {
			h.setheart(h.getheart() - 1);
			oxs.textArea.setForeground(new Color(255, 250, 250));
			oxs.textArea.setBackground(new Color(178, 34, 34));
			oxs.frame_this.setVisible(true);
			oxgame.setVisible(false);

		}
	}
}
