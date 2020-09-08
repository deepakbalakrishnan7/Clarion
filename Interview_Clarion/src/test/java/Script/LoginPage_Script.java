package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.HomePage_POM;
import POM.LoginPage_POM;

public class LoginPage_Script extends BaseClass {
	
	@Test(priority = 0)
	public void login() {
		
		//login without Username & Password
		LoginPage_POM lp = new LoginPage_POM(driver);
		lp.login("","");
		
		String un = driver.findElement(By.name("txtUsername")).getText();
		String pwd = driver.findElement(By.name("txtPassword")).getText();
		
		//Validate field are blank
		if (un.isEmpty() || pwd.isEmpty()) {
			Reporter.log("Fields Are Blank");
		}
		else {
			Reporter.log("Fields are Filled with UserName & PassWord");
		}
	}
	
	
	@Test(priority = 1)
	public void loginFunc() {
		
		//login with Username & Password
		LoginPage_POM lp = new LoginPage_POM(driver);
		lp.login("sanjeetk@clariontechnologies.co.in","clarion");
		
		//varialbes for validation
		String org_home = "HOME";
		String exp_home = driver.findElement(By.linkText("HOME")).getText();
		
		//confirmation of user login
		if (org_home.equals(exp_home)) {
			Reporter.log("User logged in Successfully");
		}
		else {
			Reporter.log("User unable to Login");
		}
		
		//Click Log Promise Link
		HomePage_POM hp = new HomePage_POM(driver);
		hp.clickLogPromises();
		
		//Select Sonali test in dropdown
		WebElement drpdwn1 = driver.findElement(By.name("cboEmp"));
		Select sel = new Select(drpdwn1);
		sel.selectByVisibleText("Sonali test");
		
		//Enter promise and click log promises
		hp.enterPromises("Enter Promise07");
		
		//Select Sonali test in Dropdown (Search Page)
		WebElement drpdwn2 = driver.findElement(By.id("cboEmp"));
		Select sel1 = new Select(drpdwn2);
		sel1.selectByVisibleText("Sonali test");
		
		//select Start & End Dates
		hp.enterDates("07-09-2020", "07-09-2020");
		
		String org_promise = "Enter Promise07";
		String exp_prmoise = driver.findElement(By.xpath("//td[contains(text(),'Enter Promise07')]")).getText();
		
		//Validate promise is added
		if (org_promise.equals(exp_prmoise)) {
			Reporter.log("Promise Added Successfully");
		}
		
		//user logging out
		hp.clickLogout();
	}

}
