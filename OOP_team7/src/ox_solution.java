import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ox_solution{

	boolean ox_isCorrect;
	private ox_question oxq = new ox_question();
	ox_Game oxg = new ox_Game();
	

	JFrame frame;
	JTextArea textArea;
	private JMenuBar menuBar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ox_solution window = new ox_solution();
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
	public ox_solution() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//oxq.plus_counter(oxq.read_counter());
				System.out.println("counter afer clicked next: "+oxq.read_counter());
				oxg.oxgame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(829, 845, 132, 53);
		frame.getContentPane().add(btnNewButton);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 40));
		textArea.setBounds(0, 0, 978, 944);
		
		frame.getContentPane().add(textArea);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
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
				frame.setVisible(false);
				oxq.ox_restart(); System.out.println("Restart!");
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
