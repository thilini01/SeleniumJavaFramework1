package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportsBasics {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// start reporters
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		  
		  // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        
	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	        
	        
	        String a= System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", a + "\\Drivers\\Geko Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			 test.log(Status.INFO, "Load Facebook");
			driver.get("https://www.facebook.com/");
			test.pass("This is the facebook page");
			
			 test.log(Status.INFO, "enter email");
			driver.findElement(By.id("email")).sendKeys("thilokumari01@gmail.com");
			test.pass("this is email");
			
			 test.log(Status.INFO, "enter password");
			driver.findElement(By.id("pass")).sendKeys("1989*Ttke");
			test.pass("this is password");
			
			
			 test.log(Status.INFO, "press log in button");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			test.pass("this is login");
			
			driver.close();
			
			test.info("Test is successful");
			
		    // calling flush writes everything to the log file
	        extent.flush();
			
	}

}
