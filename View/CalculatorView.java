package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
    private JFrame frame;
    private JTextField display;
    private JButton addButton, sinButton;

    public CalculatorView() {
        frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Display
        display = new JTextField();
        frame.add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Example buttons
        addButton = new JButton("+");
        sinButton = new JButton("sin");

        panel.add(addButton);
        panel.add(sinButton);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public String getUserInput() {
        return display.getText();
    }

    public void setDisplayValue(String value) {
        display.setText(value);
    }

    // Allow controller to hook into buttons
    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void addSinButtonListener(ActionListener listener) {
        sinButton.addActionListener(listener);
    }
}
