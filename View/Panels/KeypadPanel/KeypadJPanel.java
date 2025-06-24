package View.Panels.KeypadPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KeypadJPanel extends JPanel {

	List<JButton> availableNumericalButtons = new ArrayList<>();

	public KeypadJPanel() {
		this.setLayout(new GridLayout(0, 4));

		JButton
			clear = new JButton("C"),
			plusButton = new JButton("+"),
			negativeSignButton = new JButton("-"),
			divisionButton = new JButton("/"),
			multiplicationSign = new JButton("*"),
			buttonSeven = new JButton("7"),
			buttonEight = new JButton("8"),
			buttonNine = new JButton("9"),
			minuseButton = new JButton("-(Sign)"),
			buttonFour = new JButton("4"),
			buttonFive = new JButton("5"),
			buttonSix =  new JButton("6"),
			
			buttonOne = new JButton("1"),
			buttonTwo = new JButton("2"),
			buttonThree = new JButton("3"),
			pointButton = new JButton("."),
			buttonZero = new JButton("0"),
			buttonEqual = new JButton("="),
			historyButton = new JButton("History");

			buttonEqual.setBackground(Color.YELLOW);

		//check the history icon
		
	
		
		this.add(plusButton); 
		this.add(negativeSignButton);
		this.add(divisionButton);
		this.add(multiplicationSign);
		this.add(buttonSeven); 
		this.add(buttonEight);
		this.add(buttonNine);
		this.add(buttonFour);
		this.add(buttonFive);
		this.add(buttonSix);
		this.add(buttonOne);
		this.add(buttonTwo);
		this.add(buttonThree);
		this.add(buttonZero);
		this.add(pointButton);
		this.add(buttonEqual);
		this.add(clear);
		this.add(minuseButton);
		this.add(historyButton);

		storeKeyPadNumericalButtons(
			buttonZero,
			buttonOne,
			buttonTwo,
			buttonThree,
			buttonFour,
			buttonFive,
			buttonSix,
			buttonSeven,
			buttonEight,
			buttonNine,
			pointButton
		);

		applyNumericalKeypadTheme();

	}

	public void storeKeyPadNumericalButtons(JButton... keypadButtons) {
		this.availableNumericalButtons.addAll(Arrays.asList(keypadButtons));
	}

	public void applyNumericalKeypadTheme() {
		for (JButton button : this.availableNumericalButtons) {
			button.setBackground(Color.BLACK);
			button.setForeground(Color.WHITE);
		}
	}

}
