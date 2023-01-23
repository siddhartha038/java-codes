import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter uour name:");
        String name = sc.nextLine();
        System.out.println("Enter the marks of Subject 1:");
        int a = sc.nextInt();
        if (a > 33) {
            System.out.println("You are passed in this Subject");
        } else {
            System.out.println("You have failed in this exam");
        }
        System.out.println("Enter the marks of Subject 2:");
        int b = sc.nextInt();
        if (b > 33) {
            System.out.println("You are passed in this Subject");
        } else {
            System.out.println("You have failed in the exam");
        }
        System.out.println("Enter the marks of Subject 3:");
        int c = sc.nextInt();
        if (c > 33) {
            System.out.println("You are passed in this Subject");
        } else {
            System.out.println("You have failed in the exam");
        }
        int sum = a + b + c;
        if (sum > 99) {
            System.out.println("Passed in internal subject");
        } else {
            System.out.println("You have failed in the overall examination");
        }
        float percentage = sum * 0.3333f;
        System.out.println("FINAL RESULT:");
        if (percentage > 40) {
            System.out.println("Congratulations you have qualified the examniations");
        } else {
            System.out.println("Sorry you work harder next time");
        }

    }

}
