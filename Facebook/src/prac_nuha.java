import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prac_nuha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.echoecho.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"IHPc-travelers\"]/div[3]/svg/path")).click();
		//Hy1o-subscription-panel-toggleBox-label
		//Select s=new Select(driver.findElement(By.id("IHPc-cabin-b-label")));
		//s.selectByVisibleText("Premium Economy");
		//System.out.println(driver.findElement(By.id("KgdB")).isSelected());
		//driver.findElement(By.xpath("//input[@class='r9-radiobuttonset hidden']")).click();
		//System.out.println(driver.findElement(By.id("KgdB")).isSelected());
		
		

	}

}
