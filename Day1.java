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


        //generate bill

        // int n,i,q,p;
        // System.out.println("enter number of items , item id , quantity and price after space");
        // n=sc.nextInt();
        // i=sc.nextInt();
        // q=sc.nextInt(); 
        // p=sc.nextInt();
        // int total=bill(n,i,q,p);
        // System.out.println("total bill is "+total);


        //name and age inout an dtell then who is them 

        // int age ;
        // String name;
        // System.out.println("enter your name ");
        // name=sc.nextLine();
        // System.out.println("enter your age ");
        // age=sc.nextInt();
        // if(age<=12){
        //     System.out.println("hello"+name +" you are a child ");

        // }else if(age>12 && age<=19){
        //     System.out.println("hello"+name +" you are a teenager ");
        // }else if(age>19 && age<=35){
        //     System.out.println("hello"+name +"you are a young adult ");
        // }else{
        //     System.out.println("hello"+name +" you are an adult ");  
        // }



        //take name ,company and salary and wish them for their dream job
        
        String name ,company;
        int salary;
        System.out.println("enter your name , company and salary after space");
        name=sc.nextLine();
        company=sc.nextLine();
        salary=sc.nextInt();
        System.out.println("hello "+name+"i wish that may you are hard working and you will get your dream package of "+salary+" LPA in your dream company "+company);
        









    }
    public static int sum(int a ,int b){
        int res=a+b;
        return res;
    }

    public static int bill(int n,int i,int q,int p ){
        int total=0;
        while(n>=0){
            total=(q*p);
            n--;
        }
        return total;

    }

    
}
