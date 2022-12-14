import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Calculation calc = new Calculation();
    boolean repeat = true;
    do {
      try {
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        int option = input.nextInt();
        input.nextLine();

        switch (option) {
          case 1:
            // input luas square
            System.out.println("");
            System.out.print("Enter side of square: ");
            double side = input.nextDouble();
            calc.setSquare(side);
            double squareArea = calc.getSquare();
            System.out.println("Square area: " + squareArea);
            System.out.println("");
            break;
          case 2:
            // input luas circle
            System.out.println("");
            System.out.print("Enter radius of circle: ");
            double radius = input.nextDouble();
            calc.setCircle(radius);
            double circleArea = calc.getCircle();
            System.out.println("The calculation result: " + circleArea);
            System.out.println("");
            break;
          case 3:
            // input luas trapezoid
            System.out.println("");
            System.out.print("Enter upper side of trapezoid: ");
            double a = input.nextDouble();
            System.out.print("Enter lower side of trapezoid: ");
            double b = input.nextDouble();
            System.out.print("Enter height of trapezoid: ");
            double t = input.nextDouble();
            calc.setTrapezoid(a, b, t);
            double trapezoidArea = calc.getTrapezoid();
            System.out.println("The calculation result:" + trapezoidArea);
            System.out.println("");
            break;
          case 0:
            System.out.println("Program finished");
            repeat = false;
            break;
          default:
            System.out.println("Option not available");
            continue;
        }
      } catch (InputMismatchException e) {
        System.out.println("Error: Input must be a number");
      } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
      }
    } while (repeat);

    boolean report = false;
    while (!report) {
      // do something
    }

    input.close();
  }
}
