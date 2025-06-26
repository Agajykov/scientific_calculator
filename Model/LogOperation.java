package Model;

import java.util.Stack;

public class LogOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.log10(a));
    }
}