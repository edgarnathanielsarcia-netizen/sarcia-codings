package Fibonnaci;
public class fibo_iteration {

    public static void main(String[] args) {  
        int a = 0; // 0, 1, 1,
        int b = 1;

        for(int i = 0; i <= 10; i++){
            System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;    
        }
    }
}