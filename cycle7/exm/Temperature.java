import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

class Temperature implements ActionListener {
    JButton b3;
    JRadioButton b1, b2;
    JTextField jt;
    JFrame jf;

    Temperature() {

        jf = new JFrame();
        jf.setLayout(null);
        jt = new JTextField();
        b1 = new JRadioButton(" to celecius");
        b2 = new JRadioButton(" to kelvin");
        b3 = new JButton("Convert");
        jt.setBounds(20, 70, 100, 20);
        b1.setBounds(130, 70, 100, 20);
        b2.setBounds(240, 70, 100, 20);
        b3.setBounds(350, 70, 100, 20);
        jf.setSize(500, 200);
        jf.add(b1);
        jf.add(b2);
        jf.add(jt);
        jf.add(b3);
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    int flag = -1;

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            flag = 0;

        } else if (e.getSource() == b2) {
            flag = 1;
        }
        if (e.getSource() == b3) {
            if (flag == 0) {
                String str = jt.getText();
                float num = Float.parseFloat(str);
                float f = num - 273.15f;
                jt.setText(String.valueOf(f));

            } else if (flag == 1) {
                String str = jt.getText();
                float num = Float.parseFloat(str);
                float f = num + 273.15f;
                jt.setText(String.valueOf(f));
            }

        }
    }

    public static void main(String[] args) {
        new Temperature();
    }
}