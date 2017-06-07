import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

public class ox_Game {

	JFrame oxgame;
	JButton button, button_1;
	JTextArea textArea;
	int counter = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ox_Game window = new ox_Game();
					window.oxgame.setVisible(true);
					//window.question();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public ox_Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		oxgame = new JFrame();
		oxgame.setBounds(100, 100, 1000, 1000);
		oxgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.LIGHT_GRAY);
		oxgame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton button = new JButton("O");
		button.setForeground(Color.GREEN);
		button.setFont(new Font("Arial Black", Font.PLAIN, 250));
		button.setBackground(Color.BLACK);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.BOLD, 50));
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.DARK_GRAY);
		
		JButton button_2 = new JButton("X");
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 250));
		button_2.setBackground(Color.BLACK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(92)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 895, GroupLayout.PREFERRED_SIZE)
					.addGap(35))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(41)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		panel.setLayout(gl_panel);
		
		/*ox_question question = new ox_question();
		textArea.setText(question.ox_quiz.get(counter));*/
		
	}
}
