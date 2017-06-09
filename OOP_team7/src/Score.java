
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Score {
	public int read_score(){
		int score = 0;
		String line = null;
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("gameScore.txt"));
			line = br.readLine();
			br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println("File is not found.");
		}catch(IOException ioe){
			System.out.println("File input//output error.");
		}
		score = Integer.parseInt(line);
		return score;
	}
	
	public void minus_score(int sco){
		BufferedWriter bw = null;
		String line = null;
		line = Integer.toString(sco-1);
		try {
			bw = new BufferedWriter(new FileWriter("gameScore.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			System.out.println("File input//output error.");
		}
	}
	
	public void game_restart(){
		BufferedWriter bw = null;
		String line = "4";
		try {
			bw = new BufferedWriter(new FileWriter("gameScore.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			System.out.println("File input//output error.");
		}
	}

	public static void main(String arg[]){
		Score score = new Score();
		score.game_restart();
		System.out.println(score.read_score());
		score.minus_score(score.read_score());
		System.out.println(score.read_score());
		score.minus_score(score.read_score());
		System.out.println(score.read_score());
		score.game_restart();
		System.out.println(score.read_score());
		
	}

}
