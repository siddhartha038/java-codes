public class practicesetch3 {
    public static void main(String[] args) {
        // String name = "This is Siddhartha Singh";
        // System.out.println(name.toLowerCase());

        String letter = "Dear <|name|>,thanks a lot";
        letter = letter.replace("<|name|>", "Siddhartha");
        System.out.println(letter);

    }
}
