package Arrays;

public class Week4ActP2 {

    public static void main(String[] args) {
        int executed = 0;
        int n = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    executed++;
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }

        System.out.println(executed);
    }
}
