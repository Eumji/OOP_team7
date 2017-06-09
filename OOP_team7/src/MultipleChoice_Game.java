import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.Icon;

public class MultipleChoice_Game {

	JFrame frame;
	JTextArea textArea;
	JLabel lblNewLabel_1;
	ArrayList<Icon> img = new ArrayList<>();

	MultipleChoice_Question mcq = new MultipleChoice_Question();
	private ArrayList<String> question = new ArrayList<String>(mcq.question());
	private ArrayList<String> answer = new ArrayList<String>(mcq.answer());
	private ArrayList<String> solution = new ArrayList<String>(mcq.solution());
	private ArrayList<Icon> ht = new ArrayList<Icon>(mcq.heart());

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
		
		// String q = new String(question.get(mcq.read_counter()));
		// textArea.setText(q);

		lblNewLabel_1 = new JLabel("");
		Icon heart = ht.get(mcq.getheart());
		lblNewLabel_1.setIcon(heart);
		lblNewLabel_1.setBounds(38, 385, 315, 67);
		frame.getContentPane().add(lblNewLabel_1);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(14, 12, 954, 458);
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("Arial", Font.BOLD, 45));

		textArea_1.setText(question.get(mcq.read_counter()));

		JButton btnNewButton = new JButton("1.");
		btnNewButton.setBounds(14, 499, 61, 72);
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(mcq.read_counter()).equals("1.") == true) {
					mcs.textArea.setBackground(new Color(60, 179, 113));
					mcs.frame.setVisible(true);
					frame.setVisible(false);
				} else {
					mcs.textArea.setBackground(new Color(178, 34, 34));
					if (mcq.getheart() == 0) {
						mcq.setheart(3);
						JOptionPane.showMessageDialog(null, "study hard");
						frame.setVisible(false);
						Study study = new Study();
						study.frame.setVisible(true);
					} else {
						mcq.setheart(mcq.getheart() - 1);
						mcs.frame.setVisible(true);
						frame.setVisible(false);
					}

				}

			}
		});

		JButton btnNewButton_1 = new JButton("2.");
		btnNewButton_1.setBounds(14, 602, 61, 76);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(mcq.read_counter()).equals("2.") == true) {
					mcs.textArea.setBackground(new Color(60, 179, 113));
					mcs.frame.setVisible(true);
					frame.setVisible(false);
				} else {
					mcs.textArea.setBackground(new Color(178, 34, 34));
					if (mcq.getheart() == 0) {
						mcq.setheart(3);
						JOptionPane.showMessageDialog(null, "study hard");
						frame.setVisible(false);
						Study study = new Study();
						study.frame.setVisible(true);
					} else {
						mcq.setheart(mcq.getheart() - 1);
						mcs.frame.setVisible(true);
						frame.setVisible(false);
					}
				}
			}
		});

		JButton button = new JButton("3.");
		button.setBounds(14, 703, 61, 74);
		button.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(mcq.read_counter()).equals("3.") == true) {
					mcs.textArea.setBackground(new Color(60, 179, 113));
					mcs.frame.setVisible(true);
					frame.setVisible(false);
				} else {
					mcs.textArea.setBackground(new Color(178, 34, 34));
					if (mcq.getheart() == 0) {
						mcq.setheart(3);
						JOptionPane.showMessageDialog(null, "study hard");
						frame.setVisible(false);
						Study study = new Study();
						study.frame.setVisible(true);
					} else {
						mcq.setheart(mcq.getheart() - 1);
						mcs.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
			}
		});

		JButton button_1 = new JButton("4.");
		button_1.setBounds(14, 813, 61, 76);
		button_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice_Solution mcs = new MultipleChoice_Solution();
				if (answer.get(mcq.read_counter()).equals("4.") == true) {
					mcs.textArea.setBackground(new Color(60, 179, 113));
					mcs.frame.setVisible(true);
					frame.setVisible(false);
				} else {
					mcs.textArea.setBackground(new Color(178, 34, 34));
					if (mcq.getheart() == 0) {
						mcq.setheart(3);
						JOptionPane.showMessageDialog(null, "study hard");
						frame.setVisible(false);
						Study study = new Study();
						study.frame.setVisible(true);
					} else {
						mcq.setheart(mcq.getheart() - 1);
						mcs.frame.setVisible(true);
						frame.setVisible(false);
					}
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
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 30));
		textArea_2.setBounds(89, 499, 879, 72);
		frame.getContentPane().add(textArea_2);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(89, 602, 879, 76);
		frame.getContentPane().add(textArea_3);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(89, 703, 879, 74);
		frame.getContentPane().add(textArea_4);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(89, 813, 879, 76);
		frame.getContentPane().add(textArea_5);

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
