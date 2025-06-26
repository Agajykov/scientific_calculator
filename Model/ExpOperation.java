package Model;

import java.util.Stack;

public class ExpOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.exp(a));  // e^x
    }
}