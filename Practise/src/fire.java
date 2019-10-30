import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close();
		driver.quit();
			

	}

}
