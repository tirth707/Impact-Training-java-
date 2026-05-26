package Day18;

public class Employee {
    String name;
    int id;

    Employee(String name ,int id){
        this.name=name;
        this.id=id;


    }

    public void setname(String name){
        this.name =name;


    }
    public void setid(int id){
        this.id=id;
    }
    void Display(){
        System.out.println("id: "+id+" name "+name );
    }

    
    public static void main(String[] args){
        Employee e=new Employee("tirth", 7);
        e.Display();
        e.setname("gill");
        e.Display();
        e.setid(77);

        
        e.Display();
        


    }
}
