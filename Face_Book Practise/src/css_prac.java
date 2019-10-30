import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class css_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
	}

}
