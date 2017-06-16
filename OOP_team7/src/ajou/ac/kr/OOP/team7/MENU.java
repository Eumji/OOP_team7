package ajou.ac.kr.OOP.team7;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MENU extends JFrame {

	JFrame frame;
	private TestGame tg;
	private Study s;



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
		tg = new TestGame();
		s = new Study();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Bauhaus 93", Font.PLAIN, 99));

		JButton btnStudy = new JButton("Study");
		btnStudy.setForeground(new Color(0, 0, 0));
		btnStudy.setBackground(new Color(255, 255, 255));
		btnStudy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnStudy.setFont(new Font("Arial", Font.PLAIN, 70));

		JButton btnTestGame = new JButton("Test \r\n\r\nGame");
		btnTestGame.setForeground(new Color(0, 0, 0));
		btnTestGame.setBackground(new Color(255, 255, 255));
		btnTestGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnTestGame.setFont(new Font("Arial", Font.PLAIN, 70));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnStudy, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnTestGame, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
							.addGap(313))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnTestGame, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnStudy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
