import java.util.Scanner;

public class Day10 {

    public static void main(String[] args){
        //2D arrays
//         int[][] arr=new int[3][3];
//         arr[0][0]=1;
//         arr[0][1]=222;
//         arr[0][2]=3;
// System.out.println(""+arr[0][1]);
// mat();
// matsum();
maxmin();





    }


    //take input from user in 2D matrix
    public static void mat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int row=sc.nextInt();
       
int col=sc.nextInt();

        int[][] arr=new int[row][col];
        
        

        for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){

        arr[i][j]=sc.nextInt();

        
    }
}
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){

        System.out.print(arr[i][j]+" ");

        
    }
    System.out.println();
}


    }




    //find sum of all elements in 2D matrix

    public static void matsum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int row=sc.nextInt();
       
int col=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.println("enter elements of the matrix");
        
        

        for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){

        arr[i][j]=sc.nextInt();

        
    }
}
int sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){

        sum+=arr[i][j];
        System.out.print(arr[i][j]+" ");

        
    }
    System.out.println();
}
System.out.println("Sum of all elements: " + sum);

    }






    //find min max in 2D matrix

    public static void maxmin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int row=sc.nextInt();
       
int col=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.println("enter elements of the matrix");
        
        

        for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){

        arr[i][j]=sc.nextInt();

        
    }
}
int max=0;
int min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]>max){
            max=arr[i][j];
        }
        if(min>arr[i][j]){
            min=arr[i][j];
        }

        System.out.print(arr[i][j]+" ");

        
    }
    System.out.println();
}
System.out.println("max of all elements: " + max);
System.out.println("min of all elements: " + min);
    }







    
}
