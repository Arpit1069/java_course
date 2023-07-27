package practice;
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class _14  extends JFrame implements ActionListener{
    JTextField text;
    public double o1,o2,res;
     char o3;
    public _14(){
        setSize(250, 250);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JTextField();
        text.setEditable(false);
        add(text,BorderLayout.NORTH);
         
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        String [] buttons ={"7", "8", "9", "/",  "4", "5", "6", "*", "1", "2", "3", "-", "0", "=", "+",} ;

        for(String label : buttons){
            JButton button = new JButton(label);
            button.addActionListener(this);
            panel.add(button);
        }

        JButton clear = new JButton("C");
        clear.addActionListener(this);
        panel.add(clear);
        add(panel,BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String act = e.getActionCommand();
        if(act.matches("[0-9]")){
            if(o3=='\u0000'){
                o1 = o1*10 + Double.parseDouble(act);
                text.setText(text.getText()+ act);
            }
            else{
                o2 = o2*10 + Double.parseDouble(act);
                text.setText(text.getText()+ act);
            }
        }else if (act.matches("[+\\-*/]")){
            o3 = act.charAt(0);
            text.setText(text.getText()+ act);
        }else if(act.equals("=")){
            switch(o3){
                case '+':
                 res = o1 + o2;
                 break;
                case '-':
                res = o1 - o2;
                 break;
                case '*':
                res = o1 * o2;
                 break;
                case '/':
                res = o1 / o2;
                break;
            }
            text.setText(Double.toString(res));
            o1 =res;
            o2= 0;
            o3 = '\u0000';
        }else if (act.equals("C")) {
            text.setText("");
            o1 = 0;
            o2 = 0;
            o3 = '\u0000';
        }
    }
    public static void main(String[] args) {
        new _14();
    }
    
}
