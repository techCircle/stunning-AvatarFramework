package automationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class myAccountPage {
	
	
	public myAccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(id="username")
	public WebElement usernameField;
	
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	
	@FindBy(name="login")
	public WebElement loginButton;
	
	
	@FindBy(xpath="//a[text()='Sign out']")
	public WebElement signOutButton;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']/li")
	public WebElement incorrectCredentialMessage;
	
	
	
	public void attemptToLoginIn(String username, String password) {
		commonMethods.sendKeys(username, usernameField);
		commonMethods.sendKeys(password, passwordField);
		commonMethods.click(loginButton);

	}

}
