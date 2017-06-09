import java.awt.Image;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Blank_question {
   public ArrayList<Icon> question(){
      ArrayList<Icon> img = new ArrayList<>();

      ImageIcon i1 = new ImageIcon("No.1.jpg");
      ImageIcon i2 = new ImageIcon("No.2.jpg");
      ImageIcon i3 = new ImageIcon("No.3.jpg");
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
   
   public ArrayList<String> answer(){
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
      return blank_answer;
   }
   
   public ArrayList<String> solution(){
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
      return blank_solution;
   }
   
   public int getnum(){
      int number=-1;
      BufferedReader br = null;
      try{
         br = new BufferedReader(new FileReader("blank_number.txt"));
         String line=br.readLine();
         number = Integer.parseInt(line);   
      br.close();
      }catch(FileNotFoundException fnfe){
         System.out.println("File is not found.");
      }catch(IOException ioe){
         System.out.println("File input//output error.");
      }
      return number;
   }
   
   public void setnum(int n){
      BufferedWriter bw = null;
      String line = null;
      line = Integer.toString(n);
      try {
         bw = new BufferedWriter(new FileWriter("blank_number.txt"));
         bw.write(line);
         bw.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   
}