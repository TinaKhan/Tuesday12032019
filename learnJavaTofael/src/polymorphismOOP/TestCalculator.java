package polymorphismOOP;

public class TestCalculator {

	public static void main(String[] args) {
		LandCalculator lc = new LandCalculator();
		lc.areaOfLand(200,100);
		lc.areaOfLand(200,"75");
		lc.areaOfLand(200, 100, "50");
		lc.areaOfLand(200, 100, 40);
		lc.areaOfLand(200, 100, 20,70);
		LandCalculator.areaOfLand(200, 100, 50, 20, 10);
		
		ModernCalculator mc = new ModernCalculator();
		mc.areaOfLand(200, 100);
		mc.areaOfLand(200, "75");
		mc.areaOfLand(200, 100, "50");
		mc.areaOfLand(200, 100, 40);
		}

}
