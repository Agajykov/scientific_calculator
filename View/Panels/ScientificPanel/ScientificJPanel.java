package View.Panels.ScientificPanel;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ScientificJPanel extends JPanel {

	private JButton
		sinButton,
		cosButton, 
		tanButton,
		contanButton,
		arcsinButton,
		arcCosButton,
		arcTanButton,
		arcCotanButton,
		logButton,
		lnButton,
		expButton,
		expTenButton,
		squareRootButton,
		powerButton,
		factorialButton;
		
	List<JButton> availableScientifcButtons = new ArrayList<>();


	public ScientificJPanel() {

		this.setLayout(new GridLayout(0, 3));
		//this.setPreferredSize(new Dimension(200, 500));

		this.sinButton = new JButton("sin");
		this.cosButton = new JButton("cos");
		this.tanButton = new JButton("tan");
		this.contanButton = new JButton("cotan");
		this.arcsinButton = new JButton("arcsin");
		this.arcCosButton = new JButton("arccos");
		this.arcTanButton = new JButton("arctan");
		this.arcCotanButton = new JButton("arccotan");
		this.logButton = new JButton("log");
		this.lnButton = new JButton("Ln");
		this.expButton = new JButton("e^x");
		this.expTenButton = new JButton("10^x");
		this.squareRootButton = new JButton("√");
		this.powerButton = new JButton("^");
		this.factorialButton = new JButton("n!");

		storeAllScientificButtons(
			sinButton,
			cosButton, 
			tanButton,
			contanButton,
			arcsinButton,
			arcCosButton,
			arcTanButton,
			arcCotanButton,
			logButton,
			lnButton,
			expButton,
			expTenButton,
			squareRootButton,
			powerButton,
			factorialButton
		);
	
		this.add(sinButton);
		this.add(cosButton);
		this.add(tanButton);
		this.add(contanButton);
		this.add(arcsinButton);
		this.add(arcCosButton);
		this.add(arcTanButton);
		this.add(arcCotanButton);
		this.add(logButton);
		this.add(lnButton); 
		this.add(expButton);
		this.add(expTenButton);
		this.add(squareRootButton);
		this.add(powerButton);
		this.add(factorialButton);
	}

	public JButton getSinButton() {
		return sinButton;
	}

	public JButton getCosButton() {
		return cosButton;
	}

	public JButton getTanButton() {
		return tanButton;
	}

	public JButton getContanButton() {
		return contanButton;
	}

	public JButton getArcsinButton() {
		return arcsinButton;
	}

	public JButton getArcCosButton() {
		return arcCosButton;
	}

	public JButton getArcTanButton() {
		return arcTanButton;
	}

	public JButton getArcCotanButton() {
		return arcCotanButton;
	}

	public JButton getLogButton() {
		return logButton;
	}

	public JButton getLnButton() {
		return lnButton;
	}

	public JButton getExpButton() {
		return expButton;
	}

	public JButton getExpTenButton() {
		return expTenButton;
	}

	public JButton getSquareRootButton() {
		return squareRootButton;
	}

	public JButton getPowerButton() {
		return powerButton;
	}

	public JButton getFactorialButton() {
		return factorialButton;
	}

	private void storeAllScientificButtons(JButton... availableTriButtons) {
		this.availableScientifcButtons.addAll(Arrays.asList(availableTriButtons));
	}

	public List<JButton> getAllAvailableScientificButtons() {
		return availableScientifcButtons;
	}
	
}
