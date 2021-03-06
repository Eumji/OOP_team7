package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.Icon;

public class MultipleChoice_Game extends TestGame {

	JFrame frame;
	JTextArea textArea;
	JLabel lblNewLabel_1;
	private HEART h;
	private MultipleChoice_content mcq;
	private ArrayList<String> question;
	private ArrayList<String> answer;
	private ArrayList<String> mc1;
	private ArrayList<String> mc2;
	private ArrayList<String> mc3;
	private ArrayList<String> mc4;
	private ArrayList<Icon> ht;


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
		mcq = new MultipleChoice_content();
		question = new ArrayList<String>(mcq.question());
		answer = new ArrayList<String>(mcq.answer());
		mc1 = new ArrayList<String>(mcq.mc1());
		mc2 = new ArrayList<String>(mcq.mc2());
		mc3 = new ArrayList<String>(mcq.mc3());
		mc4 = new ArrayList<String>(mcq.mc4());
		h = new HEART();

		ht = new ArrayList<Icon>(h.heart());
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("����", Font.PLAIN, 20));
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblNewLabel_1 = new JLabel("");
		Icon heart = ht.get(h.getheart());
		lblNewLabel_1.setIcon(heart);
		lblNewLabel_1.setBounds(38, 385, 315, 67);
		frame.getContentPane().add(lblNewLabel_1);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.DARK_GRAY);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Arial", Font.BOLD, 45));
		textArea_1.setBounds(14, 12, 954, 458);
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);

		textArea_1.setText(question.get(getMCnum()));

		JButton btnNewButton = new JButton("1.");
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setBounds(14, 499, 61, 72);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (answer.get(getMCnum()).equals("1.") == true) {
					istrue();
				} else {
					isfalse();
				}

			}
		});

		JButton btnNewButton_1 = new JButton("2.");
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setBounds(14, 602, 61, 76);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (answer.get(getMCnum()).equals("2.") == true) {
					istrue();
				} else {
					isfalse();
				}
			}
		});

		JButton button = new JButton("3.");
		button.setBackground(new Color(255, 250, 205));
		button.setBounds(14, 703, 61, 74);
		button.setFont(new Font("Arial", Font.PLAIN, 30));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (answer.get(getMCnum()).equals("3.") == true) {
					istrue();
				} else {
					isfalse();
				}
			}
		});

		JButton button_1 = new JButton("4.");
		button_1.setBackground(new Color(230, 230, 250));
		button_1.setBounds(14, 813, 61, 76);
		button_1.setFont(new Font("Arial", Font.PLAIN, 30));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (answer.get(getMCnum()).equals("4.") == true) {
					istrue();
				} else {
					isfalse();
				}
			}
		});
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(textArea_1);

		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(button);
		frame.getContentPane().add(button_1);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.DARK_GRAY);
		textArea_2.setLineWrap(true);
		textArea_2.setFont(new Font("Arial", Font.PLAIN, 25));
		textArea_2.setBounds(89, 499, 879, 72);
		textArea_2.setEnabled(false);
		textArea_2.setEditable(false);
		textArea_2.setText(mc1.get(getMCnum()));
		frame.getContentPane().add(textArea_2);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.DARK_GRAY);
		textArea_3.setLineWrap(true);
		textArea_3.setFont(new Font("Arial", Font.PLAIN, 25));
		textArea_3.setBounds(89, 602, 879, 76);
		textArea_3.setEnabled(false);
		textArea_3.setEditable(false);
		textArea_3.setText(mc2.get(getMCnum()));
		frame.getContentPane().add(textArea_3);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.DARK_GRAY);
		textArea_4.setLineWrap(true);
		textArea_4.setFont(new Font("Arial", Font.PLAIN, 25));
		textArea_4.setBounds(89, 703, 879, 74);
		textArea_4.setEnabled(false);
		textArea_4.setEditable(false);
		textArea_4.setText(mc3.get(getMCnum()));
		frame.getContentPane().add(textArea_4);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(Color.DARK_GRAY);
		textArea_5.setLineWrap(true);
		textArea_5.setFont(new Font("Arial", Font.PLAIN, 25));
		textArea_5.setBounds(89, 813, 879, 76);
		textArea_5.setEnabled(false);
		textArea_5.setEditable(false);
		textArea_5.setText(mc4.get(getMCnum()));
		frame.getContentPane().add(textArea_5);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBackground(SystemColor.activeCaption);
		mnMenu.setForeground(new Color(0, 0, 0));
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
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
		mnQuestion.setForeground(new Color(0, 0, 0));
		mnQuestion.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnQuestion);

		JMenuItem mntmQ = new JMenuItem("No.1");
		mntmQ.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ.setBackground(SystemColor.menu);
		mntmQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(0);
			}
		});
		mnQuestion.add(mntmQ);

		JMenuItem mntmQ_1 = new JMenuItem("No.2");
		mntmQ_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(1);
			}
		});
		mnQuestion.add(mntmQ_1);

		JMenuItem mntmQ_2 = new JMenuItem("No.3");
		mntmQ_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(2);
			}
		});
		mnQuestion.add(mntmQ_2);

		JMenuItem mntmQ_3 = new JMenuItem("No.4");
		mntmQ_3.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(3);
			}
		});
		mnQuestion.add(mntmQ_3);

		JMenuItem mntmQ_4 = new JMenuItem("No.5");
		mntmQ_4.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(4);
			}
		});
		mnQuestion.add(mntmQ_4);

		JMenuItem mntmQ_5 = new JMenuItem("No.6");
		mntmQ_5.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(5);
			}
		});
		mnQuestion.add(mntmQ_5);

		JMenuItem mntmQ_6 = new JMenuItem("No.7");
		mntmQ_6.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(6);
			}
		});
		mnQuestion.add(mntmQ_6);

		JMenuItem mntmQ_7 = new JMenuItem("No.8");
		mntmQ_7.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(7);
			}
		});
		mnQuestion.add(mntmQ_7);

		JMenuItem mntmQ_8 = new JMenuItem("No.9");
		mntmQ_8.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(8);
			}
		});
		mnQuestion.add(mntmQ_8);

		JMenuItem mntmQ_9 = new JMenuItem("No.10");
		mntmQ_9.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmQ_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go(9);
			}
		});
		mnQuestion.add(mntmQ_9);
	}
	
	@Override
	public void go(int num) {
		setMCnum(num);
		MultipleChoice_Game newMC = new MultipleChoice_Game();
		newMC.frame.setVisible(true);
		frame.setVisible(false);
	}

	@Override
	public void istrue() {
		MultipleChoice_Solution mcs = new MultipleChoice_Solution();
		mcs.textArea.setBackground(new Color(60, 179, 113));
		mcs.textArea.setForeground(Color.BLACK);
		mcs.frame.setVisible(true);
		frame.setVisible(false);
	}
	
	@Override
	public void isfalse() {
		MultipleChoice_Solution mcs = new MultipleChoice_Solution();
		mcs.textArea.setBackground(new Color(178, 34, 34));
		if (h.getheart() == 0) {
			JOptionPane.showMessageDialog(null, "study hard");
			frame.setVisible(false);
			Study study = new Study();
			study.frame.setVisible(true);
		} else {
			h.setheart(h.getheart() - 1);
			mcs.textArea.setForeground(Color.WHITE);
			mcs.frame.setVisible(true);
			frame.setVisible(false);
		}
	}

}
