import java.util.Scanner;

public class OddNumberMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int multiplication = 1;
        
        for (int i = 1; i <= n; i += 2) {
            multiplication *= i;
        }

        System.out.println("Multiplication of odd numbers up to " + n + ": " + multiplication);
    }
}
 