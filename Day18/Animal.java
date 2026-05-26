package Day18;

public class Animal {
    String name;
    String type;
    int age;


    //contructor overloading because it have Animal function same name but fdifeerrnt parameters
    //defual contructor
    Animal(){
        this.name="Unknown";
        this.type="Unknown";
        this.age=0;
    }

    //parameterieized cotructor 
    Animal(String n,String t,int a){
        this.name=n;
        this.type=t;
        this.age=a;
    }

    void Display(){
        System.out.println("name: "+name+" type: "+type+" age: "+age);
    }
    public static void main(String[] args){
        Animal a=new Animal("dog","mammal",5);
        a.Display();
         Animal a2=new Animal("cat","mammal",3);
        a2.Display();
    }
    
}
