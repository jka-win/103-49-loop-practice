import java.util.Scanner;

public class PositiveNumbers {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      int number;
      do {
        System.out.println("Enter a number:");
        number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
          System.out.println("Number is " + number);
        } else if (number < 0) {
          System.out.println("Number must be a positive number");
        }
      } while (number != 0);
    }
  }
}
