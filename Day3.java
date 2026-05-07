import java.util.*;
public class Day3 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        //loops 
        

        // int n=5;
        // int i=0;
        // while(i<n){
        //     System.out.println("parul");
        //     i++;
        // }

//print you name many times 
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter you name ");
        // String name =sc.nextLine();
        // System.out.println("enter number of times you want to print your name ");
        // int n =sc.nextInt();
        // int i=0;

        // while(i<n){
        //     System.out.println(name);
        //     i++;
        // }

//print 1 to 10 numbers 
// int i=1;
// while(i<=10){
//     System.out.println(i);
//     i++;
// }


//print first 10 even numbers 
// int i=1;
// System.out.println("even numbers are :");

// while(i<=10){
//     if(i%2==0){
//         System.out.println(i);
//     }
//     i++;
// }

//OR
// int i=2;
// while(i<=20){
//     System.out.println("even number :"+i);
//     i+=2;
// }

//print first 10 odd numbers 

// int i=0;
//     System.out.println("odd numbers are :");

// while(i<=10){
//     if(i%2!=0){
//         System.out.println(i);
//     }
//     i++;
// }

//OR
// int i=1;
// while(i<=20){
//     System.out.println("odd number :"+i);
//     i+=2;
// }


// reverse numbers 
// int i=10;
// System.out.println("reverse numbers are :");
// while(i>0){
//     System.out.println(i);
//     i--;
// }

//OR

// int i=1;
// while(i<=10){
//     System.out.println(11-i);
//     i++;
// }


//DO WHILE LOOP
// int i=1;
// do{
//     System.out.println(i);
//     i++;
// }while(i<=10);

//odd or even using differnt logics
//even 
// int i=0;
// while(i<=10){
// System.out.println(i*2);
// i++;
// }

//odd
// int i=0;
// while(i<10){
//     System.out.println(i*2+1);
//     i++;
// }

//reverse even numbers

// int n=10;
// for(int i=n;i>0;i--){
//     if(i%2==0){
//         System.out.println(i);
//     }
// }


//odd numbers in reverse
// int n=10;
// for(int i=n;i>=0;i--){
//     System.out.println(i*2+1);
// }

//square of n numbers 
// int n=10;
// for(int i=1;i<=n;i++){
//     System.out.println("square of "+i+" is "+(i*i));
// }


//cubes of numbers 
//  int n=10;
// for(int i=1;i<=n;i++){
//     System.out.println("cube of "+i+" is "+(i*i*i));
// }



//write program to print table of N

// int n=5;
// for(int i=1;i<=10;i++){
//     System.out.println(n+" X "+i+" = "+(n*i));
// }

//write program to get sum of N natural numbers 

// int sum=0;
// for(int i=1;i<=n;i++){
//     sum+=i;
// }
//         System.out.println("sum of first "+n+" natural numbers is "+sum);



//calculate sum of first N even natural numbers 

// int sum=0;
// for(int i=1;i<=n;i++){
//     sum+=i*2;
// }
// System.out.println("sum of first "+n+" even natural numbers is "+sum);



//calculate sum of first N odd natural numbers 
// int sum=0;
// for(int i=1;i<=n;i++){
//     if(i%2!=0){
//         sum+=i;
//     }
// }
// System.out.println("sum of first "+n+" odd natural numbers is "+sum);



  //calculate factorial of numbers 

  
  
// int fac=1;
// for(int i=1;i<=n;i++){
//     fac*=i;
// }
// System.out.println("factoriral of "+n+" is " +fac);


//count digits 
// int count =0;
// while(n>0){
//     n/=10;
//     count++;
// }
// System.out.println("number of digits of the number is "+count);



//prime or not
// boolean isPrime=true;
// if(n<=1){
//     isPrime=false;
    
// }else{
// for(int i=2;i<=Math.sqrt(n);i++){
//     if(n%i==0){
//         isPrime=false;
//     }
// }
// }

// if(isPrime){
//     System.out.println("prime number");
// }else{
//     System.out.println("not prime number");
// }


//find the lcm 

// int a =sc.nextInt();
// int b =sc.nextInt();
// int gcd=Gcd(a,b);
// int lcm=(a*b)/gcd;
// System.out.println("lcm of "+a+" and "+b+" is "+lcm);


//reverse a number 
// int rev=0;
// while(n>0){
//     rev=n%10;
//     n/=10;
//     System.out.print(rev);
// }





    }

    public static int Gcd(int a ,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
    
}
