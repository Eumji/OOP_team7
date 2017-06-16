package ajou.ac.kr.OOP.team7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

public class SignUp extends JFrame implements Serializable {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textID;
	private JLabel lblId;
	private JLabel lblPassword;
	private JLabel lblNewLabel_1;
	private JTextField textNN;
	private JSpinner spinnerD, spinnerM;
	private boolean IDchk = false;
	private JPasswordField textPW;
	private JPasswordField textPW1;
	private JLabel lblPWC;
	ArrayList<People> alp;

	/**
	 * Create the frame.
	 */
	public SignUp() {

		alp = new ArrayList<>();
		setTitle("Sign Up");
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textName = new JTextField();
		textName.setFont(new Font("Arial", Font.PLAIN, 25));
		textName.setColumns(10);

		textID = new JTextField();
		textID.setFont(new Font("Arial", Font.PLAIN, 25));
		textID.setColumns(10);

		lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Arial", Font.PLAIN, 25));

		lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 25));

		lblNewLabel_1 = new JLabel("Nickname : ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));

		textNN = new JTextField();
		textNN.setFont(new Font("Arial", Font.PLAIN, 25));
		textNN.setColumns(10);

		spinnerM = new JSpinner();
		spinnerM.setFont(new Font("Arial", Font.PLAIN, 25));
		spinnerM.setModel(new SpinnerNumberModel(1, 1, 12, 1));

		spinnerD = new JSpinner();
		spinnerD.setFont(new Font("Arial", Font.PLAIN, 25));
		spinnerD.setModel(new SpinnerNumberModel(1, 1, 31, 1));

		JLabel lblBirthDay = new JLabel("Birth day : ");
		lblBirthDay.setFont(new Font("Arial", Font.PLAIN, 25));

		JLabel lblMonth = new JLabel("Month : ");
		lblMonth.setFont(new Font("Arial", Font.PLAIN, 25));

		JLabel lblDay = new JLabel("Day : ");
		lblDay.setFont(new Font("Arial", Font.PLAIN, 25));

		JButton btnSignUp = new JButton("Sign up!");
		btnSignUp.setBackground(new Color(135, 206, 250));
		btnSignUp.setFont(new Font("Arial", Font.PLAIN, 25));
		btnSignUp.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				SignUp su = new SignUp();
				String s1, s2;
				s1 = textPW.getText();
				s2 = textPW1.getText();
				if (textName.getText().equals("") || textID.getText().equals("") || textPW.getText().equals("")
						|| textNN.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Error: Please input");
				} else if (IDchk == false) {
					JOptionPane.showMessageDialog(null, "Error: Please do ID overlap check");
				} else if (s1.equals(s2) == false) {
					JOptionPane.showMessageDialog(null, "Error: password is wrong");
				}

				else {
					alp = su.loadFromCSV();
					alp.add(new People(textName.getText(), textID.getText(), textPW.getText(), textNN.getText(),
							(int) spinnerM.getValue(), (int) spinnerD.getValue()));
					su.saveToCSV(alp);
					JOptionPane.showMessageDialog(null, textNN.getText() + ", congratulation! Enjoy:)");
					setVisible(false);
				}
			}
		});

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(135, 206, 250));
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 25));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exit", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					setVisible(false);
				}
			}

		});

		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Arial", Font.PLAIN, 25));

		JButton btnId = new JButton("ID Overlap check");
		btnId.setBackground(new Color(135, 206, 250));
		btnId.setFont(new Font("Arial", Font.PLAIN, 20));
		btnId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp s = new SignUp();
				alp = s.loadFromCSV();
				boolean isIDex = false;
				for (People person : alp) {
					if (person.getID().equals(textID.getText()) == true) {
						isIDex = true;
						break;
					}
				}
				if (isIDex == true)
					JOptionPane.showMessageDialog(null, "Someone use this ID;(\n input another ID please");
				else {
					JOptionPane.showMessageDialog(null, "You can use it! great ID:)");
					IDchk = true;
				}
			}
		});

		textPW = new JPasswordField();
		textPW.setFont(new Font("Arial", Font.PLAIN, 25));
		textPW.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			public void keyPressed(KeyEvent k) {
				String s1, s2;
				s1 = textPW.getText();
				s2 = textPW1.getText();
				char c = k.getKeyChar();
				s1 += c;
				if (s1.equals(s2) == false) {
					lblPWC.setText("wrong password");
					lblPWC.setForeground(new Color(255, 0, 0));
				} else {
					lblPWC.setText("password correct!");
					lblPWC.setForeground(new Color(50, 205, 50));
				}
			}
		});

		JLabel lblPasswordChek = new JLabel("password check :");
		lblPasswordChek.setFont(new Font("Arial", Font.PLAIN, 25));

		textPW1 = new JPasswordField();
		textPW1.setFont(new Font("Arial", Font.PLAIN, 25));
		textPW1.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyPressed(KeyEvent k) {
				String s1, s2;
				s1 = textPW.getText();
				s2 = textPW1.getText();
				char c = k.getKeyChar();
				s2 += c;
				if (s1.equals(s2) == false) {
					lblPWC.setText("wrong password");
					lblPWC.setForeground(new Color(255, 0, 0));
				} else {
					lblPWC.setText("password correct!");
					lblPWC.setForeground(new Color(50, 205, 50));
				}
			}
		});

		lblPWC = new JLabel("");
		lblPWC.setForeground(new Color(255, 0, 0));
		lblPWC.setFont(new Font("Arial", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_1)
								.addGap(67).addComponent(textNN, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(43).addComponent(btnSignUp).addGap(157)
								.addComponent(btnCancel)))
				.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblBirthDay)
						.addContainerGap(331, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblMonth).addGap(39)
						.addComponent(spinnerM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblDay)
						.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
						.addComponent(spinnerD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(42))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(4)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblPWC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPasswordChek, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textPW, 232, 232, 232)
								.addComponent(textPW1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGap(123)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textName, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(228, Short.MAX_VALUE).addComponent(btnId).addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textName, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
						.addGap(42)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textID, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGap(27).addComponent(btnId, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGap(48)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE,
										47, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPW, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblPasswordChek)
								.addComponent(textPW1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(lblPWC, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
						.addGroup(
								gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textNN, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1))
						.addGap(51).addComponent(lblBirthDay).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(spinnerM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDay)
								.addComponent(spinnerD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMonth))
						.addGap(38).addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnCancel).addComponent(btnSignUp))
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	public void saveToCSV(ArrayList<People> people) {
		try {
			File f = new File("people.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			for (People p : people) {
				bw.write(p.getName() + ";" + p.getID() + ";" + p.getpassword() + ";" + p.getnickname() + ";"
						+ p.getmonth() + ";" + p.getday() + "\n");
			}

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<People> loadFromCSV() {
		try {
			File f = new File("people.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String s;
			while ((s = br.readLine()) != null) {
				String[] line = s.split(";");
				alp.add(new People(line[0], line[1], line[2], line[3], Integer.parseInt(line[4]),
						Integer.parseInt(line[5])));
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return alp;

	}
}