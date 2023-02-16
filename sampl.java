class sampl {
    int a;
    String name;
    boolean c;

    sampl() {
        a = 20;
        name = "Siddhartha Singh";
        c = true;

    }

    void disp() {
        System.out.println(a + "  " + name + " " + c);
    }

    public class A {
        public static void main(String[] args) {
            sampl ref = new sampl();
        }
    }
}