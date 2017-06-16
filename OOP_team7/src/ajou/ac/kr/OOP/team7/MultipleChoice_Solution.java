package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MultipleChoice_Solution implements Solution{

	boolean mc_isCorrect;
	JFrame frame;
	JTextArea textArea;
	private JButton btnNext;
	private MultipleChoice_content mq;
	private ArrayList<String> solution;
	


	/**
	 * Create the application.
	 */
	public MultipleChoice_Solution() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mq= new MultipleChoice_content();
		solution = new ArrayList<String>(mq.solution());
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNext = new JButton("Next");
		btnNext.setBackground(new Color(0, 0, 0));
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gonext();
			}
		});
		
		btnNext.setBounds(786, 788, 167, 97);
		
		frame.getContentPane().add(btnNext);
		textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '\n') {
					gonext();
				}
			}
		});
		TestGame tg = new TestGame();
		String s = solution.get(tg.getMCnum());
		textArea.setText(s);
		/*btnNext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '\n') {
					gonext();
				}
			}
		});*/
		textArea.setLineWrap(true);
		textArea.setEnabled(true);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 45));
		textArea.setForeground(Color.WHITE);
		textArea.setBounds(0, 0, 982, 921);
		
		frame.getContentPane().add(textArea);
	
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu mnMenu = new JMenu("Menu");
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
		TestGame tg = new TestGame();
		tg.setMCnum(num);
		MultipleChoice_Game newMC = new MultipleChoice_Game();
		newMC.frame.setVisible(true);
		frame.setVisible(false);
	
	}
	
	@Override
	public void gonext(){
		TestGame tg = new TestGame();
		if(tg.getMCnum()==9){
			JOptionPane.showMessageDialog(null, "Congradtulation! You finish Multiple Choice Game:)");	
			tg.frame.setVisible(true);
			frame.setVisible(false);
		}
		else{
			tg.setMCnum(tg.getMCnum()+1);
			MultipleChoice_Game mcg = new MultipleChoice_Game();
			mcg.frame.setVisible(true);
		    frame.setVisible(false);
		}
	}
	
}
