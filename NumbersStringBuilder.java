public class NumbersStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 50; i++) {
            sb.append(i); // Add the number
            if (i != 50) {
                sb.append(","); // Add comma after each number except the last
            }
        }

        // Convert StringBuilder to String and print
        String result = sb.toString();
        System.out.println(result);
    }
}
