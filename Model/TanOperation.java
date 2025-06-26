package Model;

import java.util.Stack;

public class TanOperation implements Operation{
	 public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.tan(Math.toRadians(a)));
    }
}


