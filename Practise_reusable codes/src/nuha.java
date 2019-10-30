import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class nuha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\Neisha\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.getCurrentUrl();

	}

}
