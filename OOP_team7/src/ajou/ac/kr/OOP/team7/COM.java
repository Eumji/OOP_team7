package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;

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
import javax.swing.border.EmptyBorder;

public class COM extends Basic{

	 JFrame frame;


	/**
	 * Create the application.
	 */
	public COM() {
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
				MENU M = new MENU();
				M.frame.setVisible(true);
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
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(255, 255, 240));
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		read(textArea);
		contentPane.setLayout(null);
		
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(84, 46, 815, 298);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(jsp);
		

		ImageIcon img = new ImageIcon("computer.jpg");
		ImageIcon img2 = new ImageIcon("Class.jpg");
		ImageIcon img3 = new ImageIcon("object.jpg");
		ImageIcon img4 = new ImageIcon("TvClass.jpg");
		ImageIcon img5 = new ImageIcon("tvtest.jpg");
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(84, 349, 137, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Object");
		lblNewLabel_2.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(84, 534, 137, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(img2);
		lblNewLabel_3.setBounds(62, 397, 158, 157);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Example> TV");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(479, 349, 137, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tv's property(State) : Size, channel, volume");
		lblNewLabel_5.setForeground(new Color(30, 144, 255));
		lblNewLabel_5.setFont(new Font("Corbel", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(479, 369, 399, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tv's function(Behavior) : ChangeChannel, VoulumeUp&Down");
		lblNewLabel_6.setForeground(new Color(30, 144, 255));
		lblNewLabel_6.setFont(new Font("Corbel", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(479, 390, 399, 35);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Class \"Student\" of object are me, you, and school students.");
		lblNewLabel_7.setForeground(new Color(30, 144, 255));
		lblNewLabel_7.setFont(new Font("Corbel", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(84, 557, 358, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Class \"Student\" has variables studentID, Name, gender,");
		lblNewLabel_8.setForeground(new Color(30, 144, 255));
		lblNewLabel_8.setFont(new Font("Corbel", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(84, 369, 364, 35);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("major and a method work().");
		lblNewLabel_9.setForeground(new Color(30, 144, 255));
		lblNewLabel_9.setFont(new Font("Corbel", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(84, 390, 230, 35);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(img3);
		lblNewLabel_10.setBounds(31, 534, 328, 173);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(img4);
		lblNewLabel_11.setBounds(415, 409, 307, 173);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel(img5);
		lblNewLabel_12.setBounds(603, 397, 322, 206);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblNewLabel.setBounds(14, 5, 949, 852);
		contentPane.add(lblNewLabel);
	}
	
	@Override
	public void read(JTextArea ta){
		File f = new File("COM.txt");
		text(ta,f);
	}
}


