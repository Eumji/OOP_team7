import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class HEART {
	public ArrayList<Icon> heart() {
		
		ArrayList<Icon> h = new ArrayList<>();

		ImageIcon i1 = new ImageIcon("heart1.png");
		ImageIcon i2 = new ImageIcon("heart2.png");
		ImageIcon i3 = new ImageIcon("heart3.png");
		ImageIcon i4 = new ImageIcon("heart4.png");
		
		h.add(i1);
		h.add(i2);
		h.add(i3);
		h.add(i4);

		return h;	
	}
	
	public void setheart(int n) {
		BufferedWriter bw = null;
		String line = null;
		line = Integer.toString(n);
		try {
			bw = new BufferedWriter(new FileWriter("Heart.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int getheart() {
		int number = -1;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("Heart.txt"));
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

}
