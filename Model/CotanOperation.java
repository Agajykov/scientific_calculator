package Model;

import java.util.Stack;

public class CotanOperation implements Operation {
	@Override
    public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(1.0 / Math.tan(Math.toRadians(a)));
    }
}