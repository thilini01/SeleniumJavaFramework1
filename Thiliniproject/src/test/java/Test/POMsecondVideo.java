package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.FacebookObjects;

public class POMsecondVideo {
	
static WebDriver driver=null;

	public static void main(String[] args) {
		Facebooktest();
		
	}
	
	public static void Facebooktest() {
		String a= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", a + "\\Drivers\\Geko Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		FacebookObjects facebookPage=new FacebookObjects(driver);
		
		driver.get("https://www.facebook.com/");
		
		facebookPage.setText_email();
		facebookPage.setText_Password("1989*Ttke");
		facebookPage.clickbtn_Login();
		
		driver.close();
		
	}
}


