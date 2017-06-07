import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Study extends MENU{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study window = new Study();
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
	public Study() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblStudy = new JLabel("STUDY");
		lblStudy.setForeground(Color.DARK_GRAY);
		lblStudy.setFont(new Font("Arial", Font.PLAIN, 55));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MENU menu = new MENU();
				menu.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMenu.setBackground(new Color(240, 248, 255));
		btnMenu.setFont(new Font("Arial", Font.PLAIN, 40));
		btnMenu.setForeground(new Color(30, 144, 255));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
							.addGap(213)
							.addComponent(lblStudy)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMenu)
							.addGap(36))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblStudy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn1 = new JButton("class & object & method");

		JButton btn2 = new JButton("Method modifiers");

		JButton btn3 = new JButton("variable");
	
		
		JButton btnNewButton = new JButton("Basic");
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				frame.setVisible(false);
			}
		});
		panel.add(btnNewButton);
		

		JButton btnNewButton_1 = new JButton("Encapsulation");
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.setForeground(new Color(30, 144, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncapsulationMenu em = new EncapsulationMenu();
				em.setVisible(true);
				frame.setVisible(false);

			}
		});
		panel.add(btnNewButton_1);
		frame.getContentPane().setLayout(groupLayout);
	}
}
