package lab;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _10AdditionApplication extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton clearButton;
    private JTextField resultField;

    public _10AdditionApplication() {
        setTitle("Addition Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLayout(new FlowLayout());

        // Set the background color
        getContentPane().setBackground(Color.getHSBColor(18, 26, 91));

        // Create the titled border
        Border border = BorderFactory.createTitledBorder("Number Addition");

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
        resultField = new JTextField("");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                resultField.setText(Integer.toString(sum));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                resultField.setText("");
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Set the titled border to the JPanel
        JPanel panel = new JPanel();
        panel.setBorder(border);
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Number 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Number 2:"));
        panel.add(textField2);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);
        panel.add(addButton);
        panel.add(clearButton);

        add(panel);
        add(exitButton);
    }

    public static void main(String[] args) {
       
                _10AdditionApplication app = new _10AdditionApplication();
                app.setVisible(true);
            }
        
    }

