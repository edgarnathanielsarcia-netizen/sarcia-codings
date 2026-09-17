package Arrays;

public class Week4ActP1 {

    public static void main(String[] args) {
        int[] numbers = {12, 25, 7, 18, 30, 42, 9, 15};
        int target = 100; // tried checking if 100 works
        boolean found = false;
        int comparison = 0;

        for (int i = 0; i < numbers.length; i++) {
            comparison++;
            System.out.println("Comparing " + target + " with " + numbers[i]);

            if (numbers[i] == target) {
                found = true;
                System.out.println("Target has been found!");
                break;
            }
        }

        if (!found) {
            System.out.println("Target not found.");
        }

        System.out.println("Total Comparisons: " + comparison);
    }
}
