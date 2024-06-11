package Utilities;

import automationPages.homePage;
import automationPages.myAccountPage;
import automationPages.productPage;
import automationPages.shopPage;
import pages.LoginPage;
import pages.PIMPage;

public class PageInitializer extends BaseClass {
	
	
	public static PIMPage pimP ;
	public static LoginPage lp;
	public static homePage hP;
	public static shopPage sP;
	public static productPage pP;
	public static myAccountPage mAp;

	
	public static void initialize() {
		pimP = new PIMPage();
		lp = new LoginPage();
		hP = new homePage();
		sP = new shopPage();
		pP = new productPage();
		mAp = new myAccountPage();
	}
	
	
	
	
	
	
	
	
	
	

}
