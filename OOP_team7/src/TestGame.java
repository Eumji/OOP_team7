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
import java.awt.Color;

public class TestGame extends MENU{

	JFrame frame;
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTestGame = new JLabel("Test Game");
		lblTestGame.setBounds(0, 0, 478, 73);
		lblTestGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestGame.setFont(new Font("Arial Black", Font.PLAIN, 40));
		frame.getContentPane().add(lblTestGame);
		
		JButton btnNewButton = new JButton("OX");
		btnNewButton.setBackground(new Color(153, 204, 204));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//ox ´©¸£¸é
				ox_question oxq = new ox_question();
				oxq.ox_restart();
				ox_Game ox = new ox_Game();
				ox.oxgame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(10, 72, 225, 177);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMC = new JButton("Multiple Choice");
		btnMC.setBackground(new Color(153, 204, 204));
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleChoice mc = new MultipleChoice();
				mc.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMC.setFont(new Font("Arial", Font.BOLD, 24));
		btnMC.setBounds(10, 252, 225, 177);
		frame.getContentPane().add(btnMC);
		
		JButton btnBlank = new JButton("Blank");
		btnBlank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Blank_Game bg = new Blank_Game();
				bg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBlank.setBackground(new Color(153, 204, 204));
		btnBlank.setFont(new Font("Arial", Font.BOLD, 30));
		btnBlank.setBounds(242, 72, 225, 357);
		frame.getContentPane().add(btnBlank);
		
		JButton btnHome = new JButton("menu");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENU home = new MENU();
				home.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnHome.setBackground(new Color(100, 149, 237));
		btnHome.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnHome.setBounds(17, 15, 78, 29);
		frame.getContentPane().add(btnHome);
	}
}
