package View;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import View.Panels.InputPanel.InputJPanel;
import View.Panels.KeypadPanel.KeypadJPanel;
import View.Panels.MemoryPanel.MemoryJPanel;
import View.Panels.ScientificPanel.ScientificJPanel;

public class CalculatorView {

	private KeypadJPanel keypadJPanel;
	private InputJPanel inputJPanel;
	private ScientificJPanel scientificJPanel;
	private MemoryJPanel memoryJPanel;

     public CalculatorView() {
		prepareGUI();
    }

	private void prepareGUI() {

		JFrame mainFrame = new JFrame("Scientific Calculator");
		mainFrame.setLayout(new BorderLayout());

		keypadJPanel = new KeypadJPanel();
		inputJPanel = new InputJPanel();
		scientificJPanel = new ScientificJPanel();
		memoryJPanel = new MemoryJPanel();

        mainFrame.add(inputJPanel, BorderLayout.NORTH);
        mainFrame.add(scientificJPanel,BorderLayout.WEST);
        mainFrame.add(keypadJPanel, BorderLayout.CENTER);
        mainFrame.add(memoryJPanel, BorderLayout.EAST);
    
        mainFrame.setSize(800, 600); 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);  
	}

	public KeypadJPanel getKeypadJPanel() {
		return keypadJPanel;
	}

	public InputJPanel getInputJPanel() {
		return inputJPanel;
	}

	public ScientificJPanel getScientificJPanel() {
		return scientificJPanel;
	}

	public MemoryJPanel getMemoryJPanel() {
		return memoryJPanel;
	}


}
