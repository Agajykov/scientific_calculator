package View;
import javax.swing.*;

import View.Panels.InputPanel.InputPanel;
import View.Panels.KeypadPanel.KeypadPanel;
import View.Panels.MemoryPanel.MemoryJPanel;
import View.Panels.ScientificPanel.ScientificPanel;

import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
    private JFrame frame;
    private JTextField display;
    private JButton addButton, sinButton;

    public CalculatorView() {
    
        JFrame mainFrame = new JFrame("Scientific Calculator");
		mainFrame.setLayout(new BorderLayout());

		KeypadPanel keypadJPanel = new KeypadPanel();
		InputPanel inputJPanel = new InputPanel();
		ScientificPanel scientificJPanel = new ScientificPanel();
		MemoryJPanel memoryJPanel = new MemoryJPanel();

        mainFrame.add(inputJPanel, BorderLayout.NORTH);
        mainFrame.add(scientificJPanel,BorderLayout.WEST);
        mainFrame.add(keypadJPanel, BorderLayout.CENTER);
        mainFrame.add(memoryJPanel, BorderLayout.EAST);
    
        
        mainFrame.setSize(300,300);  
        mainFrame.setVisible(true);  
    }

}
