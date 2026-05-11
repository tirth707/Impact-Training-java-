import java.util.Scanner;

public class Day5 {

    //FUNCTIONS

    //1. without return type and without parameters
    //it will not take any input data and it will just print the meesage or run that specific functioin and nit return anythig to main 


    public static void printhello(){
        System.out.println("hello world");
    }


    //2. with parameters and without return type
    //it will take some input data and not return any thing to main 

    public static void sum(int a , int b){
        int c =a+b;
        System.out.println(c);
    }

    public static void Pname(String name ){
        System.out.println("Hello my name is "+name );
    }

    //3. with return type and with parameters
    //it will take some input data and return some data to main

    public static int sum(int a ,int b,int c){
        int d=a+b+c;
        System.out.println("in the function "+d);
        return d;
    }

    //4. without parameters and with return type
    //it will not take any input data and return some data to main 

    public static int lucky(){
        return 7;
    }

    public static void add(){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=a+b+c;
        System.out.println("sum is "+d);

    }


    //function for adding two numbers and returning their sum

    public static int addition(int a,int b){
        return a+b;

    }

    //function for returning even or odd

    public static boolean eo(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    //table

    public static int table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
        return 0;
    }

    //reverse a number

    public static int Reverse(int n){
        int rev=0;
        while(n>0){
            rev=n%10;
            n/=10;
            System.out.print(rev);
        }
        return rev;
    }

    //Factorial of a number 

    public static void Fact(int n){
        int total=1;
        for(int i=1;i<=n;i++){
            total*=i;
            

        }
        System.out.println( "Factorial of "+n+" is " +total);
    }

    //find max opf three numbers 
    public static void max(int a,int b ,int c){
        if(a>b & a>c){
            System.out.println(a+" is greatest number");
        }else if(b>a && b>c){
            System.out.println(b+" is greatest number");
        }else if(c>a && c>b){
            System.out.println(c+" is greatest number");
        
        }else{
            System.out.println("all numbers are equal");
        }
    }

    public static void fib(int n){
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            System.out.println(" "+a);
            int temp=a+b;
            a=b;
            b=temp;
        }
    }

    public static void cal(){
        System.out.println("write 1 for aaddtion 2 for subtraction 3 for multiplication 4 for division 5 for modulus 6 for exit ");
        Scanner sc= new Scanner(System.in);

        int choice = sc.nextInt();
        int a,b;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    
        switch(choice){
            case 1:
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case 2:
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case 3:
                System.out.println(a+" * "+b+" = "+(a*b)); 
                break;
            case 4:
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case 5:
                System.out.println(a+" % "+b+" = "+(a%b));
                break;
            case 6:
                System.out.println("exiting the calculator");
                break;
            default:
                System.out.println("invalid choice");
        }
    }

    
    //MAIN FUNTION
    //code execution start from here 
    public static void main(String[] args){
        printhello();

        // sum(5, 10);
        Scanner sc =new Scanner(System.in);
        // String name =sc.nextLine();
        // Pname(name);
        // int s=sum(5, 10, 15);
        // int avg =s/3;
        // System.out.println("average is from main "+avg);
        // int l=lucky();
        // System.out.println("lucky numbers is "+l);
        // add();



        //question 1

        int a,b,n;
        // System.out.println("enter numbers");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // n=sc.nextInt();


        // int sum= addition(a,b);
        // System.out.println("sum is "+sum);

        // if(eo(n)){
        //     System.out.println("number is even");
        // }else{
        //     System.out.println("number is odd");
        // }


        //prime or not 

        // if(isPrime(n)){
        //     System.out.println("number is prime");
        // }else{
        //     System.out.println("number is not prime");
        // }

        //table 

        // table(n);



        //reverse

        // Reverse(n);



        //factorial of. a number 
        // Fact(n);


        //max of three numbers 
        // max(a,b,n);


        //fibonacci series of n terms 

        // fib(n);

         cal();























    }
}
