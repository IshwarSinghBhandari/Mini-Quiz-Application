package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    SimpleMinds(){
        setBounds(100, 00, 1102, 800); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/quiz.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(2, 2, 1100, 350);
        add(l1); 
        
        JLabel l2 = new JLabel(" Mini Quiz ");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 50));
        l2.setForeground(Color.green);
        l2.setBounds(430, 400, 900, 50);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        l3.setForeground( Color.ORANGE);
        l3.setBounds(480, 475, 500, 24);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(370, 510, 400, 35);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 24));
        add(t1);
        
        b1 = new JButton("  Rules  ");
        b1.setBounds(610, 580, 160, 35);
        b1.setBackground(Color.black);
        b1.setForeground(Color.cyan);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("  Exit  ");
        b2.setBounds(370, 580, 160, 35);
        b2.setBackground(Color.black);
        b2.setForeground(Color.cyan);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
  
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            Rules rules = new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new SimpleMinds();
    }
    
}
