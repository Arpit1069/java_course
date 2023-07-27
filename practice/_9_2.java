package practice;

import javax.swing.*;

import loop.nestedfor;

import java.io.*;
import java.util.jar.JarFile;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class _9_2 extends JFrame implements ActionListener{
    JTextArea area ;
    JMenuBar menuu;
    JMenu filee;
    JMenuItem opee;
    JMenuItem savv;
    JPanel panee;
    JTextField texx;
    JButton ress;
    JButton senn;
    public _9_2(){
        super("file editor");
        area = new JTextArea();
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        menuu = new JMenuBar();
        filee = new JMenu("File");
        opee = new JMenuItem("open");
        savv = new JMenuItem("Save");

        filee.add(opee);
        filee.add(savv);
        menuu.add(filee);

        opee.addActionListener(this);
        savv.addActionListener(this);
        setJMenuBar(menuu);

        panee = new JPanel();
        texx = new JTextField(20);
        senn = new JButton("Send");
        ress = new JButton("Reset");

        senn.addActionListener(this);
        ress.addActionListener(this);
        panee.add(texx);
        panee.add(senn);
        panee.add(ress);

        add(area,BorderLayout.CENTER);
        add(panee,BorderLayout.SOUTH);

        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


    }
public void actionPerformed(ActionEvent e){
     
    if(e.getSource()== opee){
        JFileChooser cho = new JFileChooser();
        int result = cho.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            try{
                File file = cho.getSelectedFile();
                BufferedReader read = new BufferedReader(new FileReader(file));
                String line;
                area.setText("");
                while((line = read.readLine()) != null){
                    area.append(line+"/n");
                }
                read.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }else if(e.getSource()== savv){
        JFileChooser cho = new JFileChooser();
        int result = cho.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            try{
                File file = cho.getSelectedFile();
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                area.setText("");
                writer.write(area.getText());
                writer.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }else if(e.getSource()== senn){
        String t = texx.getText();
        area.append(t+"/n");
        texx.setText("");
    } else if (e.getSource()== ress){
        
        area.setText("");
        texx.setText("");
    }
}
    public static void main(String[] args) {
      new _9_2();   
    }
}
