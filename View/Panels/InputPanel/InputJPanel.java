package View.Panels.InputPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputJPanel extends JPanel {

	public InputJPanel() {
	this.setLayout(new GridLayout(1, 2));
	this.setPreferredSize(new Dimension(400, 80));

	JTextField inputField = new JTextField();
	inputField.setEditable(false);
	inputField.setFont(new Font("Arial", Font.PLAIN, 24));


	JLabel resultField = new JLabel("Result = ");

	this.add(inputField);
	this.add(resultField);
	
	this.setBackground(Color.LIGHT_GRAY);

	}
}
