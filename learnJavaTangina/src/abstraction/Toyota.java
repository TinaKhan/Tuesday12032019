package abstraction;

public class Toyota extends FlyingCar implements Car{

	
    public void start() {
	System.out.println("Toyota has key driven start");	
		
	}

	public void stop() {
		System.out.println("Toyota have key driven stop");
		
	}

	public void brake() {
		
	System.out.println("Toyota have manual break");	
	}
  public void lightweight()
  {System.out.println("Toyota produce lightweight car");
}


public void autopilot() {
	
	
}
}
