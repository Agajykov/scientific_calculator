package Model;

import java.util.Stack;

public class FactorialOperation  implements Operation{

	@Override
	public void apply(Stack<Double> stack) {
		int a = (int) Math.floor(stack.pop());
        if (a < 0) throw new IllegalArgumentException("Factorial of negative number not defined");

        double result = 1.0;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        stack.push(result);
	}

}
