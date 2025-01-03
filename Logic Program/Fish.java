public class Fish {
    String Fname;
    String species;
    int Size;
    String color;
    int LifeSpan;
    String reproduction;

    Fish(String Fname,String species, int Size,String color,int LifeSpan)
    {
        super();
        this.Fname=Fname;
        this.species= species;
        this.Size=Size;
        this.color=color;
        this.LifeSpan= LifeSpan;
        this.reproduction = reproduction;
    }
    public void displayFish(){
        System.out.println();
        System.out.println("Fish Details");
        System.out.println("Fish name:"+this.Fname );
        System.out.println("Species:"+this.species);
        System.out.println("size:"+this.Size);
        System.out.println("color:"+this.color);
        System.out.println("LifeSpan:"+this.LifeSpan);
        System.out.println("reproduction:"+this.reproduction);
    }
}
class FishTank{
    int Capacity;
    String Material;
    String Shape;
    String Lighting ;
    double price;

    FishTank( int Capacity,String Material,String Shape,String Lighting ,double price)
    {
        super();
        this.Capacity=Capacity;
        this.Material=Material;
        this.Shape=Shape;
        this.Lighting=Lighting;
        this.price=price;
    }
    public void displyFishTank(){
        System.out.println();
        System.out.println("FishTank Details");
        System.out.println("Capacity:"+this.Capacity);
        System.out.println("Material:"+this.Material);
        System.out.println("Shape:"+this.Shape);
        System.out.println("Lighting:"+this.Lighting);
        System.out.println("price:"+this.price);
    }
}
class Water{
    int temp;
    double pH;
    String TDS;

    Water(int temp,double pH,String TDS)
    {
        super();
        
    }
}