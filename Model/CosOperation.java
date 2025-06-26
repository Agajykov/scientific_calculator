package Model;

import java.util.Stack;

public class CosOperation implements Operation{
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.cos(Math.toRadians(a)));
    }
}
