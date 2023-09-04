
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules , back;
         JTextField tfname ;
    Login()
    {  
        
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/lll.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,580,300);
        add(image);
        
//        JLabel heading = new JLabel("Creative Minds");
//        heading.setBounds(150,200,300,300);
//        heading.setFont(new Font("Viner Hand ITC" , Font.BOLD,40));
//        heading.setForeground(Color.BLACK);
//        add(heading);
       
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(210,200,300,350);
        name.setFont(new Font("Mongolian Baiti" , Font.BOLD,20));
        name.setForeground(Color.BLACK);
        add(name);
        
         tfname = new JTextField();
        tfname.setBounds(150,430,300,25);
        add(tfname);
       
         rules = new JButton("Rules");
        rules.setBounds(150,500,100,25);
        rules.setBackground(new Color(173,210,175));
        rules.addActionListener(this);
        add(rules);
        
        
        
         back = new JButton("Exit");
        back.setBounds(350,500,100,25);
        back.setBackground(new Color(173,210,175));
         back.addActionListener(this);
        add(back);
        
        setSize(600,650);
        setLocation(360,100);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource() == rules)
     {
         
//         setVisible(false);
//         new Rules();
          String userName = tfname.getText(); // Retrieve the entered name
        new Rules(userName);
     }
     else if(ae.getSource() == back){
         setVisible(false);
     }
    }
    public static void main(String args[])
    {
        
        new Login();    
    }
    
}
