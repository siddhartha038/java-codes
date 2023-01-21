import java.util.Scanner;

public class expression {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("Enter the value of C");
        int c = sc.nextInt();
        System.out.println("The required answer is:");
        int d = a + b - c;
        System.out.println(d);
    }
}
