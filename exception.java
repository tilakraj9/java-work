public class exception {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int a = 10;
            int b = 0;  // risky value (division by zero)
            int result = a / b;  // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // This block runs if an ArithmeticException occurs
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            // This block always runs, no matter what
            System.out.println("Execution finished.");
        }
    }
}

