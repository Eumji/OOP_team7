import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Blank_Game extends TestGame {

	JFrame gframe;
	private JTextField textField;
	Blank_question bq;
	Blank_solution bs;
	private HEART h;
	private ArrayList<String> answer;
	private ArrayList<String> solution;
	private ArrayList<Icon> img;
	private ArrayList<Icon> ht;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blank_Game window = new Blank_Game();
					window.gframe.setVisible(true);
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
		h = new HEART();
		bq = new Blank_question();
		answer = new ArrayList<String>(bq.answer());
		solution = new ArrayList<String>(bq.solution());
		img = new ArrayList<Icon>(bq.questionIcon());
		ht = new ArrayList<Icon>(h.heart());

		gframe = new JFrame();
		gframe.setBounds(100, 100, 1000, 1000);
		gframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("");
		Icon image = img.get(getBlanknum());
		lblNewLabel.setIcon(image);

		JLabel lblNewLabel_1 = new JLabel("");

		Icon heart = ht.get(h.getheart());
		lblNewLabel_1.setIcon(heart);

		lblNewLabel.setBackground(Color.DARK_GRAY);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		GroupLayout groupLayout = new GroupLayout(gframe.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE).addGap(38)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addContainerGap().addComponent(panel, GroupLayout.DEFAULT_SIZE, 913,
						Short.MAX_VALUE)));

		JLabel lblAnser = new JLabel("Answer : ");
		lblAnser.setForeground(Color.BLACK);
		lblAnser.setFont(new Font("Arial", Font.BOLD, 45));

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyChar() == '\n') {
					submit();
				}
			}
		});
		textField.setFont(new Font("Arial", Font.BOLD, 35));
		textField.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(255, 255, 255));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				submit();
			}
		});
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 35));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(17).addComponent(lblNewLabel,
						GroupLayout.PREFERRED_SIZE, 919, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup().addGap(38)
						.addComponent(lblAnser, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE).addGap(45)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE).addGap(79)
						.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGap(52))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addContainerGap(21, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
						.addGap(645)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(47)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 556, GroupLayout.PREFERRED_SIZE)
						.addGap(34)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAnser, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))));
		panel.setLayout(gl_panel);
		gframe.getContentPane().setLayout(groupLayout);

		JMenuBar menuBar = new JMenuBar();
		gframe.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setBlanknum(0);
				h.setheart(3);
				MENU m = new MENU();
				gframe.setVisible(false);
				m.frame.setVisible(true);
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

	public void go(int num) {
		setBlanknum(num);
		Blank_Game bg = new Blank_Game();
		bg.gframe.setVisible(true);
		this.gframe.setVisible(false);
	}

	public void submit() {
		bs = new Blank_solution();
		int num = getBlanknum();
		String s = answer.get(num);
		bs.lblNewLabel_1 = new JLabel(solution.get(getBlanknum()));
		bs.lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 45));
		bs.lblNewLabel_1.setBounds(17, 15, 900, 600);
		bs.sframe.getContentPane().add(bs.lblNewLabel_1);

		if (textField.getText().equals(s)) {
			bs.textArea.setBackground(new Color(60, 179, 113));
			bs.textArea.setText(s);

			gframe.setVisible(false);
			bs.sframe.setVisible(true);
		} else {
			if (h.getheart() == 0) {
				h.setheart(3);
				JOptionPane.showMessageDialog(null, "Study hard!");
				gframe.setVisible(false);
				Study study = new Study();
				study.frame.setVisible(true);
			} else {
				h.setheart(h.getheart() - 1);
				bs.textArea.setBackground(new Color(178, 34, 34));
				bs.textArea.setForeground(Color.WHITE);
				bs.textArea.setText(s);

				gframe.setVisible(false);
				bs.sframe.setVisible(true);
			}
		}

	}

}