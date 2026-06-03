package recursion;

public class myclass {
    public static void main(String[] args){
        int n=2;
        int a=1;

        // int arr[]={1,2};
        // System.out.println(arr.length);
        // f3(10);
        // f1(n);
        // f2(n);
        // f4(3);
        // System.out.println(f4(10));
        //  f5(10);
        // System.out.println(f5(1110));
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


static void f3(int n){
    if(n==0){
        return;
    }
    f3(n-1);
    int total=0;
    total+=n;
    System.out.println(total);
}

//factorial of a  number 

static int f4(int n){
    if(n==1) return 1;
    return n*f4(n-1);

}

//sum of digits of a number
static int f5(int n){
    if(n==1) return 1;
    return n%10+f5(n/10);
}



}
