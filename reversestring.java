import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Use StringBuilder to reverse
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed string (StringBuilder): " + reversed);
    }
}
