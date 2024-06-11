package automationPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;
import Utilities.commonMethods;

public class homePage {
	
	
	public homePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//ul[@id='main-nav']/li")
	public List<WebElement> mainNavBar;
	
	
	@FindBy(xpath="//div[@class='n2-ss-slider-3']/div")
	public List<WebElement> sliders;
	
	
	@FindBy(xpath="//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
	public List<WebElement> arrivals;
	
	
	@FindBy(xpath="//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[1]")
	public WebElement firstArrival;
	
	
	public void clickOnNavOption(String option) {
		for(WebElement eachNavOption : mainNavBar) {
			if(eachNavOption.getText().contains(option)) {
				commonMethods.click(eachNavOption);
				break;
			}
		}
	}
	

}
