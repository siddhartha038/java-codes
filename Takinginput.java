import java.util.Scanner;

public class Takinginput {
    public static void main(String[] agrs) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number is :");
        System.out.println(sum);

    }

}
