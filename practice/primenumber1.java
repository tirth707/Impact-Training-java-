package practice;

public class primenumber1 {
    public static void main(String[] args){
        int n=10;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    if(i==j){
                        System.out.print(i+" ");
                    }
                    break;
                }
            }
        }
    }
    
}
 