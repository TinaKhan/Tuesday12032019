package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngbasics {
     @BeforeSuite
     public void setup()
     {System.out.println("setup system property for chrome");
	}
     @BeforeClass
     public void launchbrowser()
     {System.out.println("launch the  chrome browser");
     }
     @BeforeMethod
     public void enterUrl()
     {System.out.println("enter the url");
     }
     @Test
     public void googleTitleTest()
     {System.out.println("check the google title in the test");
     }@AfterMethod
     public void logout()
     {System.out.println("Log out of the app");}
     @AfterClass
     public void closeBrowser()
     {System.out.println("close the browser");}
}


     

