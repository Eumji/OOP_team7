import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Variable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variable frame = new Variable();
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
	public Variable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(32, 178, 170));
		menuBar.setBackground(new Color(250, 240, 230));
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
		mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MENU m = new MENU();
				m.frame.setVisible(true);
				setVisible(false);
			}
		});
		mnMenu.add(mntmGoToMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				setVisible(false);

			}
		});
		mnMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulation Menu");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncapsulationMenu em = new EncapsulationMenu();
				em.setVisible(true);
				setVisible(false);
			}
		});
		mnMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Inheritance Menu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InheritanceMenu im = new InheritanceMenu();
				im.setVisible(true);
				setVisible(false);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 25));
		mnMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setForeground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
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

		File VariF = new File("Variable.txt");

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
		contentPane.setLayout(null);
		
		textArea.setCaretPosition(0);
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
				
				File VariF = new File("VariableCont.txt");

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
				
				File VariF = new File("Variable.txt");

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
}
