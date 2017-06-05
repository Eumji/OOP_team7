import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TestGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGame window = new TestGame();
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
	public TestGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTestGame = new JLabel("Test Game");
		lblTestGame.setBounds(0, 0, 478, 73);
		lblTestGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestGame.setFont(new Font("Arial Black", Font.PLAIN, 40));
		frame.getContentPane().add(lblTestGame);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\\uC6D0\uC815\uC5F0\\Desktop\\OX.png"));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 72, 225, 177);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMatchingGame = new JButton("");
		btnMatchingGame.setIcon(new ImageIcon("C:\\Users\\\uC6D0\uC815\uC5F0\\Desktop\\Matching.png"));
		btnMatchingGame.setFont(new Font("Arial", Font.BOLD, 30));
		btnMatchingGame.setBounds(10, 252, 225, 177);
		frame.getContentPane().add(btnMatchingGame);
		
		JButton btnBlank = new JButton("Blank");
		btnBlank.setFont(new Font("Arial", Font.BOLD, 30));
		btnBlank.setBounds(242, 72, 225, 357);
		frame.getContentPane().add(btnBlank);
	}
}
