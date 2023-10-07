import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;


/**
 * This class uses Java's LinkedList and Collections to input a list of integers, sort them, and then 
 * displays the sorted list.
 * <p> 
 * The main method prompts the user to input integers that are separated by spaces. Invalid inputs are skipped and valid
 * numbers are added to the Linked List. The list is then sorted and displayed.
 * <p>
 * 
 * @param args command line arguments
 */
public class LinkedListCollections {
    public static void main(String[] args) {
        // Initializes an empty LinkedList
        LinkedList<Integer> sortedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter integers
        System.out.println("Enter a list of integers, seperated by spaces: ");

        String[] numbers = scanner.nextLine().split(" ");

        for (String num : numbers) {
            try {
                sortedList.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                // Handles invalid inputs
                System.out.println("Skipping invalid input: " + num);
            }
        }
        scanner.close();

        // Sort the LinkedList
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}

// Command line prompts: javac LinkedListCollections.java