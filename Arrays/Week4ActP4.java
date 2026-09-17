package Arrays;

public class Week4ActP4 {

    public static void main(String[] args) {
        int[] values = {5, 3, 8, 2, 5, 9, 3, 7};
        int comparisons = 0;

        System.out.print("Duplicate value/s: ");

    
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                comparisons++;
                if (values[i] == values[j]) {
                    System.out.print(values[i] + " ");
                }
            }
        }

        System.out.println("\nComparisons: " + comparisons);
    }
}
