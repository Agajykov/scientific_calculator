package Model;

public class History {

	private String mathExpressionPassed; 
	private double resultPassed;

	public History(String mathExpressionPassed, double resultPassed) {
		this.mathExpressionPassed = mathExpressionPassed;
		this.resultPassed = resultPassed;
	}

	public String getMathExpressionPassed() {
		return mathExpressionPassed;
	}

	public void setMathExpressionPassed(String mathExpressionPassed) {
		this.mathExpressionPassed = mathExpressionPassed;
	}

	public double getResultPassed() {
		return resultPassed;
	}

	public void setResultPassed(double resultPassed) {
		this.resultPassed = resultPassed;
	}

	@Override
	public String toString() {
		return mathExpressionPassed + " = " + resultPassed;
	}

}
