import java.util.ArrayList;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //ArrayList
        //it is dynamic array
        //it can grow and shrink in size
        //it is a part of java.util package
        //it is a class
        //it is a generic class
        //it is a collection class
        //it is a resizable array
        //it is not synchronized
        //it is not thread safe


        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);

        //add 60 at index 1 

        // list.add(1,60);


        // System.out.println(list);

        //remove element at index 0
        // list.remove(0);

        // System.out.println(list);



        //remove element by value 
        // list.remove(Integer.valueOf(60));
        // System.out.println(list);


        //get element at index 1
        // System.out.println(list.get(1));


        // for(int i:list){
        //     System.out.print(i+" ");
        // }


        //set -- update the value of any index
        // System.out.println(list);
        // list.set(0,77);
        // System.out.println(list);

        // return size of Array 
        // System.out.println(list.size());


        //traversing arraylist 

        //for loop 

        // System.out.println("enter size of arraylist");
        // int n=sc.nextInt();
        // System.out.println("enter elements of arraylist");
        // for(int i=0;i<n;i++){
        //    list.add(i,sc.nextInt());
        // }

        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();


        // q1();
        // hollowsquare(5);
        int[] arr={10,20,30,40,50};

        // insert(arr.length, 99, 3, arr);
delete(arr.length, 3, arr);
         
    }
    

    public static void q1(){
    
        //creating a arraylist
        ArrayList<Integer> list=new ArrayList<>();


        Scanner sc=new Scanner(System.in);

        //add. 10 elements in arraylist

        System.out.println("enter size of arraylist");
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            System.out.println("enter element at index "+i);
            list.add(i,sc.nextInt());
        }

        //print all elemeents udinfg loop

        for(int i:list){
            System.out.print(i+" ");
            
        }

        //update 
        list.set(1,77);
        System.out.println(list);


        






        

    }

    public static void hollowsquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    public static void insert(int n, int x, int p, int[] arr ){
        int[] res=new int[n+1];
        for(int i=0;i<p-1;i++){
            res[i]=arr[i];
        }
        res[p-1]=x;
        for(int i=p;i<=n;i++){
            res[i]=arr[i-1];
        }
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();

        //  int[] arr={10,20,30,40,50};
        // insert(arr.length, 99, 3, arr);

        // 0=10,1=20,2=99,3=30,4=40,5=50

        // so for(int i=0;i<p;i++). this will run for 0,1,2 so we want our elements befiore the p so we woill run it till p-1 so that we can get the elements before p and then we will insert x at p-1 and then we will run another loop from p to n so that we can get the elements after p and then we will print the res array
//res[p]=x; inserted elemt at position p
// then again we wioll run loop from the element after p to n and we will insert the elements from the original array to the res array and then we will print the res array
//for(int i=p;i<=n;i++).  so from index 3 to n+1 we will get the elements of that 
        
       

    }

    public static void delete(int n,int p,int[] arr){
        int[] res=new int[n];
        for(int i=0;i<p-1;i++){
            res[i]=arr[i];
        }
        for(int i=p;i<n;i++){
            res[i-1]=arr[i];
        }
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
