package root;

public class Car extends Vehicle{

  public Car(String c)
    {
        super(4,c,1000,210);
    }
    
    public void accelerate()
    {
        System.out.println("The car is accelerating.");
    }
    public void brk()
    {
        System.out.println("The car is braking.");
    }

}
