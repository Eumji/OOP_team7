import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Modifier extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modifier frame = new Modifier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Modifier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(250, 240, 230));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Go to Menu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU E= new MENU();
				E.frame.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Previous");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Basic");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Class&Object&method");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Variable");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Variable v = new Variable();
				v.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Encapsultion");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Getter & Setter");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("How to make?");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		
		JLabel lblNewLabel = new JLabel("Default");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		ImageIcon img = new ImageIcon("default.jpg");
		ImageIcon img2 = new ImageIcon("public.jpg");
		ImageIcon img3 = new ImageIcon("canused.jpg");
		
		JLabel lblNewLabel_1 = new JLabel(img);
		lblNewLabel_1.setText("");
		
		JLabel lblNewLabel_2 = new JLabel("Public");
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		JLabel lblNewLabel_3 = new JLabel(img2);
		lblNewLabel_3.setText("");
		
		JLabel lblNewLabel_4 = new JLabel("Where it can be used");
		lblNewLabel_4.setForeground(new Color(95, 158, 160));
		lblNewLabel_4.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		JLabel lblNewLabel_5 = new JLabel(img3);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addContainerGap(166, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(3)
					.addComponent(lblNewLabel_1)
					.addGap(5)
					.addComponent(lblNewLabel_2)
					.addGap(4)
					.addComponent(lblNewLabel_3)
					.addGap(5)
					.addComponent(lblNewLabel_4)
					.addGap(6)
					.addComponent(lblNewLabel_5)
					.addContainerGap(631, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
		);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Segoe Print", Font.BOLD, 13));
		textArea.setBackground(new Color(255, 250, 250));
		
		File VariF = new File("Modifier.txt");

		FileReader Varifr;
		try {
			Varifr = new FileReader(VariF);
			BufferedReader br = new BufferedReader(Varifr);

			String line;

			do {
				line = br.readLine();
				textArea.append(line);
				textArea.append("\n");
				
			} while (line != null);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		textArea.setCaretPosition(0);
		JScrollPane scrollPane = new JScrollPane(textArea);
		//scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}