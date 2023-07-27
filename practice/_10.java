package practice;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _10 extends JFrame{

    JTextField text1,text2,result;
    JButton add,clear,exit;

    public _10(){
        setTitle("ADDITION");
        setSize(225, 225);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GRAY);
        Border border = BorderFactory.createTitledBorder("NUMBER ADDITION");
        text1 = new JTextField();
        text2 = new JTextField();
        result = new JTextField();
        add = new JButton("ADD");
        clear = new JButton("CLEAR");
        exit = new JButton("EXIT");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(text1.getText());
                int num2 = Integer.parseInt(text2.getText());
                int sum = num1+num2;
                result.setText(Integer.toString(sum));
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                text1.setText("");
                text2.setText("");
                result.setText("");
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        JPanel panel = new JPanel();
        panel.setBorder(border);
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Number 1:"));
        panel.add(text1);
        panel.add(new JLabel("Number 2:"));
        panel.add(text2);
        panel.add(new JLabel("Result:"));
        panel.add(result);
        panel.add(add);
        panel.add(clear);

        add(panel);
        add(exit);



    }

    public static void main(String[] args) {
        _10 app = new _10();
        app.setVisible(true);
    }
}
