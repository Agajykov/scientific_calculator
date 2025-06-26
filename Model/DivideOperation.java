package Model;

import java.util.Stack;

public class DivideOperation implements Operation{
	public void apply(Stack<Double> stack) {
        double b = stack.pop();
        double a = stack.pop();
        stack.push(a / b);
    }
}
