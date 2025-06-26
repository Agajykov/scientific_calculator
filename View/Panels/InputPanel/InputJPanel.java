package View.Panels.InputPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputJPanel extends JPanel {

	private JTextField userInput;
	private JLabel resultField;
	private StringBuilder inputBuilder;

	public InputJPanel() {

		this.setLayout(new GridLayout(1, 2));
		this.setPreferredSize(new Dimension(400, 200));

		this.userInput = new JTextField();
		this.userInput.setEditable(true);
		this.userInput.setFont(new Font("Arial", Font.PLAIN, 24));
		this.setBackground(Color.LIGHT_GRAY);
		
		this.inputBuilder = new StringBuilder();
		
		this.resultField = new JLabel("");

		this.add(userInput);
		this.add(resultField);

	}
	
	public void appendToInput(String s) {
		inputBuilder.append(s);
		userInput.setText(inputBuilder.toString());
	}

	public void clearInput() {
		inputBuilder.setLength(0);
		userInput.setText("");
	}

	public JTextField getUserInput() {
		return userInput;
	}

	public JLabel getResultField() {
		return resultField;
	}
	
}
