import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Age:"+ age);
        int ageDividedByTwo = age/2;
        int ageFinal = ageDividedByTwo +7;
        System.out.println(age + "-year olds should date somebody who is at least " + ageFinal + "-years old.");
    }
}

