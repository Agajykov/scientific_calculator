package Model;

import Exceptions.DivingToZeroException;

public abstract class  MathOperationModel {

    public abstract void add(double a, double b);
    public abstract void subtract(double a, double b);
    public abstract void multiply(double a, double b);
    public abstract void divide(double a, double b) throws DivingToZeroException; 
    public abstract void sin(double a);
    public abstract void cos(double a);
    public abstract void sqrt(double a);
	public abstract void log(double value);
	public abstract void factorial(int n);

	// Optional: Memory operations
    public abstract void memoryAdd(double value);
    public abstract void memorySubtract(double value);
    public abstract double memoryRecall();
    public abstract void memoryClear();
	
    // Optional: Validation
    public abstract boolean validateInput(String input);
	
    // Optional: History
    public abstract void addToHistory(String expression, double result);
    public abstract String getHistory();
    public abstract void clearHistory();
   
    // Add more scientific functions as needed
}
