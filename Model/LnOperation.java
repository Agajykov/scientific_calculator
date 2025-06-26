package Model;

import java.util.Stack;

public class LnOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.log(a));
    }
}