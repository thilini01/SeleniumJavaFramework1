
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserTest {

	public static void main(String[] args) {
		
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","C:\\Users\\Kalashini\\eclipse-workspace\\Thiliniproject\\Drivers\\Geko Driver\\geckodriver.exe"
		 * ); WebDriver driver=new FirefoxDriver();
		 */
		String a= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", a +"\\Drivers\\Chrome driver\\chromedriver.exe");

		
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
