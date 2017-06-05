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

public class ox_Game {

	JFrame oxgame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ox_Game window = new ox_Game();
					window.oxgame.setVisible(true);
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
		oxgame.setBounds(100, 100, 500, 500);
		oxgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.LIGHT_GRAY);
		oxgame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton button = new JButton("O");
		button.setForeground(Color.GREEN);
		button.setFont(new Font("Arial Black", Font.PLAIN, 99));
		button.setBackground(Color.BLACK);
		
		JButton button_1 = new JButton("X");
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Arial Black", Font.PLAIN, 99));
		button_1.setBackground(Color.BLACK);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.GRAY);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 478, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(41)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(46))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 444, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		panel.setLayout(gl_panel);
	}

}
