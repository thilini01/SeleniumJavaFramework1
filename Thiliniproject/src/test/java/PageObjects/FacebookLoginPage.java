package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
	
 //Defining Webelement as a class element
	
	private static WebElement element=null;
	
	
	public static WebElement textbox_email(WebDriver driver) {
		
		//WebElement elememt = driver.findElement(By.id("email")).sendKeys("thilokumari01@gmail.com");
		element = driver.findElement(By.id("email"));
		element.sendKeys("thilokumari01@gmail.com");
	    return element;
	}

	
	public static WebElement textbox_password(WebDriver driver) {
		element=driver.findElement(By.id("pass"));
		element.sendKeys("1989*Ttke");
		return element;
	}
	
	
	public static WebElement btn_login(WebDriver driver) {
		element =driver.findElement(By.xpath("//input[@type='submit']"));
		element.click();
		return element;
	}
}
