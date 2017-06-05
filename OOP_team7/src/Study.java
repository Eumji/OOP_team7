import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Study extends MENU{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study window = new Study();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblStudy = new JLabel("STUDY");
		lblStudy.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(132)
							.addComponent(lblStudy))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStudy)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn1 = new JButton("class & object & method");

		JButton btn2 = new JButton("Method modifiers");

		JButton btn3 = new JButton("variable");
	
		
		JButton btnNewButton = new JButton("Basic");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fr1 = new JFrame("Basic menu");
				
				fr1.setLayout(new GridLayout());
				
				fr1.add(btn1);
				fr1.add(btn2);
				fr1.add(btn3);
				
				fr1.setSize(500, 500);
				fr1.setVisible(true);
				
				frame.setVisible(false);
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btn4 = new JButton("getter & setter");
		btn4.setSize(200, 200);
		JButton btn5 = new JButton("How to make?");

		JButton btnNewButton_1 = new JButton("Encapsulation");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fr2 = new JFrame("encapsulation");
				
				fr2.setLayout(new GridLayout());
				fr2.add(btn4);
				fr2.add(btn5);
				
				fr2.setSize(500, 500);
				fr2.setVisible(true);
				frame.setVisible(false);
			}
		});
		panel.add(btnNewButton_1);
		frame.getContentPane().setLayout(groupLayout);
	}

}
