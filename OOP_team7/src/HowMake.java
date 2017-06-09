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

public class HowMake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowMake frame = new HowMake();
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
	public HowMake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.setBackground(new Color(135, 206, 235));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 30));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Go to Menu");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MENU M = new MENU();
				M.frame.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Basic Menu");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicMenu bm = new BasicMenu();
				bm.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Encapsulation Menu");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 25));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncapsulationMenu em = new EncapsulationMenu();
				em.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(77, 375, 820, 245);
		contentPane.add(panel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		textArea.setBackground(new Color(240, 255, 255));
		textArea.setEditable(false);
		
		File hmF = new File("howmake.txt");

		FileReader hmfr;
		try {
			hmfr = new FileReader(hmF);
			BufferedReader br = new BufferedReader(hmfr);

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
		
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(77, 36, 27, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1.setBounds(448, 36, 137, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_3.setBounds(77, 220, 137, 35);
		contentPane.add(lblNewLabel_3);
		
		ImageIcon img = new ImageIcon("how1.jpg");
		ImageIcon img2 = new ImageIcon("how2_1.jpg");
		ImageIcon img3 = new ImageIcon("this.jpg");
		ImageIcon img4 = new ImageIcon("computer.jpg");
		
		
		JLabel lblNewLabel_2 = new JLabel(img);
		lblNewLabel_2.setBounds(97, 4, 278, 227);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel(img2);
		lblNewLabel_4.setBounds(406, 36, 398, 314);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(img3);
		lblNewLabel_5.setBounds(77, 258, 368, 66);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(img4);
		lblNewLabel_6.setBounds(0, 0, 968, 862);
		contentPane.add(lblNewLabel_6);
	}

}
