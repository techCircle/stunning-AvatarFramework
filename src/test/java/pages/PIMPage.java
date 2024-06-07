package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class PIMPage {
	
	
	public PIMPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath= "//label[text()='Employee Name']/ancestor::div[contains(@class, 'oxd-input-group')]//input")
	public WebElement employeeNameInputField; 
	
	@FindBy(xpath= "//label[text()='Supervisor Name']/ancestor::div[contains(@class, 'oxd-input-group')]//input")
	public WebElement supervisorNameInputField; 
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
	public WebElement PIMButton; 
	

}
