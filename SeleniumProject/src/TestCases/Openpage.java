package TestCases;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Openpage {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neisha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("http://www.facebook.com");
				
		
	}

}