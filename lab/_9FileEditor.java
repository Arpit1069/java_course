package lab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class _9FileEditor extends JFrame implements ActionListener {
    JTextArea editor;
    JMenuBar menubar;
    JMenu fileMenu, helpMenu;
    JMenuItem openItem, saveItem, aboutItem;
    JPanel panel;
    JTextField textField;
    JButton sendButton, resetButton;

    public _9FileEditor() {
        super("File Editor");

        // create editor
        editor = new JTextArea();
        editor.setLineWrap(true);
        editor.setWrapStyleWord(true);

        // create menu bar
        menubar = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menubar.add(fileMenu);

        // create Help menu
        helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(this);
        helpMenu.add(aboutItem);
        menubar.add(helpMenu);

        setJMenuBar(menubar);

        // create panel for text field and buttons
        panel = new JPanel();
        textField = new JTextField(20);
        sendButton = new JButton("Send");
        resetButton = new JButton("Reset");

        sendButton.addActionListener(this);
        resetButton.addActionListener(this);

        panel.add(textField);
        panel.add(sendButton);
        panel.add(resetButton);

        // add components to frame
        add(new JScrollPane(editor), BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        // set frame size and make visible
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = chooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    editor.setText("");
                    while ((line = reader.readLine()) != null) {
                        editor.append(line + "\n");
                    }
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == saveItem) {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = chooser.getSelectedFile();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(editor.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == sendButton) {
            String text = textField.getText();
            editor.append(text + "\n");
            textField.setText("");
        } else if (e.getSource() == resetButton) {
            editor.setText("");
            textField.setText("");
        } else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "Simple File Editor\nVersion 1.0", "About", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new _9FileEditor();
    }
}
    