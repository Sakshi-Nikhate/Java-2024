public class Car {
        String name;
        String color;
        String model;
        String brand;
        String type;
        int passCap;
        
        Engine engine;

        Car(String name,String color,String model,String brand,int passCap,String type){
       super();
       this.name= name;
       this.color= color;
       this.model=model;
       this.brand=brand;
       this.type = type;
       this.passCap = passCap;
}
public void displayCar(){
  System.out.println();
  System.out.println("CAR DETAIL");
  System.out.println("Name:"+this.name);
  System.out.println("Color:"+this.color);
  System.out.println("Model:"+this.model);
  System.out.println("brand:"+this.brand);
  System.out.println("type:"+this.type);
  System.out.println("passCap:"+this.passCap);
  }
}

class Engine{
    String typeEngine;
    double bhp;
    double cc;
    int noPiston;
    double milleage;

    Engine(String typeEngine,double bhp,double cc, int noPiston,double milleage)
    {
        super();
        this.typeEngine = typeEngine;
        this.bhp=bhp;
        this.cc=cc;
        this.noPiston= noPiston;
        this.milleage=milleage;
    }
    public void displayEngine(){
        System.out.println();
        System.out.println("Engine Detail");
        System.out.println("type :"+ this.typeEngine);
        System.out.println("Brake HoursePower : "+ this.bhp+ "bhp");
        System.out.println("Cubic centimeter :"+this.cc +"cc.");
        System.out.println("No of Piston :"+this.noPiston);
        System.out.println("Milleage :"+ this.milleage  +"km/l");
    }
}
class CompositionDriver
{
    public static void main(String[] args) {

        //3 Car car = new Car("TATA","HARRIER","SUV",5,"Black",2400000,(new))
        Car car = new Car("TATA","HARRIER","SUV",5,"Black",2400000);
        car.displayCar();
        car.engine.displayEngine();
    }
}

