import java.util.Scanner;

public class CountToEleven {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a number less than 11");
      int number = Integer.parseInt(scanner.nextLine());
      
      for (; number <= 11; number++) {
        System.out.println(number);
      }
    }
  }
}
