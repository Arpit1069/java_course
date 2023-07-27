package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _25ButtonDemo extends JFrame implements ActionListener {
    private JLabel label;

    public _25ButtonDemo() {
        setTitle("Button Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Create buttons
        JButton button1 = createButton("Button 1", Color.RED, "Text for Button 1");
        JButton button2 = createButton("Button 2", Color.BLUE, "Text for Button 2");
        JButton button3 = createButton("Button 3", Color.GREEN, "Text for Button 3");

        // Create label
        label = new JLabel("Button text will be displayed here");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Add components to the frame
        add(button1);
        add(button2);
        add(button3);
        add(label);

        setVisible(true);
    }

    private JButton createButton(String text, Color color, String buttonText) {
        JButton button = new JButton(text);
        button.setForeground(color);
        button.addActionListener(this);
        button.setActionCommand(buttonText);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getActionCommand();

            // Create a new JLabel with the text of the clicked button
            JLabel newLabel = new JLabel(buttonText);
            newLabel.setFont(new Font("Arial", Font.BOLD, 16));
            newLabel.setForeground(button.getForeground());

            // Remove the old label and add the new one to the frame
            remove(label);
            add(newLabel);
            label = newLabel;

            // Refresh the frame to update the changes
            revalidate();
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(_25ButtonDemo::new);
    }
}
