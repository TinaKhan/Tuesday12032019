import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://facebook.com");
		//driver.getPageSource();
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.findElement(By.id("email")).sendKeys("raj232377@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.linkText("Forgot account?")).click();

	}

}
