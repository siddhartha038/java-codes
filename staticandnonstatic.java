public class staticandnonstatic {

}// Java program to demonstrate execution
 // of static blocks and variables

class Test {
    // static variable
    static int a = sid();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int sid() {
        System.out.println("from sid");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Value of a : " + a);
    }
}
