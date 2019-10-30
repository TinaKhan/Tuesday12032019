import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//<span class="_50f6">Log in as Raj Vp</span>
		System.setProperty("webdriver.chromedriver.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
System.out.println(driver.getCurrentUrl());
driver.get("http://www.facebook.com");
//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("raj232377@yahoo.com");
//driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("12345678");
//driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
//driver.findElement(By.cssSelector("input[type='email']").("raj232377@yahoo.com");
driver.findElement(By.cssSelector("input[type='email']")).sendKeys("raj232377@yahoo.com");
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234567");
driver.findElement(By.cssSelector("input[value='Log In']")).click();
System.out.println(driver.findElement(By.cssSelector("span[class='_50f6']")).getText());
	
	
	}
}
	


