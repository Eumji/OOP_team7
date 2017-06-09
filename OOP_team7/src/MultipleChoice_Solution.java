import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnNext.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(mcq.read_counter()==11){
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
		
		btnNext.setBounds(789, 824, 167, 97);
		frame.getContentPane().add(btnNext);
		
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 45));
		textArea.setBounds(0, 0, 982, 953);
		
		frame.getContentPane().add(textArea);
		textArea.setText(solution.get(mcq.read_counter()));
		
		if(mc_isCorrect == true)
			textArea.setBackground(new Color(60,179,113));
		else{
		 textArea.setBackground(new Color(178,34,34));
		 
		}
	}

}
