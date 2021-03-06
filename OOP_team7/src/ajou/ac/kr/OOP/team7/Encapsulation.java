package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Encapsulation extends Study {

	 JFrame frame;

	

	/**
	 * Create the application.
	 */
	public Encapsulation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 1000);
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);

		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MENU m = new MENU();
				m.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMenu.setFont(new Font("Arial", Font.PLAIN, 40));
		btnMenu.setForeground(new Color(30, 144, 255));
		btnMenu.setBackground(new Color(240, 248, 255));

		JLabel lblNewLabel = new JLabel("Encapsulation");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 55));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(17)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 932, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnMenu).addGap(157)
										.addComponent(lblNewLabel)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(12)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnMenu)
								.addComponent(lblNewLabel))
						.addGap(18).addComponent(panel, GroupLayout.PREFERRED_SIZE, 797, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnNewButton = new JButton("Getter & Setter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    GetSet gs = new GetSet();
				gs.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 50));
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("How to Make?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    HowMake hm = new HowMake();
				hm.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(30, 144, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		panel.add(btnNewButton_1);
		contentPane.setLayout(gl_contentPane);
	}

}
