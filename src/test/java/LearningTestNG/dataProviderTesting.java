package LearningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTesting {
	
	@DataProvider(name= "namesProvider")
	public static  String[][] names() {
		return new String[][] {{"name", "Shafkat"}, {"name", "Shihi"}, {"lastName", "Zurki"}, 
			{"lastName","Chavez"}, {"name", "Sabat"}};
	}
	
	@DataProvider(name= "asianNames")
	public static  String[][] names2() {
		return new String[][] {{"name", "Yancy"}, {"name", "Chengiz"}, {"firstName", "Tukta"}, 
			{"lastName","Malak"}, {"name", "Khemmanji"}};
	}
	
	@DataProvider(name= "EuropeanNames")
	public static  String[][] names3() {
		return new String[][] {{"name", "King James"}, {"name", "Rodrygo"}, {"lastName", "Kylian"}, 
			{"lastName","Ronaldo"}, {"name", "Messi"}};
	}
	
	@DataProvider(name= "myBio")
	public static  Object[][] myBioProvider() {
		return new Object[][] {{"name", "King James", 33}, {"name", "Rodrygo", 44}, {"lastName", "Kylian", 24}, 
			{"lastName","Ronaldo", 39}, {"name", "Messi", 36}};
	}
	
	
	@Test(dataProvider="EuropeanNames")
	public void FirstNames(String type, String name) {
		System.out.println("My " + type + " is "+ name);
	}
	
	
	@Test(dataProvider="myBio")
	public void myBio(String type, String name, int number) {
		System.out.println("My " + type + " is "+ name + " and  i am " + number + " years old.");
	}
	
	
	
	
	

}
