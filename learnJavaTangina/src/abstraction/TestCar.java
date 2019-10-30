package abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car cr=new Toyota();
		cr.start();
		cr.stop();
		cr.brake();
		Toyota ty=new Toyota();
		ty.lightweight();
		ty.start();
		ty.brake();
		FlyingCar fy=new Toyota();
		fy.flyingfeature();
		
		
	}

}
