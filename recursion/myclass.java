package recursion;

public class myclass {
    public static void main(String[] args){
        int n=2;
        int a=1;

        f1(n);
        // f2(n);
    }

    static void f1(int n){
         if(n==0){
            return;
        }
         

        System.out.println(n);
        f1(n-1);
       
    }

   
    static void f2(int n) {
    if(n==0){
        return;
    }
    f2(n-1);
    System.out.println(n);
}

}
