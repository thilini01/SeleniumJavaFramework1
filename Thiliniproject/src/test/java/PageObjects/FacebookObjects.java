package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookObjects {

	//Defining webdriver (5)
	WebDriver driver =null;
	
	// Locators for webelements (1)
	
	By textbox_email = By.id("email");
	By textbox_password =By.id("pass");
	By btn_login = By.xpath("//input[@type='submit']");
	
	
	// Creating a constructor to define the main method webdrive (6)
	public FacebookObjects(WebDriver driver){
		this.driver =driver;
	}
	
	
	//Add methods to the webelements (2)
	public  void setText_email() {
		driver.findElement(textbox_email).sendKeys("thilokumari01@gmail.com");
		
	}
	
	//Not hard corded text.User can enter the password (3)
	public void setText_Password(String text) {
		driver.findElement(textbox_password).sendKeys(text);
	}
	
	//Press on Login button (4)
	public void clickbtn_Login() {
		driver.findElement(btn_login).click();
	}
}
