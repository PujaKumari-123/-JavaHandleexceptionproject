package JavaAss;
import java.util.Scanner;

// Custom exception for negative numbers
class NegativeNumberException extends Exception {
  public NegativeNumberException(String message) {
    super(message);
  }
}

public class HandleMultipleException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter an integer: ");
      String userInput = scanner.nextLine();
      int inputNumber = Integer.parseInt(userInput);

      if (inputNumber < 0) {
        throw new NegativeNumberException("Negative numbers are not allowed.");
      }

      int result = 100 / inputNumber;
      System.out.println("Result: " + result);

    } catch (NumberFormatException e) {
      System.out.println("Error: Please enter a valid integer.");
    } catch (ArithmeticException e) {
      System.out.println("Error: Division by zero is not allowed.");
    } catch (NegativeNumberException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
