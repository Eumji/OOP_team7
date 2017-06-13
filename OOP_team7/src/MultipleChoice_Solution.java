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
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MultipleChoice_Solution extends MultipleChoice_Game{

	boolean mc_isCorrect;
	JFrame frame;
	JTextArea textArea;
	private JButton btnNext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultipleChoice_Solution window = new MultipleChoice_Solution();
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
	public MultipleChoice_Solution() {
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
		btnNext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '\n') {
					gonext();
				}
			}
		});
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 45));
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
		
		if(mc_isCorrect == true)
			textArea.setBackground(new Color(60,179,113));
		else{
		 textArea.setBackground(new Color(178,34,34));
		}
	}
	
	@Override
	public void go(int num) {
		
		setMCnum(num);
		MultipleChoice_Game newMC = new MultipleChoice_Game();
		newMC.frame.setVisible(true);
		frame.setVisible(false);
	
	}
	
	public void gonext(){
		if(getMCnum()==9){
			JOptionPane.showMessageDialog(null, "Congradtulation! You finish Multiple Choice Game:)");	
			TestGame t = new TestGame();
			t.frame.setVisible(true);
			frame.setVisible(false);
		}
		else{
			setMCnum(getMCnum()+1);
			MultipleChoice_Game mcg = new MultipleChoice_Game();
			mcg.frame.setVisible(true);
		    frame.setVisible(false);
		}
	}
	
}
