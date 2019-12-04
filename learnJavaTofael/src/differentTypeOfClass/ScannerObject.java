package differentTypeOfClass;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		System.out.println("Enter your location name : ");
		Scanner sc = new Scanner(System.in);
		String Name=sc.nextLine();
		System.out.println("Hello ! Now you know my location "+Name);

	}

}
