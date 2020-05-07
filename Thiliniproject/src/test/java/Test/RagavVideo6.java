package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObjects.FacebookLoginPage;

public class RagavVideo6 {
	
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		//calling the function
		
		browserSearch();
	}

	public static void browserSearch() {
		
		String a= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", a + "\\Drivers\\Geko Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		//open google search engine
		driver.get("https://www.facebook.com/");
		
		//email
		//driver.findElement(By.id("email")).sendKeys("thilokumari01@gmail.com");
		FacebookLoginPage.textbox_email(driver);
		
		//password
		//driver.findElement(By.id("pass")).sendKeys("1989*Ttke");
		FacebookLoginPage.textbox_password(driver);
		
		//pressing login button
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		FacebookLoginPage.btn_login(driver);
				
	
		//close browser
		driver.close();
		
		System.out.println("My first browser test is completed successfully");
	}
}
