import java.util.Scanner;

public class markspercentge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your roll no:");
        int b = sc.nextInt();
        System.out.println("Enter the marks of subject 1:");
        int c = sc.nextInt();
        System.out.println("Enter the marks of subject 2:");
        int d = sc.nextInt();
        System.out.println("Enter the marks of subject 3:");
        int e = sc.nextInt();
        System.out.println("Enter the marks of subject 4:");
        int f = sc.nextInt();
        System.out.println("Enter the marks of subject 5:");
        int g = sc.nextInt();
        int sum = c + d + e + f + g;
        float percentage = sum * 0.2f;
        System.out.println("The percentage obtained by the student is:");
        System.out.println(percentage);
        sc.close();
    }

}
