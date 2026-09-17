package Arrays;

public class Week4ActP3 {

    public static void main(String[] args) {
        int[] values = {45, 12, 89, 34, 67, 23, 91, 8, 56, 73};
        int largest = values[0];
        int comparisons = 0;

        for (int i = 1; i < values.length; i++) {
            comparisons++;
            System.out.println("Comparing " + values[i] + " with " + largest);

            if (values[i] > largest) {
                largest = values[i];
            }
        }

        System.out.println(comparisons);
        System.out.println("Largest Value: " + largest);
    }
}
