public class problem2 {
    public static void main(String[] args) {
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decryption of grade

        System.out.println("Grade in real");
        grade = (char) (grade - 8);
        System.out.println(grade);
    }

}
