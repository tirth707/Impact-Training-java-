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
        System.out.println("enter numbers");
        // a=sc.nextInt();
        // b=sc.nextInt();
        n=sc.nextInt();


        // int sum= addition(a,b);
        // System.out.println("sum is "+sum);

        // if(eo(n)){
        //     System.out.println("number is even");
        // }else{
        //     System.out.println("number is odd");
        // }

        










    }
}
