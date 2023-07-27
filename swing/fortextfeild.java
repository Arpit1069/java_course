package swing;

import javax.swing.*;
import java.awt.*;

class myframe1 extends JFrame {
    myframe1(){
        setLayout(new FlowLayout());
        JTextField j = new JTextField(15);
        add(j);
    }

}

public class fortextfeild {
    public static void main(String[] args) {
        myframe1 mf = new myframe1();
        mf.setSize(500, 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
