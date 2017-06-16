package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class InheritanceConcept extends Inheritance{

	 JFrame frame;
	 File f = new File("");

	/**
	 * Create the application.
	 */
	public InheritanceConcept() {
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
		menuBar.setBackground(new Color(100, 149, 237));
		menuBar.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Go to Menu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU m = new MENU();
				m.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Basic bm = new Basic();
				bm.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulaiton Menu");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encapsulation em = new Encapsulation();
				em.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 25));
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(77, 45, 824, 263);
		contentPane.add(panel);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBackground(new Color(240, 248, 255));
		
		f = new File("inheritance.txt");
		read(textArea);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scroll, GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scroll, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		ImageIcon img = new ImageIcon("inheritance.jpg");
		ImageIcon img3 = new ImageIcon("inheritanceCont.jpg");
		ImageIcon img2 = new ImageIcon("computer.jpg");
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(68, 311, 819, 343);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 30));
		btnNewButton.setBounds(767, 673, 122, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(null);
				
				f = new File("inheritanceCont.txt");

				read(textArea);
				
				lblNewLabel.setIcon(img3);
				btnNewButton_1.setVisible(true);
				btnNewButton.setVisible(false);
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);
				textArea.setText(null);
				
				f = new File("Inheritance.txt");
				read(textArea);
				
				lblNewLabel.setIcon(img);
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(false);

				
			}
		});
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 30));
		btnNewButton_1.setBounds(719, 673, 182, 43);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(img2);
		lblNewLabel_1.setBounds(0, 0, 968, 862);
		contentPane.add(lblNewLabel_1);
	}
	
	@Override
	public void read(JTextArea textArea){
		text(textArea,f);
	}
	
}
