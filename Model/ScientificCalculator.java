package Model;

import Exceptions.DivingToZeroException;

public class ScientificCalculator extends MathOperationModel {

	private double sumResult;
	private double substractResult;
	private double multipluResult;
	private double divideResult;
	private double sinResult;
	private double cosResult;
	private double sqrtResult;
	private double logResult;
	private long factorialResult;
	private double memory;

	private StringBuilder history = new StringBuilder();
	
	@Override
	public void add(double a, double b) {
		this.sumResult = a + b;
	}

	@Override
	public void subtract(double a, double b) {
		this.substractResult = a - b;
		
	}

	@Override
	public void multiply(double a, double b) {
		this.multipluResult = a * b;
	}

	@Override
	public void divide(double a, double b) throws DivingToZeroException {
		
		if (b == 0) {
			throw new DivingToZeroException(a + " can not be divided by 0 ");
		}

		this.divideResult = a / b;

	}

	@Override
	public void sin(double a) {
		this.sinResult = Math.sin(a);
	}

	@Override
	public void cos(double a) {
		this.cosResult = Math.cos(a);
	}

	@Override
	public void sqrt(double a) {
		this.sqrtResult = Math.sqrt(a);
	}

	@Override
	public void log(double value) {
		  if (value <= 0) {
            String lastError = "Error: Logarithm of non-positive number";
            throw new IllegalArgumentException(lastError);
        }
        this.logResult=  Math.log10(value);
	}

	@Override
	public void factorial(int n) {
		if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            this.factorialResult = 1;
        } 
		else {
            factorial(n - 1);
        	this.factorialResult = this.factorialResult * n;  // multiply after recursion returns
        }
	}

	@Override
	public void memoryAdd(double value) {
		this.memory += value;
	}

	@Override
	public void memorySubtract(double value) {
		this.memory -= value;	
	}

	@Override
	public double memoryRecall() {
		return 	this.memory;
	}

	@Override
	public void memoryClear() {
		this.memory = 0.0;	
	}


	// History of calculations
    @Override
    public void addToHistory(String expression, double result) {
        history.append(expression).append(" = ").append(result).append("\n");
    }

    @Override
    public String getHistory() {
        return history.toString();
    }

    @Override
    public void clearHistory() {
        history.setLength(0);
    }

	@Override
	public boolean validateInput(String input) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'validateInput'");
	}
	
}
