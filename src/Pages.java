import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int ageFinal = 100 - age;
        System.out.println(age + "-year olds should read at least " + ageFinal + " pages before giving up on a book.");
    }
}
