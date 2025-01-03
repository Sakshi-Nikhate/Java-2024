 public class Mobile {
        String Display;
        String color;
        String model;
        String OperatingSystem;
        int BatteryLife;
        double price;
        Battery battery;
    
       Mobile(String Display,String color,String model,String OperatingSystem,int BatteryLife,double price)
        {
            super();
            this.Display = Display;
            this.color = color;
            this.model = model;
            this.OperatingSystem= OperatingSystem;
            this.BatteryLife= BatteryLife;
            this.price = price;
            this.Battery = battery;
            this.battery = new Battery(7,"black","RMX2151","Android",6,15000);
        }
        public void displayMobile() {
            System.out.println("Mobile Details : ");
            System.out.println("Display : " + this.display);
            System.out.println("Color : " + this.color);
            System.out.println("Model : " + this.model);
            System.out.println("Type of car : " + this.type);
            System.out.println("Passenger Capacity : " + this.passCap);
            System.out.println("Price : " + this.price + " rs. ");
    
        }
    }
    
    class Battery
    {
        String typeEngine;
        double bhp;
        double cc;
        int noPiston;
        double mileage;
    
        Engine (String typeEngine, double bhp, double cc, int noPiston, double mileage )
        {
            super();
            this.typeEngine = typeEngine;
            this.bhp = bhp;
        this.cc = cc;
        this.noPiston = noPiston;
        this.mileage = mileage;
    }
    public void displayEngine() {
        System.out.println();
        System.out.println("Engine Details : ");
        System.out.println("Type of Engine : " + this.typeEngine);
        System.out.println("Brake HorsePower : " + this.bhp + " bhp " ) ;
        System.out.println("Cubic Centimeter : " + this.cc  + " cc ");
        System.out.println("No of Piston :" + this.noPiston );
        System.out.println("Mileage : " +this.mileage);
    }
}

class CarDetails {
    public static void main(String[] args) { 
        //3. Car obj = new Car("Mercadise", "Black", "SUV", "Harrier", 4, 5000000, (new Engine("SI", 180, 2100, 4, 13)));
        Car obj = new Car("Mercadise", "Black", "SUV", "Harrier", 4, 5000000);
        obj.displayCar();
        obj.engine.displayEngine();
    }
}
    