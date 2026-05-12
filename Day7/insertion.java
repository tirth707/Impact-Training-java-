package Day7;
import java.util.*;

public class insertion {
    public static void main(String[] args){

        // insert();
        // q5();
        // q6();
        // q7();
        // q2();
        // q8();
        q9();

        

    }

    //insert at specific position
    public static void insert(){
        int[] arr=new int[20];
        arr[0]=40;
        arr[1]=70;
        arr[2]=90;
        arr[3]=60;


        int pos=2;

        int newval=100;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int n=arr.length-1;
        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];

        }
        arr[pos]=newval;
        System.out.println("\nafter insertion");


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void q5(){

        //create  an array of size 15

        int arr[] =new int[15];

        //assign 5 valuues
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int v=sc.nextInt();
            arr[i]=v;
            
        }
        //dispaly
        System.out.println("before insertion");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //insertt 85 at index 4
        int pos=4;
        int newval=85;
        int n=arr.length-1;
        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];    
        }
        arr[pos]=newval;
        System.out.println("\nafter insertion");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void q6(){
        //create array of size 10
        int[] arr=new int[10];

        //assign 8 elements in it 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }

        //dispaly
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //delelte the element firn in dex 5 

        int ind=5;
        for(int i=ind;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("\nafter deletion");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //second largest element in array 
    public static void q7(){

        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();

        }
       int l1=0;
       int l2=0;
         for(int i:arr){
              if(i>l1){
                l2=l1;
                l1=i;
              }else if(i>l2 && i!=l1){
                l2=i;
              }
         }
         System.out.println("second largest element is "+l2);
        


    }

    public static void q2(){
        int max=0;
        int min=Integer.MAX_VALUE;
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();    
        }
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);

    }

    //find avg of array
    public static void q8(){

         
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();



        }

        int sum=0;
        int size=arr.length;
        for(int i:arr){
            sum+=i;
        }
        float avg=sum/size;
        System.out.println("average is "+avg);
    }

    //max in array
    public static void q9(){
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("max is "+max);
    }
    
}
