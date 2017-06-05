import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Study extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study frame = new Study();
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
	public Study() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("");

		JLabel lblNewLabel = new JLabel("STUDY");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 50));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(133).addComponent(lblNewLabel)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(panel,
										GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btn1 = new JButton("class & object & method");
		JButton btn2 = new JButton("Method modifiers");
		JButton btn3 = new JButton("variable");

		JButton btnNewButton_1 = new JButton("Basic");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
					
					JFrame fr1 = new JFrame("Basic menu");
					
					fr1.getContentPane().setLayout(new GridLayout(5,5,1,1));
					//btnNewButton_1.add(fr1);
					
					fr1.getContentPane().add(btn1);
					fr1.getContentPane().add(btn2);
					fr1.getContentPane().add(btn3);
					
					fr1.setSize(300, 300);
					fr1.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		panel.add(btnNewButton_1);

		JButton btn4 = new JButton("getter & setter");
		JButton btn5 = new JButton("How to make?");
		
		JButton btnNewButton = new JButton("Encapsulation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fr2 = new JFrame("encapsulation");
				
				fr2.setLayout(new GridLayout(5,5,1,1));
				fr2.add(btn4);
				fr2.add(btn5);
				
				fr2.setSize(300, 300);
				fr2.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 27));
		panel.add(btnNewButton);
		contentPane.setLayout(gl_contentPane);
	}
}
