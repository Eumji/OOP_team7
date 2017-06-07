import java.awt.BorderLayout;
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

public class SignUp extends JFrame implements Serializable{

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textID;
	private JLabel lblId;
	private JLabel lblPassword;
	private JLabel lblNewLabel_1;
	private JTextField textNN;
	private JSpinner spinnerD, spinnerM;
	private boolean IDchk=false;
	private boolean PWC=false;
	private JPasswordField textPW;
	private JPasswordField textPW1;
	private JLabel lblPWC;
	private String PW, PW1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setTitle("Sign Up");
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textName = new JTextField();
		textName.setColumns(10);
		
		textID = new JTextField();
		textID.setColumns(10);
		
		lblId = new JLabel("ID : ");
		
		lblPassword = new JLabel("password : ");
		
		lblNewLabel_1 = new JLabel("Nickname : ");
		
		textNN = new JTextField();
		textNN.setColumns(10);
		
		spinnerM = new JSpinner();
		spinnerM.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		
		spinnerD = new JSpinner();
		spinnerD.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		
		JLabel lblBirthDay = new JLabel("Birth day : ");
		
		JLabel lblMonth = new JLabel("Month : ");
		
		JLabel lblDay = new JLabel("Day : ");
		
		JButton btnSignUp = new JButton("Sign up!");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp su = new SignUp();
				if(IDchk==false){
		            JOptionPane.showMessageDialog(null, "Error: Please do ID overlap check");
				}
				else if(textName.getText().equals("")||textID.getText().equals("")||textPW.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Error: Please input");
				}
				else if(textPW.getPassword().equals(textPW1.getPassword())){
					JOptionPane.showMessageDialog(null, "Error: password is wrong");
				}
					
				else{
					ArrayList<People> alp = new ArrayList<>();
					alp = su.loadFromCSV();
					alp.add(new People(textName.getText(), textID.getText(), textPW.getText(),textNN.getText(), (int)spinnerM.getValue(), (int)spinnerD.getValue()));
					su.saveToCSV(alp);
					JOptionPane.showMessageDialog(null, textNN.getText()+ ", congratulation! Enjoy:)");
					setVisible(false);
				}
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exit", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					setVisible(false);
				}
			}
			
		});
		
		JLabel lblName = new JLabel("Name : ");
		
		JButton btnId = new JButton("ID Overlap check");
		btnId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp s = new SignUp();
				ArrayList<People> p=s.loadFromCSV();
				boolean isIDex=false;
				for(People person : p){
					if(person.getID().equals(textID.getText())==true){
						isIDex=true;
						break;
					}
				}
				if(isIDex==true) JOptionPane.showMessageDialog(null, "Someone use this ID;(\n input another ID please");
				else {JOptionPane.showMessageDialog(null, "You can use it! great ID:)"); IDchk = true;}				
			}
		});
		
		textPW = new JPasswordField();
		textPW.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				String s1, s2; s1=textPW.getText(); s2=textPW1.getText();
				char c=k.getKeyChar();
				s1+=c;
				if(s1.equals(s2)==false)lblPWC.setText("wrong password");
				else lblPWC.setText("password correct!");
			}
		});
		
		JLabel lblPasswordChek = new JLabel("password chek :");
		
		textPW1 = new JPasswordField();
		textPW1.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyPressed(KeyEvent k) {
				String s1, s2; s1=textPW.getText(); s2=textPW1.getText();
				char c=k.getKeyChar();
				s2+=c;
				if(s1.equals(s2)==false)lblPWC.setText("wrong password");
				else lblPWC.setText("password correct!");
			}
		});
		
		lblPWC = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(51)
					.addComponent(btnSignUp)
					.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
					.addComponent(btnCancel)
					.addGap(64))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addComponent(btnId)
					.addContainerGap(119, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMonth)
							.addGap(39)
							.addComponent(spinnerM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(lblDay)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(spinnerD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblPWC)
							.addComponent(lblBirthDay)))
					.addContainerGap(32, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblName))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblId))
						.addComponent(lblPassword)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(45)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textID, 190, 190, 190)
										.addComponent(textName, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(54)
									.addComponent(textNN, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
							.addGap(2))
						.addComponent(textPW, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
					.addGap(32))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(lblPasswordChek)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPW1, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(32))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnId)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(textPW, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPasswordChek)
						.addComponent(textPW1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblPWC)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addComponent(lblBirthDay)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDay)
						.addComponent(spinnerD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMonth)
						.addComponent(spinnerM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSignUp)
						.addComponent(btnCancel)))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void saveToCSV(ArrayList<People> people){
		 try{
	        File f=new File("people.txt");
	        FileWriter fw = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(fw);
	        for(People p : people){
	            bw.write(p.getName() + ";" + p.getID() + ";" +p.getpassword() +";" + p.getnickname()+";"+p.getmonth()+";"+p.getday()+"\n");
	        }
	       
	        bw.close();
	     }catch(IOException e){
	            e.printStackTrace();
	     }
	}
	
	
	public ArrayList<People> loadFromCSV(){	
		ArrayList<People> lp = new ArrayList<>();
        try{
            File f=new File("people.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String s;
            while((s = br.readLine()) != null) {
                String[] line = s.split(";");
                lp.add(new People(line[0],line[1],line[2],line[3],Integer.parseInt(line[4]),Integer.parseInt(line[5])));
            }
            
            br.close();
            }catch(IOException e){
                e.printStackTrace();
        }
        return lp;
	
	}
}
