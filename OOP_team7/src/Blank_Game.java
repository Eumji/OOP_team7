import java.awt.EventQueue;
import java.awt.Menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;

public class Blank_Game {

   JFrame frame;
   private JTextField textField;
   Blank_question bq = new Blank_question();
   
   private ArrayList<String> answer = new ArrayList<String>(bq.answer());
   private ArrayList<String> solution = new ArrayList<String>(bq.solution());
   private ArrayList<Icon> img = new ArrayList<Icon>(bq.question());

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Blank_Game window = new Blank_Game();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Blank_Game() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 1000, 1000);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JPanel panel = new JPanel();
      GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
               .addGap(38))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(panel, GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE))
      );
      
      JLabel lblAnser = new JLabel("Answer : ");
      lblAnser.setFont(new Font("Arial", Font.BOLD, 45));
      
      textField = new JTextField();
      textField.setFont(new Font("Arial", Font.BOLD, 35));
      textField.setColumns(10);
      
      JLabel lblNewLabel = new JLabel("");
      //Icon image = (Icon)img.get(num); 
      //lblNewLabel.setIcon(image);
      
      lblNewLabel.setBackground(Color.DARK_GRAY);
      
      JButton btnSubmit = new JButton("Submit");
      btnSubmit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            Blank_solution bs = new Blank_solution();
            int num = bq.getnum();
            String s = answer.get(num);
            if(textField.getText().equals(s)){
               bs.lblNewLabel.setIcon(new ImageIcon("o.jpg"));
            }
            else{
               bs.lblNewLabel.setIcon(new ImageIcon("x.jpg"));
            }
            bs.textArea.setText(solution.get(bq.getnum()));
            frame.setVisible(false);
            bs.frame.setVisible(true);
         }
      });
      btnSubmit.setFont(new Font("Arial", Font.BOLD, 35));
      GroupLayout gl_panel = new GroupLayout(panel);
      gl_panel.setHorizontalGroup(
         gl_panel.createParallelGroup(Alignment.TRAILING)
            .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
               .addGap(101)
               .addComponent(lblAnser, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(textField, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
               .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
               .addGap(63))
            .addGroup(gl_panel.createSequentialGroup()
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 919, GroupLayout.PREFERRED_SIZE)
               .addGap(28))
      );
      gl_panel.setVerticalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
               .addGap(47)
               .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 597, GroupLayout.PREFERRED_SIZE)
               .addGap(42)
               .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblAnser, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                  .addComponent(textField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
               .addGap(25))
      );
      panel.setLayout(gl_panel);
      frame.getContentPane().setLayout(groupLayout);
      
      JMenuBar menuBar = new JMenuBar();
      frame.setJMenuBar(menuBar);
      
      JMenu mnMenu = new JMenu("Menu");
      menuBar.add(mnMenu);
      
      JMenuItem mntmGoToMenu = new JMenuItem("Go to Menu");
      mntmGoToMenu.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
        	bq.setnum(0);
            MENU m= new MENU();
            frame.setVisible(false);
            m.frame.setVisible(true);
         }
      });
      mnMenu.add(mntmGoToMenu);
      
      JMenu mnQuestion = new JMenu("Question");
      menuBar.add(mnQuestion);
      
      JMenuItem mntmNo = new JMenuItem("No.1");
      mntmNo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            bq.setnum(0);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo);
      
      JMenuItem mntmNo_1 = new JMenuItem("No.2");
      mntmNo_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            bq.setnum(1);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_1.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_1);
      
      JMenuItem mntmNo_2 = new JMenuItem("No.3");
      mntmNo_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(2);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_2.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_2);
      
      JMenuItem mntmNo_3 = new JMenuItem("No.4");
      mntmNo_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(3);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_3.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_3);
      
      JMenuItem mntmNo_4 = new JMenuItem("No.5");
      mntmNo_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(4);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_4.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_4);
      
      JMenuItem mntmNo_5 = new JMenuItem("No.6");
      mntmNo_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(5);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_5.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_5);
      
      JMenuItem mntmNo_6 = new JMenuItem("No.7");
      mntmNo_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(6);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_6.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_6);
      
      JMenuItem mntmNo_7 = new JMenuItem("No.8");
      mntmNo_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(7);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_7.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_7);
      
      JMenuItem mntmNo_8 = new JMenuItem("No.9");
      mntmNo_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(8);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_8.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_8);
      
      JMenuItem mntmNo_9 = new JMenuItem("No.10");
      mntmNo_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            bq.setnum(9);
            frame.setVisible(true);
            Blank_Game bg = new Blank_Game();
            bg.frame.setVisible(false);
         }
      });
      mntmNo_9.setFont(new Font("Arial", Font.PLAIN, 20));
      mnQuestion.add(mntmNo_9);
      
   }
   
}