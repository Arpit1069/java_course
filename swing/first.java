package swing;

import javax.swing.*;

import org.w3c.dom.css.Counter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myframe extends JFrame implements ActionListener{
    JLabel l;
    JButton b,b1;
    int count = 0;

    myframe() {
        super("swing");
        setLayout(new FlowLayout());
        l = new JLabel();
        b = new JButton("click");
        b1 = new JButton("cancel");
        add(l);
        add(b);
        add(b1);
        
        b.addActionListener(this);//button chi functionality sathi
        getRootPane().setDefaultButton(b);//enter button kam kara sathi
        //b.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\image.png"));
        l.setToolTipText("Counter");
    }
    public void actionPerformed( ActionEvent ae){
        count++;
        l.setText("Clicked:"+ count);
    }

}

public class first {
    public static void main(String[] args) {
        myframe my = new myframe();
        my.setSize(500, 500);
        my.setVisible(true);
        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
