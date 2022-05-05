import java.util.Scanner;

public class MultiplicationTables {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Input a number: ");
      int number = Integer.parseInt(scanner.nextLine());

      for (int i = 1; i <= 10; i++) {
        System.out.println("%d x %d = %d"
          .formatted(number, i, number * i));
      }
    }
  }
}
