package ajou.ac.kr.OOP.team7;
import java.io.*;
import java.util.ArrayList;

public class ox_content implements Contents{
	
	@Override
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
	
	@Override
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
	
	@Override
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
}
