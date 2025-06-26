package Model;

import java.util.Stack;

public class PowerOperation implements Operation {

	@Override
	public void apply(Stack<Double> stack) {
		double exponent = stack.pop();
        double base = stack.pop();
        stack.push(Math.pow(base, exponent)); // x^y
	} 
	

}
