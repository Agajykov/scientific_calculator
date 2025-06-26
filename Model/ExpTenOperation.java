package Model;

import java.util.Stack;

public class ExpTenOperation implements Operation {
    @Override
	public void apply(Stack<Double> stack) {
        double a = stack.pop();
        stack.push(Math.pow(10, a)); // 10^x
    }
}