import java.util.Scanner;

public class BinaryArithmeticExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary arithmetic expression: ");
        String expression = scanner.nextLine();

        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            System.out.println("Invalid expression!");
            return;
        }

        int operand1 = Integer.parseInt(tokens[0], 2);
        int operand2 = Integer.parseInt(tokens[2], 2);
        String operator = tokens[1];

        int result;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 % operand2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        String binaryResult = Integer.toBinaryString(result);
        System.out.println("Result: " + binaryResult);
    }
}

// Program Done 

