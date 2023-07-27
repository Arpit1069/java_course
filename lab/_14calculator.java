package lab;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _14calculator extends JFrame implements ActionListener {

    private JTextField display;
    private double operand1, operand2, result;
    private char operator;

    public _14calculator() {
        super("calculator");
        setSize(300, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create display
        display = new JTextField(10);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
    
        if (action.matches("[0-9]")) {
            if (operator == '\u0000') {
                operand1 = operand1 * 10 + Double.parseDouble(action);
                display.setText(display.getText() + action);
            } else {
                operand2 = operand2 * 10 + Double.parseDouble(action);
                display.setText(display.getText() + action);
            }
        } else if (action.matches("[+\\-*/]")) {
            operator = action.charAt(0);
            display.setText(display.getText() + action);
        } else if (action.equals("=")) {
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
            }
            display.setText(Double.toString(result));
            operand1 = result;
            operand2 = 0;
            operator = '\u0000';
        } else if (action.equals("C")) {
            display.setText("");
            operand1 = 0;
            operand2 = 0;
            operator = '\u0000';
        }
    }
    
    public static void main(String[] args) {
        new _14calculator();
    }
}
