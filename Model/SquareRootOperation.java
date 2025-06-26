package Model;

import java.util.Stack;

public class SquareRootOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.sqrt(a));
    }
}