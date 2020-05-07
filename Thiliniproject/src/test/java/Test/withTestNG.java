package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.FacebookObjects;

public class withTestNG {
	
 WebDriver driver=null;

	@BeforeTest
	public void StartFirst() {
		String a= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", a + "\\Drivers\\Geko Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	@Test
	public void Bodytorun() {
		FacebookObjects facebookPage=new FacebookObjects(driver);
	

		driver.get("https://www.facebook.com/");		
		facebookPage.setText_email();
		facebookPage.setText_Password("1989*Ttke");
		facebookPage.clickbtn_Login();
	}
	
	@AfterTest
	public void Endoftherun() {
		driver.close();
		
	}
	
}


