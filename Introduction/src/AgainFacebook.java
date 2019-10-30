import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgainFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("raj232377@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		//driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();

	}

}
