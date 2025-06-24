
import Model.MathOperationModel;
import View.CalculatorView;

public class CalculatorController {
    private MathOperationModel model;
    private CalculatorView view;

    public CalculatorController(MathOperationModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addAddButtonListener(e -> addButtonPressed());
        this.view.addSinButtonListener(e -> sinButtonPressed());
    }

    private void addButtonPressed() {
        try {
            String input = view.getUserInput();
            String[] parts = input.split("\\+");
            double a = Double.parseDouble(parts[0].trim());
            double b = Double.parseDouble(parts[1].trim());
            double result = model.add(a, b);
            view.setDisplayValue(String.valueOf(result));
        } catch (Exception ex) {
            view.setDisplayValue("Error");
        }
    }

    private void sinButtonPressed() {
        try {
            String input = view.getUserInput();
            double a = Double.parseDouble(input.trim());
            double result = model.sin(a);
            view.setDisplayValue(String.valueOf(result));
        } catch (Exception ex) {
            view.setDisplayValue("Error");
        }
    }
}
