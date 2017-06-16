package ajou.ac.kr.OOP.team7;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Blank_content implements Contents{
	
	public ArrayList<Icon> questionIcon() {
		ArrayList<Icon> img = new ArrayList<>();

		ImageIcon i1 = new ImageIcon("No.1.png");
		ImageIcon i2 = new ImageIcon("No.2.png");
		ImageIcon i3 = new ImageIcon("No.3.png");
		ImageIcon i4 = new ImageIcon("No.4.png");
		ImageIcon i5 = new ImageIcon("No.5.png");
		ImageIcon i6 = new ImageIcon("No.6.png");
		ImageIcon i7 = new ImageIcon("No.7.png");

		img.add(i1);
		img.add(i2);
		img.add(i3);
		img.add(i4);
		img.add(i5);
		img.add(i6);
		img.add(i7);

		return img;
	}
	
	@Override
	public ArrayList<String> answer() {
		ArrayList<String> blank_answer;
		BufferedReader br = null;
		blank_answer = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("blank_answer.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				blank_answer.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return blank_answer;
	}

	@Override
	public ArrayList<String> solution() {
		ArrayList<String> blank_solution;
		BufferedReader br = null;
		blank_solution = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("blank_solution.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				blank_solution.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return blank_solution;
	}

	
	@Override
	public ArrayList<String> question() {
		// TODO Auto-generated method stub
		return null;
	}


}