package Model;
public abstract class  CalculatorModel {

    public abstract double add(double a, double b);

    public abstract double subtract(double a, double b);

    public abstract double multiply(double a, double b);

    public abstract double divide(double a, double b); 

    public abstract double sin(double a);

    public abstract double cos(double a);

    public abstract double sqrt(double a);

	public abstract double log(double value);

	public abstract long factorial(int n);

	// Optional: Memory operations
    public abstract void memoryAdd(double value);
    public abstract void memorySubtract(double value);
    public abstract double memoryRecall();
    public abstract void memoryClear();

    // Optional: Validation
    public abstract boolean validateInput(String input);

    // Optional: History
    public abstract String getHistory();

    // Add more scientific functions as needed
}
