import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q2 {
    Q2() {
        JFrame frame = new JFrame("Traffic ligth");
        JRadioButton b1 = new JRadioButton();
        JRadioButton b2 = new JRadioButton();
        JRadioButton b3 = new JRadioButton();
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(1, 3));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1.setBackground(Color.red);
                b2.setBackground(Color.white);
                b3.setBackground(Color.white);
                b1.setText("STOP");
                b2.setText("");
                b3.setText("");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2.setBackground(Color.yellow);
                b1.setBackground(Color.white);
                b3.setBackground(Color.white);
                b2.setText("WAIT");
                b1.setText("");
                b3.setText("");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b3.setBackground(Color.green);
                b2.setBackground(Color.white);
                b1.setBackground(Color.white);
                b3.setText("GO");
                b2.setText("");
                b1.setText("");
            }
        });
    }

    public static void main(String args[]) {
        new Q2();
    }
}