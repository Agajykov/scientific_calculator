package Model;

import java.util.Stack;

public class ArccotanOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.toDegrees(Math.atan(1.0 / a)));
    }
}