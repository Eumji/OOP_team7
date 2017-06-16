package ajou.ac.kr.OOP.team7;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JButton;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Study{

	JFrame frame;

	/**
	 * Create the application.
	 */
	public Study() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblStudy = new JLabel("STUDY");
		lblStudy.setForeground(Color.DARK_GRAY);
		lblStudy.setFont(new Font("Arial", Font.PLAIN, 55));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MENU menu = new MENU();
				menu.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMenu.setBackground(new Color(240, 248, 255));
		btnMenu.setFont(new Font("Arial", Font.PLAIN, 40));
		btnMenu.setForeground(new Color(30, 144, 255));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
							.addGap(213)
							.addComponent(lblStudy)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblStudy, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnMenu)
							.addGap(6)))
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		
		JButton btnNewButton = new JButton("Basic");
		btnNewButton.setBounds(2, 2, 444, 739);
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Basic bm = new Basic();
				bm.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		

		JButton btnNewButton_1 = new JButton("Encapsulation");
		btnNewButton_1.setBounds(448, 2, 488, 362);
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.setForeground(new Color(30, 144, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encapsulation em = new Encapsulation();
				em.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		
		JButton btnNewButton_2 = new JButton("Inheritance");
		btnNewButton_2.setBackground(new Color(240, 248, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inheritance im = new Inheritance();
				im.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setForeground(new Color(30, 144, 255));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 50));
		btnNewButton_2.setBounds(448, 363, 488, 378);
		panel.setLayout(null);
		panel.add(btnNewButton);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public void read(JTextArea ta){

		File f = new File("");
		text(ta, f);

	}
	
	public void text(JTextArea ta ,File f){
		
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;

			do {
				line = br.readLine();
				ta.append(line);
				ta.append("\n");
				
			} while (line != null);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ta.setCaretPosition(0);	
	}
}
