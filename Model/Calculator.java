package Model;
import java.util.*;

public class Calculator {
    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("+", new AddOperation());
        operations.put("-", new SubtractOperation());
        operations.put("*", new MultiplyOperation());
        operations.put("/", new DivideOperation());
        operations.put("^", new PowerOperation());
        operations.put("!", new FactorialOperation());
        operations.put("√", new SquareRootOperation());

        operations.put("sin", new SinOperation());
        operations.put("cos", new CosOperation());
        operations.put("tan", new TanOperation());
        operations.put("cotan", new CotanOperation());
        operations.put("arcsin", new ArcsinOperation());
        operations.put("arccos", new ArccosOperation());
        operations.put("arctan", new ArctanOperation());
        operations.put("arccotan", new ArccotanOperation());

        operations.put("log", new LogOperation());
        operations.put("ln", new LnOperation());
        operations.put("e^x", new ExpOperation());
        operations.put("10^x", new ExpTenOperation());
    }

    public static double calculate(String expression) {
        List<String> tokens = tokenize(expression);
        List<String> postfix = toPostfix(tokens);
        return evaluatePostfix(postfix);
    }

    private static List<String> tokenize(String expr) {
        List<String> tokens = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (Character.isLetter(c)) {
                buffer.setLength(0);
                while (i < expr.length() && (Character.isLetter(expr.charAt(i)) || expr.charAt(i) == '^' )) {
                    buffer.append(expr.charAt(i));
                    i++;
                }
                tokens.add(buffer.toString());
                i--;
            } else if (Character.isDigit(c) || c == '.') {
                buffer.setLength(0);
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    buffer.append(expr.charAt(i));
                    i++;
                }
                tokens.add(buffer.toString());
                i--;
            } else if ("+-*/()^!√".indexOf(c) >= 0) {
                tokens.add(String.valueOf(c));
            } else if (Character.isWhitespace(c)) {
                continue;
            } else {
                throw new IllegalArgumentException("Invalid character: " + c);
            }
        }

        return tokens;
    }

    private static List<String> toPostfix(List<String> tokens) {
        List<String> output = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        Map<String, Integer> precedence = new HashMap<>();
        precedence.put("!", 5); // postfix
        precedence.put("√", 4); // unary
        precedence.put("sin", 4);
        precedence.put("cos", 4);
        precedence.put("tan", 4);
        precedence.put("cotan", 4);
        precedence.put("arcsin", 4);
        precedence.put("arccos", 4);
        precedence.put("arctan", 4);
        precedence.put("arccotan", 4);
        precedence.put("log", 4);
        precedence.put("ln", 4);
        precedence.put("e^x", 4);
        precedence.put("10^x", 4);
        precedence.put("^", 3);
        precedence.put("*", 2);
        precedence.put("/", 2);
        precedence.put("+", 1);
        precedence.put("-", 1);

        for (String token : tokens) {
            if (isNumber(token)) {
                output.add(token);
            } else if (operations.containsKey(token)) {
                while (!stack.isEmpty() && operations.containsKey(stack.peek()) &&
                        precedence.get(token) <= precedence.get(stack.peek())) {
                    output.add(stack.pop());
                }
                stack.push(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.add(stack.pop());
                }
                if (stack.isEmpty() || !stack.pop().equals("(")) {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
            }
        }

        while (!stack.isEmpty()) {
            String op = stack.pop();
            if (op.equals("(") || op.equals(")")) {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            output.add(op);
        }

        return output;
    }

    private static double evaluatePostfix(List<String> postfix) {
        Stack<Double> stack = new Stack<>();

        for (String token : postfix) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (operations.containsKey(token)) {
                operations.get(token).apply(stack);
            } else {
                throw new IllegalArgumentException("Unknown token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalStateException("Invalid expression evaluation");
        }

        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
