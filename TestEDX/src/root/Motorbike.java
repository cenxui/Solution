package root;

public class Motorbike extends Vehicle {
  public Motorbike(String c)
    {
        super(2,c,600,150);
    }
    
    public void accelerate()
    {
        System.out.println("The motorbike is accelerating.");
    }
    public void brk()
    {
        System.out.println("The motorbike is braking.");
    }
}
