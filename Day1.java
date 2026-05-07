import java.util.Scanner;
public class Day1 {
    public static void main(String[] args){

        //print name and age 

        Scanner sc=new Scanner(System.in);

        // System.out.println("ENter a name ");
        // String name =sc.nextLine();

        // System.out.println("ENter your age ");
        // int age =sc.nextInt();

        // System.out.println("your name is "+name +" and your age is "+age);


        //add two number and print sum

        // int a,b;
        // System.out.println("enter two numbers ");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // int r=sum(a,b);
        // System.out.println("the sunm of two numbers is "+r);



        //take name and marks and tell student that he is [pass or fail]

        // int marks;
        // String name;

        // System.out.println("enter your name ");
        // name=sc.nextLine();
        // System.out.println("enter your marks ");
        // marks=sc.nextInt();
        // if(marks>=33){
        //     System.out.println("congratulations "+name +" you have passed exam with "+marks+" marks");
        // }else{
        //     System.out.println("sorry " +name +" you have failed exam with "+marks+" marks better luck next time");
        // }


        //take 5 subjects makers and give total marks and percentages 
        // int a,b,c,d,e;
        // System.out.println("enter your 5 subjects marks after space" );
        // a=sc.nextInt();
        // b=sc.nextInt();
        // c=sc.nextInt();
        // d=sc.nextInt();
        // e=sc.nextInt();
        // int total=a+b+c+d+e;
        // double percentage=(total/500.0)*100;
        // System.out.println("total marks are "+total+" percentage is "+percentage+"%");



        //simple intrest calculator 
        // int p,t,r;
        // System.out.println("enter principal amount , time and rate of intrest after space");
        // p=sc.nextInt();
        // t=sc.nextInt();
        // r=sc.nextInt();
        // double si=(p*t*r)/100.0;
        // System.out.println("simple intrest is "+si);

        //celcius to fahrenheit
        // double c,f;
        // System.out.println("enter temperature in celcius ");
        // c=sc.nextDouble();
        // f=(c*1.8)+32;
        // System.out.println("temperature in fahrenheit is "+f);


        //bmi calculator and tell them theuy are underweight , normal weight , overweight or obese

        // double w,h,bmi;
        // System.out.println("enter your weight in kg and height in meter after space");
        // w=sc.nextDouble();
        // h=sc.nextDouble();
        // bmi=w/(h*h);
        // System.out.println("your bmi is "+bmi);
        // if(bmi<18.5){
        //     System.out.println("you are underweight");
        // }else if(bmi>=18.5 && bmi<25){
        //     System.out.println("you are normal weight");
        // }else if(bmi>=25 && bmi<30){
        //     System.out.println("you are overweight");
        // }else{
        //     System.out.println("you are obese");
        // }


        //


    }
    public static int sum(int a ,int b){
        int res=a+b;
        return res;
    }

    
}
