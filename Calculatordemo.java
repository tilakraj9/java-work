import java.util.Scanner;
// Main class
public class Calculatordemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + calc.subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + calc.multiply(num1, num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        System.out.println("Result: " + calc.divide(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
