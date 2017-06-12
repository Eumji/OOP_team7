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

public class Study extends JFrame{

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
							.addComponent(lblStudy, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnMenu)
							.addGap(6)))
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		
		JButton btnNewButton = new JButton("Basic");
		btnNewButton.setBounds(2, 2, 444, 739);
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
		

		JButton btnNewButton_1 = new JButton("Encapsulation");
		btnNewButton_1.setBounds(448, 2, 488, 362);
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
		
		JButton btnNewButton_2 = new JButton("Inheritance");
		btnNewButton_2.setBackground(new Color(240, 248, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InheritanceMenu im = new InheritanceMenu();
				im.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setForeground(new Color(30, 144, 255));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton_2.setBounds(448, 363, 488, 378);
		panel.setLayout(null);
		panel.add(btnNewButton);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		frame.getContentPane().setLayout(groupLayout);
	}
}
