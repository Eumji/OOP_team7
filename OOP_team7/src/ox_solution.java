import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;

public class ox_solution{

	boolean ox_isCorrect;
	public boolean isOx_isCorrect() {
		return ox_isCorrect;
	}

	public void setOx_isCorrect(boolean ox_isCorrect) {
		this.ox_isCorrect = ox_isCorrect;
	}

	JFrame frame;
	JTextArea textArea;
	

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
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(829, 876, 132, 53);
		frame.getContentPane().add(btnNewButton);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 40));
		textArea.setBounds(0, 0, 978, 944);
		
		frame.getContentPane().add(textArea);
		
		
		
	}

}
