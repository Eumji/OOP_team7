import java.io.*;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MultipleChoice_Question {

	public ArrayList<String> question(){
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("mc_question.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				mc_quiz.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	
	public ArrayList<String> answer(){
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("mc_answer.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				mc_quiz.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	
	public ArrayList<String> solution(){
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("mc_solution.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				mc_quiz.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}

	public int read_counter(){
		int counter = 0;
		String line = null;
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("mc_counter.txt"));
			line = br.readLine();
			br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		counter = Integer.parseInt(line);
		return counter;
	}
	
	public void plus_counter(int co){
		BufferedWriter bw = null;
		String line = null;
		line = Integer.toString(co+1);
		try {
			bw = new BufferedWriter(new FileWriter("mc_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void mc_restart(){
		BufferedWriter bw = null;
		String line = "0";
		try {
			bw = new BufferedWriter(new FileWriter("mc_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
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
	         bw = new BufferedWriter(new FileWriter("mc_heart.txt"));
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
	         br = new BufferedReader(new FileReader("mc_heart.txt"));
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
