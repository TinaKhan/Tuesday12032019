import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver","C:\\Users\\Neisha\\Documents\\MicrosoftWebDriver.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
		//int a=100;
		//int b=200;
		//int sum=a+b;
		//System.out.println(sum);
		
		//
		
		
		
		
		
	}

}
