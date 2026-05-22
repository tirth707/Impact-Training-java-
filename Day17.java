import java.util.Scanner;
public class Day17 {
    static int n;
    static String[] empdept;
    static String[] empid;
    static String[] empname;
    static String[] empcity;
    public static void main(String[] args){
    //     StringBuilder sb =new StringBuilder("hello world ");

    //     //append
    //     sb.append("java");
    //     System.out.println(sb);

    //     //delete
    //     sb.delete(0,5);
    //     System.out.println(sb);

    //     //insert
    //     sb.insert(0,"hi ");
    //     System.out.println(sb);

    // //reverse
        
    //     // System.out.println(sb.reverse());

    //     //replace
    //     // sb.replace(0,2,"he");
    //     // sb.replace(1,9,"ii");

    //     System.out.println(sb);

    //     //string builder legth
    //     System.out.println("length of string builder is "+sb.length());

    //     //string builder is faster than string because string builder is mutable and string is immutable


    //     //setcharacter at index
    //     sb.setCharAt(0,'H');
    //     System.out.println(sb);


    g();

        
        
    }


    public static void g(){
        Scanner sc=new Scanner(System.in);
         
       
        System.out.println("enter the number of employees");
        n=sc.nextInt();

        sc.nextLine();
        empdept=new String[n];
        empid=new String[n];
        empname=new String[n];
        empcity=new String[n];




        for(int i=0;i<n;i++){
            System.out.println("\nEnter details for employee " + (i + 1));
            
            System.out.println("Department: ");

            empdept[i] = sc.nextLine();
            
            
            System.out.println("Emp ID: ");
            empid[i] = sc.nextLine();
            System.out.println("Name: ");
            empname[i] = sc.nextLine();           
            System.out.println("City: ");
            empcity[i] = sc.nextLine();
        }
        display();

        

    }

    public static void display(){
        System.out.println("\nDEPT\tID\tNAME\tCITY");
        System.out.println("------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(empdept[i] + "\t" + empid[i] + "\t" + empname[i] + "\t" + empcity[i]);
        }
    }

    
}
