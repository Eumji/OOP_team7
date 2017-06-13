import java.io.*;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MultipleChoice_content implements Contents{

	@Override
	public ArrayList<String> question() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc_question.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	
	@Override
	public ArrayList<String> answer() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc_answer.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}

	@Override
	public ArrayList<String> solution() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc_solution.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	
	public ArrayList<String> mc1() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc1.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	public ArrayList<String> mc2() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc2.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	public ArrayList<String> mc3() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc3.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	public ArrayList<String> mc4() {
		ArrayList<String> mc_quiz;
		BufferedReader br = null;
		mc_quiz = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader("mc4.txt"));
			String line;

			while ((line = br.readLine()) != null) {
				mc_quiz.add(line);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		return mc_quiz;
	}
	
	
	/*public int read_counter() {
		int counter = 0;
		String line = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("mc_counter.txt"));
			line = br.readLine();
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File is not found.");
		} catch (IOException ioe) {
			System.out.println("File input//output error.");
		}
		counter = Integer.parseInt(line);
		return counter;
	}

	public void plus_counter(int co) {
		BufferedWriter bw = null;
		String line = null;
		line = Integer.toString(co + 1);
		try {
			bw = new BufferedWriter(new FileWriter("mc_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void mc_restart() {
		BufferedWriter bw = null;
		String line = "0";
		try {
			bw = new BufferedWriter(new FileWriter("mc_counter.txt"));
			bw.write(line);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}*/
}
