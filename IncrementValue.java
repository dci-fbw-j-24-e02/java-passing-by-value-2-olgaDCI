import java.util.Scanner;

public class IncrementValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int number = scanner.nextInt();

        System.out.println("Original value: " + number);

        increment(number);

        System.out.println("Original value: " + number);

        scanner.close();
    }

    public static void increment(int value) {

        value = value + 1;

        System.out.println("Incremented value: " + value);
    }
}
