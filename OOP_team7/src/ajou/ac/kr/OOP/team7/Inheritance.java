package ajou.ac.kr.OOP.team7;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Inheritance extends Study {

	 JFrame frame;


	/**
	 * Create the application.
	 */
	public Inheritance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 1000);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Inheritance");
		lblNewLabel.setBounds(338, 42, 357, 67);
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 55));

		JPanel panel = new JPanel();
		panel.setBounds(31, 134, 906, 753);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnNewButton = new JButton("What is Inheritance?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InheritanceConcept i = new InheritanceConcept();
				i.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Candara", Font.PLAIN, 40));
		btnNewButton.setBackground(new Color(127, 255, 212));
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("IS-A? HAS-A?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IsHas ih = new IsHas();
				ih.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(135, 206, 235));
		btnNewButton_1.setFont(new Font("Candara", Font.PLAIN, 40));
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("MENU");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 MENU M = new MENU();
				M.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 40));
		btnNewButton_2.setBounds(31, 25, 173, 59);
		contentPane.add(btnNewButton_2);
	}

}
