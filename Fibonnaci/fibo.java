package Fibonnaci;
class fibo{

    public static void main(String[] args) {
        /*int n = 10;
        int first = 0;
        int second = 1;
// using iteration
       for(int i = 0; i >= 0 ; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }*/
        for(int i = 0; i < 10; i++){
            System.out.print(recursive(i) + " ");
        }
    }
    public static int recursive(int fibo){
        if(fibo == 0)
            return 0;
        if (fibo == 1)
            return 1;
        
        return recursive(fibo - 1) + recursive(fibo - 2);   
        
    }
}