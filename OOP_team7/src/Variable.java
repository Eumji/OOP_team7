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
		menuBar.add(mnMenu);

		JMenuItem mntmGoToMenu = new JMenuItem("go to Menu");
		mntmGoToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MENU m = new MENU();
				m.frame.setVisible(true);
				setVisible(false);
			}
		});
		mnMenu.add(mntmGoToMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Previous");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				setVisible(false);

			}
		});
		mnMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Next");
		mnMenu.add(mntmNewMenuItem);

		JMenu mnBasic = new JMenu("Basic");
		menuBar.add(mnBasic);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Class&Object&method");
		mnBasic.add(mntmNewMenuItem_2);

		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnBasic.add(mntmModifier);
		
		JMenu mnEncapsultion = new JMenu("Encapsultion");
		menuBar.add(mnEncapsultion);
		
		JMenuItem mntmGetterSetter = new JMenuItem("Getter & Setter");
		mnEncapsultion.add(mntmGetterSetter);
		
		JMenuItem mntmHowToMake = new JMenuItem("How to make?");
		mnEncapsultion.add(mntmHowToMake);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setForeground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		
		ImageIcon img = new ImageIcon("vd.jpg");
		ImageIcon img2 = new ImageIcon("range.jpg");
		ImageIcon img3 = new ImageIcon("rv.jpg");
		
		JLabel lblNewLabel = new JLabel("Variable Declaration");
		lblNewLabel.setForeground(new Color(106, 90, 205));
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel(img);
		
		
		JLabel lblNewLabel_2 = new JLabel("Variable 's Range and Memory");
		lblNewLabel_2.setForeground(new Color(106, 90, 205));
		lblNewLabel_2.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		JLabel lblNewLabel_3 = new JLabel(img2);
		
		
		JLabel lblNewLabel_4 = new JLabel(img3);
		
		
		JLabel lblReferenceTypeVariable = new JLabel("Reference Type Variable");
		lblReferenceTypeVariable.setForeground(new Color(106, 90, 205));
		lblReferenceTypeVariable.setFont(new Font("Corbel", Font.PLAIN, 25));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addGap(123)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblReferenceTypeVariable))
					.addContainerGap(379, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_3)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReferenceTypeVariable)
						.addComponent(lblNewLabel))
					.addGap(1)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_4))
					.addGap(2)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addContainerGap(306, Short.MAX_VALUE))
		);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(245, 255, 250));
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Segoe Print", Font.PLAIN, 22));
		panel.add(textArea);
		contentPane.setLayout(gl_contentPane);

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
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
	}
}
