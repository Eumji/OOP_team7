import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Blank_question implements Contents{
	
	public ArrayList<Icon> questionIcon() {
		ArrayList<Icon> img = new ArrayList<>();

		ImageIcon i1 = new ImageIcon("No.1.png");
		ImageIcon i2 = new ImageIcon("No.2.png");
		ImageIcon i3 = new ImageIcon("No.3.png");
		ImageIcon i4 = new ImageIcon("No.4.jpg");
		ImageIcon i5 = new ImageIcon("No.5.jpg");
		ImageIcon i6 = new ImageIcon("No.6.jpg");
		ImageIcon i7 = new ImageIcon("No.7.jpg");
		ImageIcon i8 = new ImageIcon("No.8.jpg");
		ImageIcon i9 = new ImageIcon("No.9.jpg");
		ImageIcon i10 = new ImageIcon("No.10.jpg");

		img.add(i1);
		img.add(i2);
		img.add(i3);
		img.add(i4);
		img.add(i5);
		img.add(i6);
		img.add(i7);
		img.add(i8);
		img.add(i9);
		img.add(i10);

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