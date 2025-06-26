package View.Panels.KeypadPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KeypadJPanel extends JPanel {

	private JButton clearButton;
	private JButton plusButton;
	private JButton minusButton;
	private JButton divisionButton;
	private JButton multiplicationButtom;
	private JButton buttonSeven;
	private JButton buttonEight;
	private JButton buttonNine;
	private JButton leftParanthesis;
	private JButton rightParanthesis;
	private JButton buttonFour;
	private JButton buttonFive;
	private JButton buttonSix;
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JButton dotButton;
	private JButton buttonZero;
	private JButton buttonEqual;
	private JButton historyButton;


	List<JButton> availableNumericalButtons = new ArrayList<>();
	List<JButton> availableArithmeticButtons = new ArrayList<>();
	List<JButton> allKeypadButtons = new ArrayList<>();

	public KeypadJPanel() {

		this.setLayout(new GridLayout(0, 4));

		//Basic Arithmetic
		this.plusButton = new JButton("+");
		this.minusButton = new JButton("-");
		this.divisionButton = new JButton("/");
		this.multiplicationButtom = new JButton("*");

		this.clearButton = new JButton("C");
		
		//Digits
		this.buttonZero = new JButton("0");
		this.buttonOne = new JButton("1");
		this.buttonTwo = new JButton("2");
		this.buttonThree = new JButton("3");
		this.buttonFour = new JButton("4");
		this.buttonFive = new JButton("5");
		this.buttonSix =  new JButton("6");
		this.buttonSeven = new JButton("7");
		this.buttonEight = new JButton("8");
		this.buttonNine = new JButton("9");
		
		this.leftParanthesis = new JButton("(");
		this.rightParanthesis = new JButton(")");
		
		this.dotButton = new JButton(".");
		this.buttonEqual = new JButton("=");
		this.historyButton = new JButton("History");

		storeAllCalculatorInputButtons(
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
			plusButton,
			minusButton,
			multiplicationButtom,
			divisionButton,
			leftParanthesis,
			rightParanthesis,
			dotButton
		);

		this.buttonEqual.setBackground(Color.ORANGE);

		this.add(plusButton); 
		this.add(minusButton);
		this.add(divisionButton);
		this.add(multiplicationButtom);
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
		this.add(dotButton);
		this.add(buttonEqual);
		this.add(clearButton);
		this.add(leftParanthesis);
		this.add(rightParanthesis);
		this.add(historyButton);

		storeBasicArithmeticOperations(plusButton, minusButton, multiplicationButtom, divisionButton);

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
			dotButton
		);

		applyNumericalKeypadTheme();
		applyArithmeticalKeypadTheme();
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public JButton getAdditionButton() {
		return plusButton;
	}

	public JButton getMinusButton() {
		return minusButton;
	}

	public JButton getDivisionButton() {
		return divisionButton;
	}

	public JButton getMultiplicationButtom() {
		return multiplicationButtom;
	}

	public JButton getButtonSeven() {
		return buttonSeven;
	}

	public JButton getButtonEight() {
		return buttonEight;
	}

	public JButton getButtonNine() {
		return buttonNine;
	}

	public JButton getLeftParanthesis() {
		return leftParanthesis;
	}

	public JButton getRightParanthesis() {
		return rightParanthesis;
	}

	public JButton getButtonFour() {
		return buttonFour;
	}

	public JButton getButtonFive() {
		return buttonFive;
	}

	public JButton getButtonSix() {
		return buttonSix;
	}

	public JButton getButtonOne() {
		return buttonOne;
	}

	public JButton getButtonTwo() {
		return buttonTwo;
	}

	public JButton getButtonThree() {
		return buttonThree;
	}

	public JButton getDotButton() {
		return dotButton;
	}

	public JButton getButtonZero() {
		return buttonZero;
	}

	public JButton getButtonEqual() {
		return buttonEqual;
	}

	public JButton getHistoryButton() {
		return historyButton;
	}

	public void storeBasicArithmeticOperations(JButton... arithmeticOperationButtons) {
		this.availableArithmeticButtons.addAll(Arrays.asList(arithmeticOperationButtons));
	}

	public void storeKeyPadNumericalButtons(JButton... keypadButtons) {
		this.availableNumericalButtons.addAll(Arrays.asList(keypadButtons));
	}

	private void applyNumericalKeypadTheme() {
		for (JButton button : this.availableNumericalButtons) {
			button.setBackground(Color.BLACK);
			button.setForeground(Color.WHITE);
		}
	}

	private void applyArithmeticalKeypadTheme() {
		for (JButton button: this.availableArithmeticButtons) {
			button.setBackground(Color.DARK_GRAY);
			button.setForeground(Color.WHITE);
		}
	}

	public List<JButton> getAvailableNumericalButtons() {
		return availableNumericalButtons;
	}

	private void storeAllCalculatorInputButtons(JButton ... allKeyPadButtons) {
		this.allKeypadButtons.addAll(Arrays.asList(allKeyPadButtons));
	}

	public List<JButton> getAllAvailableButtons() {
		return allKeypadButtons;
	}

}
