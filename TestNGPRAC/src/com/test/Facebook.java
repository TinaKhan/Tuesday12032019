package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	
@Test(priority=1,groups="GoogleTitle")
public void googleTitleTest()
{String title=driver.getTitle();
System.out.println(title);
}
@Test(priority=3)
public void googlelogoTest()
{boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
}
@Test(priority=4)
public void maillinktest()
{driver.findElement(By.linkText("Gmail")).isDisplayed();
}
@Test(priority=6,groups="test")
public void test1()
{System.out.println("test1");}
@Test(priority=1)
public void test2()
{System.out.println("test2");}
@Test(priority=5,groups="test")
public void test3()
{System.out.println("test3");}


@AfterMethod 
public void teardown()
{driver.quit();

	}
}
	

