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

public class MENU extends JFrame{

	private JFrame frame;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Bodoni MT Black", Font.PLAIN, 40));
		
		JButton btnStudy = new JButton("Study");
		btnStudy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new TestGame().setVisible(true);
			frame.setVisible(false);
			}
		});
		btnStudy.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		
		JButton btnTestGame = new JButton("Test Game");
		btnTestGame.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(70, Short.MAX_VALUE)
					.addComponent(btnStudy)
					.addGap(64)
					.addComponent(btnTestGame)
					.addGap(46))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(145)
					.addComponent(lblMenu)
					.addContainerGap(152, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMenu)
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnTestGame)
						.addComponent(btnStudy, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(125, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
