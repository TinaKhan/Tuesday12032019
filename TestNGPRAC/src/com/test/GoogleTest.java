package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;
@BeforeMethod
public void setUp()
{System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://google.com");
}
@Test 
public void googleTitleTest()
{System.out.println("check the google tittle");
String title=driver.getTitle();
		}

@AfterMethod
public void tearDown()
{driver.quit();
}


}


