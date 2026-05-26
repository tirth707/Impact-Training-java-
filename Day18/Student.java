package Day18;

public class Student {
    private String name;
    private int roll;


    //defualt contriuctor 
    Student(){

    
    System.out.println("default contructor ");
    }
    
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;

    }

    public void setName(String name ){
this.name=name;
    }

    public void setRoll(int r){
        roll=r;
    }

    void setname(String n){
        name =n;

    }
    void setroll(int r){
        roll=r;
    }

    String getName(){
        return name;
    }
    int getRoll(){
        return roll;
    }

    //parameterized contructor 
    // Student(String n,int r){
    //     name=n;
    //     roll=r;
    //      System.out.println("Parameterized  contructor ");

    // }
    void Display(){
        System.out.println(name);
        System.out.println(roll);

    }


    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("tirth", 7);
        s1.Display();

        s2.Display();
        // s1.roll=77;
        // s1.name="gill";

        //calling thre setname. ansd set roll 

        s1.setname("gill");
        s1.setroll(77);

        // s1.setroll(99);
         s1.Display();

         System.out.println(s1.getName());
         System.out.println(s1.getRoll());



    }





    
}
