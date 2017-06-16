package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


import javax.swing.GroupLayout;
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
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Variable extends Basic {

	 JFrame frame;

	 File f = new File("");

	/**
	 * Create the application.
	 */
	public Variable() {
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
		menuBar.setForeground(new Color(32, 178, 170));
		menuBar.setBackground(new Color(250, 240, 230));
		frame.setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MENU m = new MENU();
				m.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mnMenu.add(mntmGoToMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Basic bm = new Basic();
				bm.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		mnMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulation Menu");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encapsulation em = new Encapsulation();
				em.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mnMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Inheritance Menu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inheritance im = new Inheritance();
				im.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 25));
		mnMenu.add(mntmNewMenuItem);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setForeground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
	
		JPanel panel = new JPanel();
		panel.setBounds(73, 41, 828, 340);
		panel.setBackground(new Color(255, 255, 240));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(250, 240, 230));
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		panel.add(textArea);

		f = new File("Variable.txt");
		read(textArea);

		contentPane.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 826, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		contentPane.add(panel);
		
		ImageIcon img = new ImageIcon("variable.JPG");
		ImageIcon img2 = new ImageIcon("variableCont.jpg");
		ImageIcon img3 = new ImageIcon("computer.jpg");
		
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(73, 383, 828, 289);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("NEXT");
		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.setVisible(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				
				f = new File("VariableCont.txt");

				read(textArea);
				
				lblNewLabel.setIcon(img2);
				btnNewButton_1.setVisible(true);
				btnNewButton.setVisible(false);
			}
		});
		
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 30));
		btnNewButton.setBounds(781, 677, 120, 43);
		contentPane.add(btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(null);
				
				f = new File("Variable.txt");
				
				read(textArea);
				
				lblNewLabel.setIcon(img);
				btnNewButton.setVisible(true);
				btnNewButton_1.setVisible(false);

			}
		});
		
		
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 30));
		btnNewButton_1.setBounds(712, 677, 191, 43);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(img3);
		lblNewLabel_1.setBounds(0, 0, 968, 862);
		contentPane.add(lblNewLabel_1);
	}
	
	@Override
	public void read(JTextArea ta){
		text(ta, f);
	}
	
}
