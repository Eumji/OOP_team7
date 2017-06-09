import java.io.*;
import java.util.ArrayList;

public class ox_question {
	
	public ArrayList<String> question(){
		ArrayList<String> ox_quiz;
		BufferedReader br = null;
		ox_quiz = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("ox_question.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				ox_quiz.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return ox_quiz;
	}
	
	public ArrayList<String> answer(){
		ArrayList<String> ox_quiz;
		BufferedReader br = null;
		ox_quiz = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("ox_answer.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				ox_quiz.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return ox_quiz;
	}
	
	
	public ArrayList<String> solution(){
		ArrayList<String> ox_quiz;
		BufferedReader br = null;
		ox_quiz = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("ox_solution.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				ox_quiz.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return ox_quiz;
	}
	
	public int read_counter(){
		int counter = 0;
		String line = null;
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("ox_counter.txt"));
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
			bw = new BufferedWriter(new FileWriter("ox_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void ox_restart(){
		BufferedWriter bw = null;
		String line = "0";
		try {
			bw = new BufferedWriter(new FileWriter("ox_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
