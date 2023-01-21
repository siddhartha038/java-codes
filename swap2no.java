import java.util.Scanner;

public class swap2no {
    public static void main(String[] args) {
        System.out.println("Swapping 2 no.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t;

        t = x;
        x = y;
        y = t;

        System.out.println("Value after swapping");
        System.out.println(x);
        System.out.println(y);

    }

}
