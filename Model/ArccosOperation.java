package Model;

import java.util.Stack;

public class ArccosOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.toDegrees(Math.acos(a)));
    }
}