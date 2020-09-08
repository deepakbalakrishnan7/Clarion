package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POM {
	
	@FindBy(linkText = "Log Promise")
	private WebElement logPromises;
	
	@FindBy(id = "txtPromise")
	private WebElement promise;
	
	@FindBy(id = "btnSubmit")
	private WebElement btnLogPromise;
	
	@FindBy(id = "txtStartDate")
	private WebElement strtDate;
	
	@FindBy(id = "txtEndDate")
	private WebElement endDate;
	
	@FindBy(name = "btnSearch")
	private WebElement btnSearch;
	
	@FindBy(linkText = "LOGOUT")
	private WebElement logOut;	
	

	public HomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogPromises() {
		logPromises.click();
	}

	public void enterPromises(String p1) {
		promise.sendKeys(p1);
		btnLogPromise.click();
	}
	
	public void enterDates(String s1, String e1) {
		strtDate.sendKeys(s1);
		endDate.sendKeys(e1);
		btnSearch.click();
	}
	
	public void clickLogout() {
		logOut.click();
	}

}
