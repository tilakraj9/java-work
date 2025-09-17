import java.util.Scanner;

public class Countword
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take input from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        // 2. Split the sentence into words by spaces
        String[] words = sentence.split("\\s+"); // \\s+ handles multiple spaces

        // 3. Count the words
        int wordCount = words.length;

        // 4. Print the result
        System.out.println("Number of words: " + wordCount);
    }
}
