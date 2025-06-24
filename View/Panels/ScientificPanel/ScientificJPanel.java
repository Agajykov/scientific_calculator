package View.Panels.ScientificPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ScientificJPanel extends JPanel {

	public ScientificJPanel() {

		this.setLayout(new GridLayout(0, 3));
		//this.setPreferredSize(new Dimension(200, 500));

		JButton
			sinButton = new JButton("sin"),
			cosButton = new JButton("cosin"),
			tanButton = new JButton("tang"),
			contanButton = new JButton("cotan"),
			arcsinButton = new JButton("arcsin"),
			arcCosButton = new JButton("arccos"),
			arcTanButton = new JButton("arctan"),
			arcCotanButton = new JButton("arccotan"),
			logButton = new JButton("log"),
			lnButton = new JButton("Ln"),
			expButton = new JButton("e^x"),
			expTenButton = new JButton("10^x"),
			squareRootButton = new JButton("√x"),
			powerButton = new JButton("x^y"),
			factorialButton = new JButton("n!");
	
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
	
}
