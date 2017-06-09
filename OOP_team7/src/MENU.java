import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MENU extends JFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENU window = new MENU();
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
	public MENU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Bodoni MT Black", Font.PLAIN, 50));

		JButton btnStudy = new JButton("Study");
		btnStudy.setForeground(new Color(0, 0, 0));
		btnStudy.setBackground(new Color(255, 255, 255));
		btnStudy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Study s = new Study();
				s.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnStudy.setFont(new Font("Bell MT", Font.PLAIN, 35));

		JButton btnTestGame = new JButton("Test \r\n\r\nGame");
		btnTestGame.setForeground(new Color(0, 0, 0));
		btnTestGame.setBackground(new Color(255, 255, 255));
		btnTestGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestGame tg = new TestGame();
				tg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnTestGame.setFont(new Font("Bell MT", Font.PLAIN, 30));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(btnStudy, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addComponent(btnTestGame, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addGap(49))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(150, Short.MAX_VALUE)
					.addComponent(lblMenu)
					.addGap(164))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnTestGame, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnStudy, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(227, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
