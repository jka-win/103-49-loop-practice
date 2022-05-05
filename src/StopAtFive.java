import java.util.Scanner;

public class StopAtFive {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      double number;
      do {
        System.out.println("Give a number:");
        number = Double.parseDouble(scanner.nextLine());
      } while (number != 5);
    }
  }
}
