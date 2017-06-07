import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Blank_question {
	/*public ArrayList<String> question(){
		ArrayList<String> blank_question;
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
	}*/
	
	public String answer(int index){
		ArrayList<String> blank_answer;
		BufferedReader br = null;
		blank_answer = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("blank_answer.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				blank_answer.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return blank_answer.get(index);
	}
	
	public String solution(int index){
		ArrayList<String> blank_solution;
		BufferedReader br = null;
		blank_solution = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("blank_solution.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				blank_solution.add(line);
			}
			
		br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		return blank_solution.get(index);
	}
}
