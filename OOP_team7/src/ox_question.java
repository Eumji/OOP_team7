import java.io.*;
import java.util.ArrayList;

public class ox_question {
	
	public static ArrayList<String> ox_quiz, ox_answer;
	
	public static void main(String arg[]){
		
		BufferedReader br = null;
		BufferedReader br2 = null;
		ox_quiz = new ArrayList<String>();
		ox_answer = new ArrayList<String>();
		try{
			br = new BufferedReader(new FileReader("ox_question.txt"));
			br2 = new BufferedReader(new FileReader("ox_answer.txt"));
			String line;
			
			while((line = br.readLine())!=null){
				ox_quiz.add(line);
			}
			while((line = br2.readLine())!=null){
				ox_answer.add(line);
			}
			
			
		br.close();
		br2.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		
		System.out.println(ox_quiz);
		System.out.println(ox_answer);
	}//main

}
