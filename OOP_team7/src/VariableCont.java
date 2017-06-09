import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VariableCont extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VariableCont frame = new VariableCont();
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
	public VariableCont() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(250, 240, 230));
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Go to Menu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU D = new MENU();
				D.frame.setVisible(true);
				setVisible(false);
				
			}
		});
		mnMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				setVisible(false);
			}
		});
		mnMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulation Menu");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncapsulationMenu em = new EncapsulationMenu();
				em.setVisible(true);
				setVisible(false);
			}
		});
		mnMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu = new JMenu("Previous");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u2190");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Variable v = new Variable();
				v.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(84, 51, 804, 331);
		panel.setBackground(new Color(245, 255, 250));
		
		JLabel lblNewLabel = new JLabel("Casting");
		lblNewLabel.setBounds(84, 394, 78, 31);
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2 = new JLabel("Variable types according to declaration");
		lblNewLabel_2.setBounds(416, 394, 397, 31);
		lblNewLabel_2.setForeground(new Color(0, 191, 255));
		lblNewLabel_2.setFont(new Font("Corbel", Font.PLAIN, 25));
		
	
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 18));
		textArea.setBackground(new Color(230, 230, 250));
		
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
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		contentPane.add(panel);
		
		ImageIcon img = new ImageIcon("cast.jpg");
		ImageIcon img2 = new ImageIcon("vtd.jpg");
		ImageIcon img3 = new ImageIcon("computer.jpg");
		
		JLabel lblNewLabel_1 = new JLabel(img);
		lblNewLabel_1.setBounds(84, 430, 304, 179);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel(img2);
		lblNewLabel_3.setBounds(385, 430, 472, 158);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(img3);
		lblNewLabel_4.setBounds(0, 0, 968, 862);
		contentPane.add(lblNewLabel_4);
	}

}
