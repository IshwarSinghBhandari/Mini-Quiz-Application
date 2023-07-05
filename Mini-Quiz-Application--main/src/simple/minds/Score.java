package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(250, 80, 800, 600);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/sc.GIF"));
        Image i2 = i1.getImage().getScaledInstance(650, 170, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(50, 0, 700, 220);
        add(l1);
        
        JLabel l2 = new JLabel(" Thankyou " + username + " for Playing Mini Quiz.");
         l2.setForeground(Color.green);
        l2.setBounds(135, 240, 700, 30);
        l2.setFont(new Font("Georgia", Font.PLAIN, 25));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(220, 300, 500, 50);
        l3.setFont(new Font("Bauhaus 93", Font.PLAIN, 46));
        l3.setForeground(Color.green);
        add(l3);
        
        JButton b1 = new JButton("    Play Again    ");
        b1.setBackground(Color.black);
        b1.setForeground(Color.cyan);
        b1.addActionListener(this);
        
        b1.setBounds(290, 380, 185, 35);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
