package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver=null;
	
	@BeforeSuite
	public void Setup() {	
		 // start reporters
         htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
         extent.attachReporter(htmlReporter);
        
        
		String a= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", a + "\\Drivers\\Geko Driver\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
	
	
	@BeforeTest
	public void Firsttest() {	
		
		String a= System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", a + "\\Drivers\\Geko Driver\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
	
		
	
	@Test
	public void AcutalTest() throws IOException {
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

     // log(Status, details)
		 test.log(Status.INFO, "Load Facebook");
		driver.get("https://www.facebook.com/");
		test.pass("This is the facebook page");;

		
        // info(details)
        test.info("This step shows usage of info(details)");
   	     test.log(Status.INFO, "enter password");
		driver.findElement(By.id("pass")).sendKeys("1989*Ttke");
		test.pass("this is password");
		
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        	
	}
	
	@AfterTest
       public void Endtest() {
		
		driver.close();
		
		System.out.println("Test is successfull");
		
		// calling flush writes everything to the log file
        extent.flush();
	
}



}
