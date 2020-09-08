package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {
	
	@FindBy(name = "txtUsername")
	private WebElement username;
	
	@FindBy(name = "txtPassword")
	private WebElement password;
	
	@FindBy(name = "submit1")
	private WebElement lgnBtn;
	
	public LoginPage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgnBtn.click();
	}

}
