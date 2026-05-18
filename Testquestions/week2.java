package Testquestions;

public class week2 {
    public static void main(String[] args) {
        // hollowsquare(5);
        int[] arr={10,20,30,40,50};

        // insert(arr.length, 99, 3, arr);
        
    }

    // insert elemet at specifc index (1-based indexing) in an array and print the new array

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

    

    //hollow sqare pattern printing 

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


    
}
