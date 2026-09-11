package Stacks;

public class App {

    public static void main(String[] args) {

        // Create a stack with unsorted values
        stack theStack = new stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(10);
        theStack.push(30);
        theStack.push(50);
        theStack.push(5);
        theStack.push(45);
        theStack.push(15);
        theStack.push(25);
        theStack.push(35);
        theStack.push(95);

        System.out.println("=== Stack Before Sorting ===");
        printStack(theStack);

        // Sort the stack using recursion
        sortStack(theStack);

        System.out.println("\n=== Stack After Sorting (Ascending) ===");
        printStack(theStack);
    }

    // Recursively sort the stack in ascending order (smallest on top)
    public static void sortStack(stack s) {
        // Base case: if stack is empty, we're done
        if (s.isEmpty()) {
            return;
        }

        // Remove the top element
        long temp = s.pop();

        // Recursively sort the remaining stack
        sortStack(s);

        // Insert the removed element back in sorted order
        sortedInsert(s, temp);
    }

    // Recursively insert a value into a sorted stack
    // The stack is sorted in ascending order (smallest on top)
    public static void sortedInsert(stack s, long x) {
        // Base case: if stack is empty OR x is smaller than top, push x
        // (x belongs on top to maintain ascending order - smallest on top)
        if (s.isEmpty() || x < s.peek()) {
            s.push(x);
            return;
        }

        // Remove the top element
        long temp = s.pop();

        // Recursively insert x into the remaining stack
        sortedInsert(s, x);

        // Put the removed element back on top
        s.push(temp);
    }

    // Helper method to print the stack without destroying it
    public static void printStack(stack s) {
        // We need to pop everything to print, then rebuild
        if (s.isEmpty()) {
            System.out.println("(empty)");
            return;
        }

        long temp = s.pop();
        System.out.print(temp + " ");
        printStack(s);
        s.push(temp); // restore
    }
}