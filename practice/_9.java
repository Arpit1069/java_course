package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _9 extends JFrame  implements ActionListener {
    JTextArea edi;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem open, save;
    JPanel panel;
    JTextField text;
    JButton send, reset;
    public _9(){
        super("File");
        edi = new JTextArea();
        edi.setLineWrap(true);
        edi.setWrapStyleWord(true);
         
        menuBar = new JMenuBar();
        fileMenu = new JMenu("file");
        open = new JMenuItem("open");
        save = new JMenuItem("save");
        
        open.addActionListener(this);
        save.addActionListener(this);

        fileMenu.add(open);
        fileMenu.add(save);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        panel = new JPanel();
        text = new JTextField(20);
        send = new JButton("Send");
        reset = new JButton("Reset");
        send.addActionListener(this);
        reset.addActionListener(this);
        panel.add(text);
        panel.add(send);
        panel.add(reset);

        add(new JScrollPane(edi),BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);
         
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== open){
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(this);
            if( result == JFileChooser.APPROVE_OPTION){
                try {
                    File file = chooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    edi.setText("");
                    while((line = reader.readLine()) != null){
                        edi.append(line + "/n");
                    }
                    reader.close();
                }
                catch(IOException ex){
                    ex.printStackTrace();
                }

            }

        }else if (e.getSource()== save){
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showSaveDialog(chooser);
            if(result == JFileChooser.APPROVE_OPTION){
                try{
                    File file = chooser.getSelectedFile();
                    BufferedWriter writer =  new BufferedWriter(new FileWriter(file));
                    writer.write(edi.getText());
                    writer.close();
                } catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource()== send){
            String text1 = text.getText();
            edi.append(text1+"/n");
            text.setText("");
        } else if (e.getSource()== reset){
            
            edi.setText("");
            text.setText("");
        }
        
    }
    public static void main(String[] args) {
        new _9();
    }
}
