package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class Modifier extends Basic{

	 JFrame frame;


	/**
	 * Create the application.
	 */
	public Modifier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(250, 240, 230));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Go to Menu");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU E= new MENU();
				E.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Basic bm = new Basic();
				bm.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulation Menu");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encapsulation em = new Encapsulation();
				em.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Inheritance Menu");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inheritance im = new Inheritance();
				im.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem_3);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(70, 47, 572, 618);
		panel.setBackground(new Color(255, 250, 250));
		
		JLabel lblNewLabel = new JLabel("Default");
		lblNewLabel.setBounds(652, 41, 77, 31);
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 20));

		JLabel lblNewLabel_2 = new JLabel("Public");
		lblNewLabel_2.setBounds(652, 213, 63, 31);
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Corbel", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Where it can be used");
		lblNewLabel_4.setBounds(652, 389, 211, 31);
		lblNewLabel_4.setForeground(new Color(95, 158, 160));
		lblNewLabel_4.setFont(new Font("Corbel", Font.PLAIN, 20));
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Segoe Print", Font.BOLD, 13));
		textArea.setBackground(new Color(255, 250, 250));
		
		read(textArea);
		contentPane.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.add(panel);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_4);
		
		ImageIcon img = new ImageIcon("default.jpg");
		ImageIcon img2 = new ImageIcon("public.jpg");
		ImageIcon img3 = new ImageIcon("canused.jpg");
		ImageIcon img4 = new ImageIcon("computer.jpg");
		
		JLabel lblNewLabel_1 = new JLabel(img);
		lblNewLabel_1.setBounds(611, 47, 314, 176);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel(img2);
		label.setBounds(632, 231, 291, 164);
		contentPane.add(label);
		
		JLabel lblNewLabel_3 = new JLabel(img3);
		lblNewLabel_3.setBounds(575, 413, 403, 252);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel(img4);
		lblNewLabel_5.setBounds(0, 0, 968, 862);
		contentPane.add(lblNewLabel_5);
	}
	
	@Override
	public void read(JTextArea ta){
		File f = new File("Modifier.txt");
		text(ta, f);
	}
}
