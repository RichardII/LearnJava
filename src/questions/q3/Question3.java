package questions.q3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question3 {

    public static void main(String[] args) {


        JFrame f=new JFrame("Button Example");

        JButton b=new JButton("Click Here");


        b.setBounds(50,100,900,30);


        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World !");
            }
        });

    }
}
