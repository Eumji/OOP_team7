import java.io.*;
import java.util.ArrayList;

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

}
