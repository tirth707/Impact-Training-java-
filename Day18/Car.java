package Day18;

public class Car {
    String brand;
    String color;
    int price;

    Car(String b,String c,int p){
        this.brand=b;
        this.color=c;

        this.price=p;
    }
    void Display(){
        System.out.println("brand: "+brand+" color: "+color+" price: "+price);
    }
    public static void main(String[] args){
        Car car=new Car("Audi","red",5000000 );
        car.Display();
         Car car2=new Car("BMW","Black",6000000 );
        car2.Display();
        
    }
    
}
