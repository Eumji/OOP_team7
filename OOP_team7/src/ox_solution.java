import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ox_solution extends TestGame{

   private ox_question oxq = new ox_question();
   

   JFrame frame_this;
   JTextArea textArea;
   private JMenuBar menuBar;
   

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ox_solution window = new ox_solution();
               window.frame_this.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   

   /**
    * Create the application.
    */
   public ox_solution() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame_this = new JFrame();
      frame_this.setBounds(100, 100, 1000, 1000);
      frame_this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame_this.getContentPane().setLayout(null);
      JButton btnNewButton = new JButton("Next");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            if(oxq.read_counter()==10){
               frame_this.setVisible(false);
               frame.setVisible(true);
            }
            else {
               ox_Game oxg = new ox_Game();
               oxg.oxgame.setVisible(true);
               frame_this.setVisible(false);
            }
         }
      });
      btnNewButton.setFont(new Font("Arial", Font.BOLD, 30));
      btnNewButton.setForeground(Color.WHITE);
      btnNewButton.setBackground(Color.BLACK);
      btnNewButton.setBounds(829, 845, 132, 53);
      frame_this.getContentPane().add(btnNewButton);
      
      textArea = new JTextArea();
      textArea.setForeground(Color.BLACK);
      textArea.setBackground(null);
      textArea.setLineWrap(true);
      textArea.setEditable(false);
      textArea.setFont(new Font("Arial", Font.PLAIN, 45));
      textArea.setBounds(0, 0, 978, 913);
      
      frame_this.getContentPane().add(textArea);
      
      menuBar = new JMenuBar();
      frame_this.setJMenuBar(menuBar);
      
      JMenu mnMenu = new JMenu("Menu");
      mnMenu.setFont(new Font("Arial", Font.PLAIN, 30));
      menuBar.add(mnMenu);
      
      JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
      mntmGoToMenu.setFont(new Font("Arial", Font.PLAIN, 25));
      mntmGoToMenu.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            //menu로 돌아가기
            MENU home = new MENU();
            home.frame.setVisible(true);
            frame_this.setVisible(false);
         }
      });
      mnMenu.add(mntmGoToMenu);
      
      JMenu mnQuestion = new JMenu("Question");
      mnQuestion.setFont(new Font("Arial", Font.PLAIN, 30));
      menuBar.add(mnQuestion);
      

      JMenuItem mntmNo = new JMenuItem("No.1");
      mntmNo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            go(1);
         }
      });
      mntmNo.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo);

      JMenuItem mntmNo_1 = new JMenuItem("No.2");
      mntmNo_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(2);
         }
      });
      mntmNo_1.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_1);

      JMenuItem mntmNo_2 = new JMenuItem("No.3");
      mntmNo_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(3);
         }
      });
      mntmNo_2.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_2);

      JMenuItem mntmNo_3 = new JMenuItem("No.4");
      mntmNo_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(4);
         }
      });
      mntmNo_3.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_3);

      JMenuItem mntmNo_4 = new JMenuItem("No.5");
      mntmNo_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(5);
         }
      });
      mntmNo_4.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_4);

      JMenuItem mntmNo_5 = new JMenuItem("No.6");
      mntmNo_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(6);
         }
      });
      mntmNo_5.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_5);

      JMenuItem mntmNo_6 = new JMenuItem("No.7");
      mntmNo_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(7);
         }
      });
      mntmNo_6.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_6);

      JMenuItem mntmNo_7 = new JMenuItem("No.8");
      mntmNo_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(8);
         }
      });
      mntmNo_7.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_7);

      JMenuItem mntmNo_8 = new JMenuItem("No.9");
      mntmNo_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(9);
         }
      });
      mntmNo_8.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_8);

      JMenuItem mntmNo_9 = new JMenuItem("No.10");
      mntmNo_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            go(10);
         }
      });
      mntmNo_9.setFont(new Font("Arial", Font.PLAIN, 25));
      mnQuestion.add(mntmNo_9);
      
      
      
   }
   
   void go(int n){
      oxq.plus_counter(n-2);
      ox_Game newOX = new ox_Game();
      newOX.oxgame.setVisible(true);
      frame_this.setVisible(false);
   }
}