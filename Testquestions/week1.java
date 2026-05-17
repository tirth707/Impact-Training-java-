package Testquestions;

public class week1 {
    public static void main(String[] args){
        // String s="HellO world";
        // vowel(s);
        factorial(0);
    }


    //vowel count in string with edge cases of empty string and null string

    public static void vowel(String s){
        if(s==null){
            System.out.println("Null string has no vowels");
            return;
        }
        int count =0;
        for(int i=0;i<s.length();i++){

            s=s.toLowerCase();
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }


    //factorial of given umbers with edge cases of 0 and negative numbers


    public static void factorial(int n){
        if(n<=0){
            System.out.println("factorials are not possible for non-positive integers");
            return;
        }
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

    }


    
}
