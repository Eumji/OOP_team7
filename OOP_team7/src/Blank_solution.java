import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Blank_solution implements Solution{

	private Blank_content bq;
	private ArrayList<String> solution;
	JTextArea textArea;
	
	JFrame sframe;
	private JMenuBar menuBar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blank_solution window = new Blank_solution();
					window.sframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Blank_solution() {
		initialize();
	}

	/**
	 * Initialize the contents of the sFrame.
	 */
	private void initialize() {
		bq = new Blank_content();
		solution = new ArrayList<String>(bq.solution());
		
		sframe = new JFrame();
		sframe.setBounds(100, 100, 1000, 1000);
		sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sframe.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Next");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gonext();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(829, 845, 132, 53);
		sframe.getContentPane().add(btnNewButton);
		TestGame tg = new TestGame();
		textArea = new JTextArea();
		String s = solution.get(tg.getBlanknum());
		textArea.setText(s);
		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '\n') {
					gonext();
				}
			}
		});
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 45));
		textArea.setBounds(0, 0, 1000, 1000);
		sframe.getContentPane().add(textArea);

		menuBar = new JMenuBar();
		sframe.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// menu로 돌아가기
				TestGame tg = new TestGame();
				tg.setBlanknum(0);
				MENU home = new MENU();
				home.frame.setVisible(true);
				sframe.setVisible(false);
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


	}

	@Override
	public void go(int num){ 
		TestGame tg = new TestGame();
		tg.setBlanknum(num); 
		Blank_Game bg = new
		Blank_Game(); 
		bg.gframe.setVisible(true); 
		sframe.setVisible(false); 
	}
	
	@Override
	public void gonext() {
		TestGame tg = new TestGame();
		if (tg.getBlanknum() == 9) {
			JOptionPane.showMessageDialog(null, "Congradtulation! You finish Blank Game:)");	
			tg.setBlanknum(0);
			tg.frame.setVisible(true);
			sframe.setVisible(false);
		} else {
			tg.setBlanknum(tg.getBlanknum() + 1);
			sframe.setVisible(false);
			Blank_Game bg = new Blank_Game();
			bg.gframe.setVisible(true);
		}
	}

}