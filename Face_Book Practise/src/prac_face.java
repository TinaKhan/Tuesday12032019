import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac_face {
	//input[type*='email']input[type*='password']input[spellcheck*='false']
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("span[class='_50f6']")
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.get("http://www.gmail.com");
		//driver.findElement(By.cssSelector("input[type='email']").
				//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("raj232377@yahoo.com");
				//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
				//driver.findElement(By.cssSelector("input[data-testid='royal_login_button']")).click();
		driver.findElement(By.cssSelector("a[class*='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		driver.findElement(By.cssSelector("input[type*='email']")).sendKeys("tinak4781@gmail.com");
		driver.findElement(By.cssSelector("span[class*='RveJvd snByac']")).click();
		driver.findElement(By.cssSelector("input[spellcheck*='false']")).sendKeys("Lubna436");
		//driver.findElement(By.cssSelector("span[class*='RveJvd snByac']")).click();
}

}
