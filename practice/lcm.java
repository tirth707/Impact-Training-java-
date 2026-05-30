package practice;

public class lcm {
    public static void main(String[] args){
        int a=10;
        int b=20;

        int lcm =(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("lcm of "+a+" and "+b+" is: "+lcm);
                break;
            }
            lcm++;
        }
    }
    
}
