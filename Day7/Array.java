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
        


        int[] marks=new int[5];
        // marks[0]=80;
        // marks[1]=90;
        // marks[2]=70;
        // int marks[]={10,20,30,40,50};

        // System.out.println(marks[0]);



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
    
}
