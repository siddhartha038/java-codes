import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 18) {
            System.out.println("Congratulations you are eligble to drive");
        } else {
            System.out.println("Sorry you are not eligible to drive");
        }
    }

}
