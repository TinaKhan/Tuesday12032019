package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngprac {
	@BeforeSuite
	public void setup() {
System.out.println("setup system property for chrome");
	}
	@BeforeTest
	public void launchbrowser()
	{System.out.println("launch the browser");
	}
	@BeforeClass
	public void  login()
	{System.out.println("login to the app");
	
	}
	@Test()
	public void googleTitleTest()
	{System.out.println("google Title Test");
}
	@Test
	public void searchtext()
	{System.out.println("Search the text");
	}
	
	@AfterMethod()
	public void Logout()
	{System.out.println("google Title Test");
}
	@AfterTest()
	public void deleteAllCoockies()
	{System.out.println("deleteAllCoockies");
}
}
