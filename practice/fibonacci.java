package practice;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0, b = 1;
        System.out.print("fibonacci series  of " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
}
