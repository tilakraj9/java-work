
public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Access elements by index
        System.out.println("Element at index 2: " + numbers.get(2));

        // Remove an element
        numbers.remove(1); // Removes the element at index 1 (20)
        System.out.println("After removing element at index 1: " + numbers);

        // Iterate through the ArrayList
        System.out.print("Elements in the ArrayList: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    

}
