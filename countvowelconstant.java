
import java.util.Scanner;

public class countvowelconstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {  // Check if it's a letter
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
