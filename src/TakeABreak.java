import java.util.Scanner;

public class TakeABreak {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      String answer;
      do {
        System.out.println("Do you want to take a break?");
        answer = scanner.nextLine();
      } while (!answer.equalsIgnoreCase("yes"));
    }
  }
}
