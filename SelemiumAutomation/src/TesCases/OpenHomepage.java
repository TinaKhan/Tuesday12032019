package TesCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHomepage {

	public static void main(String[] args) throws InterruptedException {

    //set the path to chrome
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neisha\\Downloads\\chromedriver_win321\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	// to maiximize the browser
	driver.manage().window().maximize();
	driver.wait(20000);
	driver.close();
	

	}

}
