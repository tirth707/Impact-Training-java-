import java.util.Scanner;

public class Day16 {
    public static void main(String[] args){

        //wriute a program to take input fro suser as string and print the number of words in the string
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("length of string is "+s.length());

        //convert that string to upper and lower case 
        System.out.println("lower case "+s.toLowerCase());
        System.out.println("upper case "+s.toUpperCase());


        //reverse a string 
        String reverse ="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println("reverse of string is "+reverse);

        palindrome(s,reverse);


        //string builder 
        StringBuilder sb = new StringBuilder(s);
        System.out.println("string builder "+sb.reverse().toString());





    }

    public static void palindrome(String s,String r){
        if(s.equals(r)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
    
}
