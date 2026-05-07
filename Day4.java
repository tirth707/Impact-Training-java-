public class Day4 {
    public static void main(String[] args){
        //loops
        //nested looops


        //stars patterns 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("* ");

        //     }
        //     System.out.println();
        // }


        //pattern 1

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //pattern 2

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

        // for(int i=1;i<=5;i++){
        //     for(int j=5;j>=i;j--){
        //         System.out.print("* ");

        //     }
        //     System.out.println();
        // }

        //pattern 3

//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" "+j);
        //     }
        //     System.out.println();

        // }


        //pattern 4 

//  1
//  2 2
//  3 3 3
//  4 4 4 4
//  5 5 5 5 5

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" "+i);
        //     }
        //     System.out.println();
        // }


        //pattern 5

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(j>=6-i){
        //             System.out.print("* ");    

        //         }else{
        //             System.out.print("  ");
                
        //         }
                
        //     }
        //     System.out.println();
        // }


        //pattern 6

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        //pattern 7

        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=5;j++){
        //         if(i>=j){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
                
        //         }
        //     }
        //     System.out.println();
        // }



        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }



    }
    
}
