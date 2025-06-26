
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import Model.Calculator;
import Model.History;
import Model.HistoryModel;
import View.Panels.InputPanel.InputJPanel;
import View.Panels.KeypadPanel.KeypadJPanel;
import View.Panels.MemoryPanel.MemoryJPanel;
import View.Panels.ScientificPanel.ScientificJPanel;

public class CalculatorController {
    
    private InputJPanel inputPanel;
	private KeypadJPanel keypadJPanel;
	private ScientificJPanel scientificJPanel;
	private MemoryJPanel memoryJPanel;

    public CalculatorController(
		//Model
	
		//View
		InputJPanel inputPanel, 
        KeypadJPanel keypadPanel,
        ScientificJPanel scientificPanel,
        MemoryJPanel memoryPanel	
	) {
        
        this.inputPanel = inputPanel;
        this.keypadJPanel = keypadPanel;
        this.scientificJPanel = scientificPanel;
        this.memoryJPanel = memoryPanel;
		
		registerListeners();
    }

	private void registerListeners() {

		
		for (JButton button : keypadJPanel.getAllAvailableButtons()) {
			
			 final JButton btn = button; // shadow copy
		
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					inputPanel.appendToInput(btn.getText());
					
				}
			});
		}

		for (JButton button : scientificJPanel.getAllAvailableScientificButtons()) {
			
			 final JButton btn = button; // shadow copy
		
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					inputPanel.appendToInput(btn.getText());
					
				}
			});
		}

		// Handle Clear Button
		keypadJPanel.getClearButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inputPanel.clearInput();
				inputPanel.getResultField().setText("0");
			}
		});


		HistoryModel historyModel = new HistoryModel();
		// Collect Result
		keypadJPanel.getButtonEqual().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				final String mathExpression = inputPanel.getUserInput().getText();
				double resultOfCalculation = Calculator.calculate(mathExpression);

				//Implement history where history object takes MathExpression and result
				historyModel.addHistory(mathExpression, resultOfCalculation);
			
				// inputPanel.add(new JLabel(mathExpression));
				inputPanel.getResultField().setText(String.valueOf(resultOfCalculation));
			}
		});

		keypadJPanel.getHistoryButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				List<History> listOfHistory = historyModel.getHistoryList();
				for (History history : listOfHistory) {
					final String expression = history.getMathExpressionPassed();
					final String result = String.valueOf(history.getResultPassed());
					// inputPanel.getHistoryfield().setText(expression + "=" + result);
					inputPanel.appendToHistory(expression, result);
				}

			}
		});
		
	}
	

    
}
