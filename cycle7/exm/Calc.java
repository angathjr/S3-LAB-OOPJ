import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

class Calc {
    Calc() {
        JFrame jf = new JFrame("CALCULATOR");
        jf.setSize(400, 500);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.setBounds(0, 0, 400, 100);
        p2.setBounds(0, 100, 300, 400);
        p3.setBounds(300, 100, 100, 400);
        p2.setBackground(Color.red);
        p1.setBackground(Color.gray);
        p3.setBackground(Color.green);
        p2.setLayout(new GridLayout(3, 4));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("1");
        JButton b3 = new JButton("1");
        JButton b4 = new JButton("1");
        JButton b5 = new JButton("1");
        JButton b6 = new JButton("1");
        JButton b7 = new JButton("1");
        JButton b8 = new JButton("1");
        JButton b9 = new JButton("1");
        JButton b10 = new JButton("1");
        JButton b11 = new JButton("1");
        JButton b12 = new JButton("1");
        JTextField tf = new JTextField("Enter operations");
        tf.setBounds(150, 40, 200, 40);
        p1.add(tf);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        jf.add(p1);
        jf.add(p2);
        jf.add(p3);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new Calc();
    }

}
