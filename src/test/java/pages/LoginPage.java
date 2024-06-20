package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(name="username")
	public WebElement loginUserInputField; 
	
	@FindBy(name="password")
	public WebElement loginPasswordInputField; 
	
	@FindBy(xpath="//*[text() = ' Login ']")
	public WebElement loginButton; 
	
	
//	public static WebElement loginUserField = BaseClass.getDriver().findElement(By.name("username"));

	
	public void LoginToApp() {
		loginUserInputField.sendKeys(BaseClass.getProperty("userName"));
		loginPasswordInputField.sendKeys(BaseClass.getProperty("passWord"));
		loginButton.click();
	}
	
	
	
	

}
