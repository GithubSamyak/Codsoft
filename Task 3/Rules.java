
package quiz.application;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    JButton start , back;
    String name;
    Rules(String name)
    {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
          JLabel heading = new JLabel("Instructions:");
        heading.setBounds(20,20,700,30);
        heading.setFont(new Font("Viner Hand ITC" , Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,70,600,300);
        rules.setFont(new Font("Tahoma" , Font.PLAIN,16));
        rules.setForeground(Color.BLACK);
        rules.setText(
          "<html>" + 
            "1.Please read all questions carefully and make sure you understand the facts before you begin\n" +
"answering"+ "<br><br>" +      
            "2.Each question in the quiz is of multiple-choice" + 
                  "<br><br>" + 
 "3. After responding to a question, click on the Next button at the bottom to go to the next question." +
                  "<br><br>" + 
 "4.The total score for the quiz is based on your responses to all questions"
                  +"<br><br>" + 
  "5.Good Luck!"+
        "</html>"
        );
        
        
        
        add(rules);
        
        
        
        
        
         back = new JButton("Back");
        back.setBounds(350,500,100,25);
        back.setBackground(new Color(173,210,175));
         back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(150,500,100,25);
        start.setBackground(new Color(173,210,175));
        start.addActionListener(this);
        add(start);
       
            setSize(600,650);
        setLocation(360,100);
        
        setVisible(true);
    }
  

public void actionPerformed(ActionEvent ae){

if(ae.getSource() == start)
{
    setVisible(false);
    new Quiz(name);
}
else
{
    setVisible(false);
    new Login();
    
}
}




public static void main (String [] args)
{
    
    new Rules("User");
}
}
