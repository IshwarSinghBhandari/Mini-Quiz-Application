package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(200, 5, 1020, 600);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JLabel l1 = new JLabel("*🙃😎 Welcome " + username + " to Mini Quiz 😎🙃* ");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 33));
        l1.setBounds(30, 20, 1000, 50);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        l2.setBounds(100, 90, 650, 350);
        l2.setText(
            "<html>"+
                 
                "1. The participants shall not be allowed to use mobile or other electronic instruments." + "<br><br>" +
                "2. You will get three button on the screen\n" +
                ".  first is next button which gives you next question.\n" +
                "   second is 50 50 life line for only 1 time use.\n" +
                "   and the last is subbmit button which is used to submit all answers." + "<br><br>" +
                "3. Crying is allowed but please do so quietly." + "<br><br>" +
                "4. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "5. you get only 15 sec for each question" + "<br><br>" +
                "6. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "7. The questions will be in the form of multiple choice," + "<br><br>" +
                   
            "<html>"
                
        );
        add(l2);
        
        b1 = new JButton("  Back  ");
        b1.setBounds(160, 450, 150, 35);
        b1.setBackground(Color.black);
        b1.setForeground(Color.CYAN);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("  Start  ");
        b2.setBounds(400, 450, 150, 35);
        b2.setBackground(Color.black);
        b2.setForeground(Color.cyan);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}
