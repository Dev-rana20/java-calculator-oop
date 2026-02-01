import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    CalculatorOperations calc = new Calculator();

    int choice = -1;

    do {
      System.out.println("\n===== OOP JAVA CALCULATOR =====");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");

      try {
        choice = sc.nextInt();

        if (choice >= 1 && choice <= 4) {
          System.out.print("Enter first number: ");
          double a = sc.nextDouble();

          System.out.print("Enter second number: ");
          double b = sc.nextDouble();

          switch (choice) {
            case 1:
              System.out.println("Result = " + calc.add(a, b));
              break;
            case 2:
              System.out.println("Result = " + calc.subtract(a, b));
              break;
            case 3:
              System.out.println("Result = " + calc.multiply(a, b));
              break;
            case 4:
              System.out.println("Result = " + calc.divide(a, b));
              break;
          }
        } else if (choice != 0) {
          System.out.println("❌ Invalid choice!");
        }

      } catch (ArithmeticException e) {
        System.out.println("❌ Error: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("❌ Invalid input! Please enter numbers only.");
        sc.nextLine(); // clear buffer
      }

    } while (choice != 0);

    System.out.println("👋 Calculator Closed");
    sc.close();
  }
}
