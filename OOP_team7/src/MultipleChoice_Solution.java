import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MultipleChoice_Solution {

	boolean mc_isCorrect;

	public boolean isMc_isCorrect() {
		return mc_isCorrect;
	}

	public void setMc_isCorrect(boolean mc_isCorrect) {
		this.mc_isCorrect = mc_isCorrect;
	}

	JFrame frame;
	JTextArea textArea;
	MultipleChoice_Question mcq = new MultipleChoice_Question();
	
	
	private ArrayList<String> solution = new ArrayList<String>(mcq.solution());
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
		TestGame tg = new TestGame();
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		btnNext = new JButton("Next");
		btnNext.setBackground(new Color(0, 0, 0));
		btnNext.setForeground(new Color(255, 255, 255));
		btnNext.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(mcq.read_counter()==10){
					TestGame t = new TestGame();
					t.frame.setVisible(true);
					frame.setVisible(false);
				}
				else{
					MultipleChoice_Game mcg = new MultipleChoice_Game();
					mcg.frame.setVisible(true);
				    frame.setVisible(false);
				}
			}
		});
		
		btnNext.setBounds(786, 788, 167, 97);
		frame.getContentPane().add(btnNext);
		
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 45));
		textArea.setBounds(0, 0, 982, 921);
		
		frame.getContentPane().add(textArea);
		textArea.setText(solution.get(mcq.read_counter()));
		
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
		
		JMenuItem mntmNo = new JMenuItem("No.1");
		mntmNo.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(-1);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo);
		
		JMenuItem mntmNo_1 = new JMenuItem("No.2");
		mntmNo_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(0);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_1);
		
		JMenuItem mntmNo_2 = new JMenuItem("No.3");
		mntmNo_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(1);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_2);
		
		JMenuItem mntmNo_3 = new JMenuItem("No.4");
		mntmNo_3.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(2);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_3);
		
		JMenuItem mntmNo_4 = new JMenuItem("No.5");
		mntmNo_4.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(3);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		
		mnQuestion.add(mntmNo_4);
		
		JMenuItem mntmNo_5 = new JMenuItem("No.6");
		mntmNo_5.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(4);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_5);
		
		JMenuItem mntmNo_6 = new JMenuItem("No.7");
		mntmNo_6.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(5);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_6);
		
		JMenuItem mntmNo_7 = new JMenuItem("No.8");
		mntmNo_7.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(6);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_7);
		
		JMenuItem mntmNo_8 = new JMenuItem("No.9");
		mntmNo_8.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(7);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_8);
		
		JMenuItem mntmNo_9 = new JMenuItem("No.10");
		mntmNo_9.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNo_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcq.plus_counter(8);
				MultipleChoice_Game newMC = new MultipleChoice_Game();
				newMC.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnQuestion.add(mntmNo_9);
		
		if(mc_isCorrect == true)
			textArea.setBackground(new Color(60,179,113));
		else{
		 textArea.setBackground(new Color(178,34,34));
		 
		}
	}
}
