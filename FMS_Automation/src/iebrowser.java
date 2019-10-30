import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.ie.driver","C:\\Users\\Neisha\\Documents\\MicrosoftWebDriver.exe");
          WebDriver driver=new InternetExplorerDriver();
         driver.get("http://www.google.com");
//driver.get("http://www.facebook.com");

	}

}
