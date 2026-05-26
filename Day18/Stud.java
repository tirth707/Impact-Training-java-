package Day18;

public class Stud {
    int id;
    String name;
    int cgpa;

    Stud(int id,String name,int cgpa){

        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    Stud(){

        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    void Display(){
        System.out.println("id:"+id+" name: "+name+" cgpa: "+cgpa);
    }
    

    

    public static void main(String[] args){
        Stud s=new Stud();
        s.id=7;
        s.name="tirth";
        s.cgpa=8;
        s.Display();
    }
}
