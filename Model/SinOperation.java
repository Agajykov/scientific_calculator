package Model;

import java.util.Stack;

public class SinOperation implements Operation{
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.sin(Math.toRadians(a)));
    }
}
