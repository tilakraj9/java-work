import java.util.Scanner;

public class removeduplicatefile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
       
        String str = sc.nextLine(); // we ask to user type a string

        String result = ""; // To store string without duplicates

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If result does not contain the character, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
