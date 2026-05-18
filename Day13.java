public class Day13 {
    public static void main(String[] args) {
    //    bubble1();
    // selection();
    insertion();
       
    }

    //bubble sort - compare each element with the next element and swap them if they are in the wrong order and repeat this process for n-1 times where n is the number of elements in the array
    //time. complexuty O(N^2) 
    public static void bubble(){
         int arr[]={8,5,9,6,2,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(!issorted(arr)){
                for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            }
            
        }
        for(int i:arr){
             System.out.print(i+" ");
        }
    }


    //bubble sort on sorted array 
//time complexity O(N) 
    public static boolean issorted(int[] arr){
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;


            }
        }
       return true;
    }


    //bubble sort more efficiemnt and checking if the array is already sorted or not after first loop and if it is sorted then we will break the loop and if it is not sorted then we will continue with the next loop
    //time complexity O(N) for sorted array and O(N^2) for unsorted array

    public static void bubble1(){
            int arr[]={8,5,9,6,2,8};
            int n=arr.length;
            for(int i=0;i<n-1;i++){

                boolean issorted=false;
                for(int j=0;j<n-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;

                        issorted=true;
                    }
                }
                if(!issorted){
                    break;
                }
            }
            for(int i:arr){
                System.out.print(i+" ");
            }
    }


    //selectiion sort -find the minimum element in the unsorted array and swap it with the first element of the unsorted array and repeat this process for the rest of the array
    //time complexity O(N^2) for all cases
    // average case O(N^2) and best case O(N^2) and worst case O(N^2)
    //space complexity O(1) because we are not using any extra space for sorting the array

    public static void selection(){
        int arr[]={8,5,9,6,2,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minind]){
                    minind=j;
                }
            }
            if(i!=minind){
            int temp=arr[minind];
            arr[minind]=arr[i];
            arr[i]=temp;
            }
            
        }

        for(int i:arr){
             System.out.print(i+" ");
        }


       
       

    }
     //insertion sort 

     public static void insertion(){
            int arr[]={8,5,9,6,2,8};
            int n=arr.length;
            for(int i=1;i<=n-1;i++){
                int key=arr[i];
                int j=i-1;
                if(j>=0 && arr[j]>arr[j+1]){
                    arr[j+1]=arr[j];
                    j--;
                   
                }
                arr[j+1]=key;
            }
            for(int i:arr){
                System.out.print(i+" ");

            }
        }
}
