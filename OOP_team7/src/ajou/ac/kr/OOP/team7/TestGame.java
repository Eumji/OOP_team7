package ajou.ac.kr.OOP.team7;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TestGame {

	JFrame frame;
	

	/**
	 * Create the application.
	 */
	
	public TestGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(135,206,250));
		frame.setBounds(100, 100, 1000, 1000);
		frame.getContentPane().setLayout(null);

		JLabel lblTestGame = new JLabel("Test Game");
		lblTestGame.setBounds(0, 0, 978, 151);
		lblTestGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestGame.setFont(new Font("Arial Black", Font.PLAIN, 60));
		frame.getContentPane().add(lblTestGame);

		JButton btnNewButton = new JButton("OX");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 70));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ox ´©¸£¸é
				HEART h = new HEART();
				h.setheart(3);
				setOXnum(0);
				ox_Game ox = new ox_Game();
				ox.oxgame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(11, 160, 467, 375);
		frame.getContentPane().add(btnNewButton);

		JButton btnMC = new JButton("Multiple Choice");
		btnMC.setBackground(Color.WHITE);
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HEART h = new HEART();
				h.setheart(3);
				setMCnum(0);
				MultipleChoice_Game mcg = new MultipleChoice_Game();
				mcg.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMC.setFont(new Font("Arial", Font.BOLD, 50));
		btnMC.setBounds(11, 559, 467, 375);
		frame.getContentPane().add(btnMC);

		JButton btnBlank = new JButton("Blank");
		btnBlank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HEART h = new HEART();
				h.setheart(3);
				TestGame bg = new Blank_Game();//polymorphism
				bg.setnum(0);//polymorphism
				Blank_Game bg1 = new Blank_Game();
				Icon image = bg1.img.get(bg.getnum());
				bg1.lblNewLabel.setIcon(image);
				bg1.gframe.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnBlank.setBackground(Color.WHITE);
		btnBlank.setFont(new Font("Arial", Font.BOLD, 70));
		btnBlank.setBounds(500, 160, 467, 774);
		frame.getContentPane().add(btnBlank);

		JButton btnHome = new JButton("Menu");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENU home = new MENU();
				home.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnHome.setBackground(Color.WHITE);
		btnHome.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnHome.setBounds(17, 15, 139, 54);
		frame.getContentPane().add(btnHome);
	}
	
	
	
	public int getOXnum() {
		int number = -1;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("ox_counter.txt"));
			String line = br.readLine();
			number = Integer.parseInt(line);
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return number;
	}

	
	public void setOXnum(int n) {
		BufferedWriter bw = null;
		String line = null;
		line = Integer.toString(n);
		try {
			bw = new BufferedWriter(new FileWriter("ox_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getMCnum() {
		int number = -1;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("mc_counter.txt"));
			String line = br.readLine();
			number = Integer.parseInt(line);
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return number;
	}

	
	public void setMCnum(int n) {
		BufferedWriter bw = null;
		String line = null;
		line = Integer.toString(n);
		try {
			bw = new BufferedWriter(new FileWriter("mc_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public int getnum(){
		//
		return 0;
	}
	
	public void setnum(int n){
		//
	}
	
	public void istrue(){
		//
	}
	public void isfalse() {
		//
	}
	public void go(int num){
		//
	}
	
	
	
}