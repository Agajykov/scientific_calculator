

import View.CalculatorView;
import Model.Operation;
public class Main {
    public static void main(String[] args) {
        // Operation model = new Operation();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(
			view.getInputJPanel(),
			view.getKeypadJPanel(),
			view.getScientificJPanel(),
			view.getMemoryJPanel());
    }
}
