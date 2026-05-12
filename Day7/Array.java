package Day7;
import java.util.*;

public class Array {
    public static void main(String[] args){
        // int marks1=80;
        // int marks2=90;
        // int marks3=70;  
        //if we have to store more than 3 marks then we have to create more variables like this and it is not a good practice
        //so we can use arrays to store multiple values in a single variable
        //array is a collection of similar data types
        //array is a data structure that can store a fixed number of values of the same data type
        //array is a collection of similar data types
        


        
        // marks[0]=80;
        // marks[1]=90;
        // marks[2]=70;
        // int marks[]={10,20,30,40,50};

        // System.out.println(marks[0]);

        //q1()
//q2();

//q3();
// q4();
// q5();


        



    }



    //print n number of element in array
    public static void q1(){
        int[] marks=new int[5];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.println("enter marks of student " + (i + 1));
            marks[i]=sc.nextInt();
        

            

        }
        System.out.println("marks of students are:");
        for(int i=0;i<marks.length;i++){
            System.out.println("marks of student " + (i + 1) + " is " + marks[i]);
        }




    }


    //print all elements of array in. reverse order

    public static void q2(){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
       
        
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements  " + (i + 1));
            arr[i]=sc.nextInt();
        

            

        }
        System.out.println("elements of array are :");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("" + (i + 1) + " is " + arr[i]);
        }



    }


    //input 10 numbers in. the array and print the even numbers 
    public static void q3(){

         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
       
        
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements  " + (i + 1));
            arr[i]=sc.nextInt();
        

            

        }
        System.out.println("elements of array are :");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("the even number in array are   is " + arr[i]);

            }
            
        }

        
    }


    //print odd numbers in array
    public static void q4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
       
        
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements  " + (i + 1));
            arr[i]=sc.nextInt();
        

            

        }
        System.out.println("elements of array are :");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println("the odd number in array are   is " + arr[i]);

            }
            
        }
    }


    //find. the sum of all elements in array 

    public static void q5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements  " + (i + 1));
            arr[i]=sc.nextInt();
        

            

        }
        System.out.println("elements of array are :");
        for(int i=0;i<arr.length;i++){
            
                System.out.println("the even number in array are   is " + arr[i]);
                sum+=arr[i];

            
            
        }

    System.out.println("thr sum of all number sof array is " + sum);
    }
    
}
