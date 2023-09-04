
package quiz.application;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;




public class Score extends JFrame implements ActionListener  {
    
    Score(String name , int score){
          setBounds(400,100,700,650);
          getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/lll.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,680,300);
        add(image);
             
         JLabel heading = new JLabel("Thankyou " + name );
        heading.setBounds(190,210,300,300);
       heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40)); 
     
add(heading);
        
        
    JLabel lblscore = new JLabel("Your Score is " + score + "/100");
    lblscore.setBounds(190, 300, 300, 300);
    lblscore.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
    add(lblscore);
       
        
           JButton submit= new JButton("Play Again");
        submit.setBounds(430,570,120,30);
        
        submit.setBackground(new Color(173,210,175));
        submit.addActionListener(this);
        add(submit);
      
        
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    } 
    
    public static void main(String args[]){
        new Score("User" ,0 );
    }
}
