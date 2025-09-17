import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Remove spaces and convert to lowercase
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();

        // 2. Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // 3. Check if original cleaned string equals reversed
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome right");
        } else {
            System.out.println("The string is not a palindrome wrong");
        }
    }
}
