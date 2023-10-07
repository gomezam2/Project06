import java.util.*;

/** 
 * A utility class that sorts numbers using a combination of PriorityQueue and Stack collections.
 * The sorting process uses a {@link PriorityQueue} to sort the integers
 * The integers are then pushed into a {@link Stack} in ascending order so that they are popped in descending order. 
 * <p>
 * Program example:
 * <pre>
 *  Enter a list of integers, seperated by spaces:
 *  3 2 1 4 1 5 6 5
 *  Sorted Stack : [1 1 2 3 4 5 5 8]
 * </pre>
*/
public class StackCollections {
    /**
     * Main method that prompts the user for a list of integers, sorts them using a PriorityQueue, the is pushed into a stack. 
     * The Stack is then printed
     * @param args Not used in this implementation
    */
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        // Stack that holds the sorted Integers
        Stack<Integer> sortedStack = new Stack<>();

        //PriorityQueue that is used for sorting integers
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        // Prompts user for integers
        System.out.println("Enter a list of integers, separated by spaces (Type any non-integer to finish): ");


        // Iterates through user inputs and adds valid integers to the sorter
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Add integers into min heap for sorting
                minHeap.add(scanner.nextInt());
            } else {
                break;
            }
        }

        scanner.close();

        // Pops elements from the min heap and pushes them into the stack
        while(!minHeap.isEmpty()) {
            sortedStack.push(minHeap.poll());
        }                                                                                                                                                                           


        System.out.println("Sorted Stack: " + sortedStack);

    }
}    

// Command Prompts used: javac StackCollections.java
// javadoc StackCollections.java