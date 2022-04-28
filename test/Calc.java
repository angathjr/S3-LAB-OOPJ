import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Q1 {
    Q1() {
        JFrame frame = new JFrame("Sample  Calculator");
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel inputPanel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        panel1.setLayout(new GridLayout(6, 1));
        inputPanel.setLayout(new GridBagLayout());
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.setBounds(100, 0, 350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField result = new JTextField();
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton zero = new JButton("0");
        JButton nine = new JButton("9");
        JButton AC = new JButton("AC");
        JButton dot = new JButton(".");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton into = new JButton("*");
        JButton by = new JButton("/");
        JButton mod = new JButton("%");
        JButton equal = new JButton("=");
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(AC);
        panel.add(zero);
        panel.add(dot);
        panel1.add(plus);
        panel1.add(minus);
        panel1.add(into);
        panel1.add(by);
        panel1.add(mod);
        panel1.add(equal);
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 0.4;
        result.setHorizontalAlignment(JTextField.CENTER);
        frame.add(result, c);
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 3;
        c.weighty = 1;
        inputPanel.add(panel, c);

        inputPanel.add(panel1, c);
        frame.add(inputPanel, c);
        frame.setVisible(true);
        panel.setVisible(true);
        panel1.setVisible(true);
        inputPanel.setVisible(true);

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "9");
            }
        });
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "0");
            }
        });
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + ".");
            }
        });
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "+");
            }
        });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "-");
            }
        });
        into.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "*");
            }
        });
        by.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "/");
            }
        });
        mod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (result.getText().equals("Enter two operands!") || result.getText().equals("Not defined!"))
                    result.setText("");
                result.setText(result.getText() + "%");
            }
        });
        AC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText("");
            }
        });

        result.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ae) {
                if (ae.getKeyCode() == KeyEvent.VK_ENTER) {
                    String exp = result.getText();
                    int i = 1;
                    float x, y, res = 0;
                    char z = exp.charAt(1);
                    try {
                        while (z != '+' && z != '-' && z != '*' && z != '/' && z != '%') {
                            i++;
                            z = exp.charAt(i);
                        }
                        x = Float.parseFloat(exp.substring(0, i));
                        y = Float.parseFloat(exp.substring(i + 1, exp.length()));
                        switch (z) {
                            case '+':
                                res = x + y;
                                break;
                            case '-':
                                res = x - y;
                                break;
                            case '*':
                                res = x * y;
                                break;
                            case '/':
                                if (y == 0)
                                    break;
                                res = x / y;
                                break;
                            case '%':
                                res = x % y;
                                break;
                        }
                        if (y == 0)
                            result.setText("Not defined!");
                        else if (res == (int) res)
                            result.setText((int) res + "");
                        else
                            result.setText(res + "");
                    } catch (Exception e) {
                        result.setText("Enter two operands!");
                    }
                }
            }
        });

        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String exp = result.getText();
                int i = 1;
                float x, y, res = 0;
                char z = exp.charAt(1);
                try {
                    while (z != '+' && z != '-' && z != '*' && z != '/' && z != '%') {
                        i++;
                        z = exp.charAt(i);
                    }
                    x = Float.parseFloat(exp.substring(0, i));
                    y = Float.parseFloat(exp.substring(i + 1, exp.length()));
                    switch (z) {
                        case '+':
                            res = x + y;
                            break;
                        case '-':
                            res = x - y;
                            break;
                        case '*':
                            res = x * y;
                            break;
                        case '/':
                            if (y == 0)
                                break;
                            res = x / y;
                            break;
                        case '%':
                            res = x % y;
                            break;
                    }
                    if (y == 0)
                        result.setText("Not defined!");
                    else if (res == (int) res)
                        result.setText((int) res + "");
                    else
                        result.setText(res + "");
                } catch (Exception e) {
                    result.setText("Enter two operands!");
                }
            }
        });
    }

    public static void main(String args[]) {
        new Q1();
    }
}