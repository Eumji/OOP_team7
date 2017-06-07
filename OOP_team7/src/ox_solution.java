import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class ox_solution{

	boolean ox_isCorrect;
	JFrame frame;

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
		
		JTextArea textArea = new JTextArea();
		if(ox_isCorrect == true)
			textArea.setBackground(Color.GREEN);
		else
			textArea.setBackground(Color.RED);
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 30));
		textArea.setBounds(0, 0, 978, 944);
		frame.getContentPane().add(textArea);
	}

}
