import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Inheritance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inheritance frame = new Inheritance();
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
	public Inheritance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(100, 149, 237));
		menuBar.setFont(new Font("Arial", Font.PLAIN, 30));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Go to Menu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU m = new MENU();
				m.frame.setVisible(true);
				setVisible(false);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				setVisible(false);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulaiton Menu");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncapsulationMenu em = new EncapsulationMenu();
				em.setVisible(true);
				setVisible(false);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Inheritance Menu");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InheritanceMenu im = new InheritanceMenu();
				im.setVisible(true);
				setVisible(false);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 25));
		mnNewMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(77, 45, 824, 263);
		contentPane.add(panel);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBackground(new Color(240, 248, 255));
		
		File iF = new File("inheritance.txt");

		FileReader ifr;
		try {
			ifr = new FileReader(iF);
			BufferedReader br = new BufferedReader(ifr);

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
				
				File icF = new File("inheritanceCont.txt");

				FileReader icfr;
				try {
					icfr = new FileReader(icF);
					BufferedReader icbr = new BufferedReader(icfr);

					String line;

					do {
						line = icbr.readLine();
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
				
				lblNewLabel.setIcon(img3);
				btnNewButton_1.setVisible(true);
				btnNewButton.setVisible(false);
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);
				textArea.setText(null);
				
				File iF = new File("inheritance.txt");

				FileReader ifr;
				try {
					ifr = new FileReader(iF);
					BufferedReader br = new BufferedReader(ifr);

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
}
