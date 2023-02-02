import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("Area of the tringle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area1 = (a * b);
        float triarea = area1 * 0.5f;
        System.out.println(triarea);

    }

}
