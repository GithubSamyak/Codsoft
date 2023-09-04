
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Quiz extends JFrame implements ActionListener {
    
   
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno ;
    JLabel question;
    JButton next ,submit;
    JRadioButton opt1 ,opt2,opt3,opt4;
    public static int timer= 15;
    public static int ans_given =0;
    public static int count =0;
        public static int score =0;
     ButtonGroup groupoptions;
     String name;
     
    Quiz(String name)
            
     {  
        this.name =name;
         getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/lll.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,680,300);
        add(image);
             
         qno = new JLabel();
        qno.setBounds(50,200,300,300);
        qno.setFont(new Font("Mongolian Baiti" , Font.PLAIN,20)); 
        add(qno);
        
        question= new JLabel();
        question.setBounds(70,200,500,300);
        question.setFont(new Font ("TImes New Roman" , Font.PLAIN , 20));
        add(question);
        
         setBounds(400,100,700,650);
         
        questions[0][0] = "What does the expression float a = 35 / 0 return?";
        questions[0][1] = "0";
        questions[0][2] = "Not a Number";
        questions[0][3] = "Infinity";
        questions[0][4] = "Run time exception";

        questions[1][0] = " Which of the following is a reserved keyword in Java?";
        questions[1][1] = "object";
        questions[1][2] = "strictfp";
        questions[1][3] = "main";
        questions[1][4] = "system";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Dynamic";
        questions[3][2] = "Architecture Neutral";
        questions[3][3] = "Use of pointers";
        questions[3][4] = "Object-oriented";

        questions[4][0] = "Which of the following is not a Java features?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which of the following is a mutable class in java?";
        questions[6][1] = "java.lang.String";
        questions[6][2] = "java.lang.Byte";
        questions[6][3] = "java.lang.Short";
        questions[6][4] = "java.lang.StringBuilder";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "How many threads can be executed at a time?";
        questions[8][1] = "Only one thread ";
        questions[8][2] = "Multiple threads";
        questions[8][3] = "Only main (main() method) thread";
        questions[8][4] = "Two threads";

        questions[9][0] = "What is the default encoding for an OutputStreamWriter?";
        questions[9][1] = "UTF";
        questions[9][2] = "Default encoding of the host platform";
        questions[9][3] = "UTF-12";
        questions[9][4] = "None of the above";
       
        answers[0][1] = "Infinity";
        answers[1][1] = "strictfp";
        answers[2][1] = "java.util package";
        answers[3][1] = "Use of pointers";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "java.lang.StringBuilder";
        answers[7][1] = "Java Archive";
        answers[8][1] = "Default encoding of the host platform"; 
        
         opt1 = new JRadioButton();
        opt1.setBounds(50,380,300,50);
        opt1.setBackground(Color.WHITE);
       opt1.setFont(new Font ("Dialog" , Font.PLAIN , 20));
        add(opt1);
        
          opt2 = new JRadioButton();
        opt2.setBounds(50,420,300,50);
        opt2.setBackground(Color.WHITE);
       opt2.setFont(new Font ("Dialog" , Font.PLAIN , 20));
        add(opt2);
        
          opt3 = new JRadioButton();
        opt3.setBounds(50,460,300,50);
        opt3.setBackground(Color.WHITE);
       opt3.setFont(new Font ("Dialog" , Font.PLAIN , 20));
        add(opt3);
        
        
          opt4 = new JRadioButton();
        opt4.setBounds(50,500,300,50);
        opt4.setBackground(Color.WHITE);
       opt4.setFont(new Font ("Dialog" , Font.PLAIN , 20));
        add(opt4);
        
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        
         next = new JButton("Next");
        next.setBounds(80,570,100,30);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(173,210,175));
        next.addActionListener(this);
        add(next);
        
        submit= new JButton("Submit");
        submit.setBounds(430,570,120,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(173,210,175));
        submit.addActionListener(this);
        add(submit);
        submit.setEnabled(false);
        start(count);
         setVisible(true);
     }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
             opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given=1;
            
             if(groupoptions.getSelection() == null){
                
                  useranswers[count][0] ="";
            }else{
                useranswers[count][0] =groupoptions.getSelection().getActionCommand();  
         
            }
             if(count==8){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
            count++;
            start(count);
        }
     else if (ae.getSource() == submit) {
    ans_given = 1;
    if (groupoptions.getSelection() == null) {
        useranswers[count][0] = "";
    } else {
        useranswers[count][0] = groupoptions.getSelection().getActionCommand();
    }
    
    score = 0; // Reset the score before recalculating
    
    for (int i = 0; i < useranswers.length; i++) {
        if (useranswers[i][0] != null && useranswers[i][0].equals(answers[i][1])) {
            score += 10;
        }
    }
    
    setVisible(false);
    new Score(name, score); // Pass the calculated score to the Score constructor
}

        }
            
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        String time = "Time left :" + timer + "seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.BOLD,20));
        if(timer >0)
        {
            g.drawString(time,480,350);
        }
        else{
            g.drawString("Times up!!",480,350);
        }
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given ==1)
        {
            ans_given=0;
            timer =15;
        }else if(timer<0){
            timer =15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==8){
                 next.setEnabled(false);
                 submit.setEnabled(true);
             }
            if(count==9){
                   if(groupoptions.getSelection() == null){
                
                  useranswers[count][0] ="";
            }else{
                useranswers[count][0] =groupoptions.getSelection().getActionCommand();  
         
            }
            for(int i=0; i<useranswers.length;i++)
            {
                if(useranswers[i][0].equals(answers[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            setVisible(false);
            new Score(name,score);
            }else{
               if(groupoptions.getSelection() == null){
                
                  useranswers[count][0] ="";
            }else{
                useranswers[count][0] ="groupoptions.getSelection().getActionCommand()";  
         
            }
            count++;
            start(count); 
            }
            
        }
        
        
    }
    public void start(int count){
      qno.setText(""+ (count+1)+". ");
      question.setText(questions[count][0]);
      opt1.setText(questions[count][1]);
      opt1.setActionCommand(questions[count][1]);
    opt2.setText(questions[count][2]);
    opt2.setActionCommand(questions[count][2]);
    opt3.setText(questions[count][3]);          
    opt3.setActionCommand(questions[count][3]);
    opt4.setText(questions[count][4]);
    opt4.setActionCommand(questions[count][4]);
    
    groupoptions.clearSelection();
    }
    
    
    public static void main(String args[])
    {
        new Quiz("User");
        
        
    }
}
