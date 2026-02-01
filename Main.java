import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator(); // Object creation

    int choice;
    double num1, num2;

    do {
      System.out.println("\n===== OOP JAVA CALCULATOR =====");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      if (choice >= 1 && choice <= 4) {
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
      } else {
        num1 = num2 = 0;
      }

      switch (choice) {
        case 1:
          System.out.println("Result = " + calc.add(num1, num2));
          break;

        case 2:
          System.out.println("Result = " + calc.subtract(num1, num2));
          break;

        case 3:
          System.out.println("Result = " + calc.multiply(num1, num2));
          break;

        case 4:
          System.out.println("Result = " + calc.divide(num1, num2));
          break;

        case 0:
          System.out.println("👋 Exiting Calculator. Thank you!");
          break;

        default:
          System.out.println("❌ Invalid choice. Try again.");
      }

    } while (choice != 0);

    sc.close();
  }
}
