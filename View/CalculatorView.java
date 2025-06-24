package View;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import View.Panels.InputPanel.InputJPanel;
import View.Panels.KeypadPanel.KeypadJPanel;
import View.Panels.MemoryPanel.MemoryJPanel;
import View.Panels.ScientificPanel.ScientificJPanel;

public class CalculatorView {

     public CalculatorView() {
		prepareGUI();
    }

	private void prepareGUI() {

		JFrame mainFrame = new JFrame("Scientific Calculator");
		mainFrame.setLayout(new BorderLayout());

		KeypadJPanel keypadJPanel = new KeypadJPanel();
		InputJPanel inputJPanel = new InputJPanel();
		ScientificJPanel scientificJPanel = new ScientificJPanel();
		MemoryJPanel memoryJPanel = new MemoryJPanel();

        mainFrame.add(inputJPanel, BorderLayout.NORTH);
        mainFrame.add(scientificJPanel,BorderLayout.WEST);
        mainFrame.add(keypadJPanel, BorderLayout.CENTER);
        mainFrame.add(memoryJPanel, BorderLayout.EAST);
    
        mainFrame.setSize(700, 600); 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);  
	}
}
