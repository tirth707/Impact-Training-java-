package Day18;

public class BankAccount {
    int ac_no;
    int bal;

    BankAccount(int a,int b){
        this.ac_no=a;
        this.bal=b;

    }
    void Display(){
        System.out.println("account number ="+ac_no+" balance"+bal);
    }

    public static void main(String[] args){
        BankAccount ac=new BankAccount(1, 777);
        ac.Display();

        
        //calling from othert class to differnt class through package 
        // Stud s=new Stud(7,"tirth",8);
        // s.Display();

    }

    
}
