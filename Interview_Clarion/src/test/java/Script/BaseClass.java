package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static {
		WebDriverManager.chromedriver().setup();
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open Chrome Browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://182.74.238.221/clarion_promise_qa/home.php");
	}
	
	@AfterMethod
	public void closeBrowser() {
		//Close Chrome browser
		driver.close();
	}

}
