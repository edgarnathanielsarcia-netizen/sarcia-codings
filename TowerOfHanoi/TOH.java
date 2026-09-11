import java.util.Scanner;

public class TOH {
    private static int moveCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numberOfDisks = input.nextInt();

        if (numberOfDisks <= 0) {
            System.out.println("The number of disks must be positive.");
        } else {
            System.out.println("Moves required:");
            solveHanoi(numberOfDisks, 'A', 'B', 'C');
            System.out.println("Total moves: " + moveCount);
        }
        input.close();
    }

    public static void solveHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            moveCount++;
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveHanoi(n - 1, source, destination, helper); // solveHanoi(2)
        moveCount++;
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        solveHanoi(n - 1, helper, source, destination); // solveHanoi(1)
    }
}