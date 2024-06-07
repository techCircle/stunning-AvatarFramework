package Utilities;

import pages.LoginPage;
import pages.PIMPage;

public class PageInitializer extends BaseClass {
	
	
	public static PIMPage pimP ;
	public static LoginPage lp;

	
	public static void initialize() {
		pimP = new PIMPage();
		lp = new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	

}
