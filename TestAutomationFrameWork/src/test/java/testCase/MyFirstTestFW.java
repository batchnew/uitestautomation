package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import base.BaseTest;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProvider="testdata",priority =1)
	public void LoginTest(String username,String password) throws InterruptedException{//3string is username and password added for datadriven (dataprovider)test/ with out adding 1,2 will get pass
		 //1
		System.out.println("clicked successfully");
//		//driver.get("https://www.zoho.com/");//properties//config//csv or excel
//		driver.findElement(By.linkText("Sign in")).click(); //locaters /poperties, any particular java class(login page)
//		driver.findElement(By.id("login_id")).sendKeys("batchnew104@gmail.com");
//		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.id("password")).sendKeys("umeshumeshumesh");
//		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		//  This all are moved to locators properties file
		
	
		//2 with locater configuration
//		Thread.sleep(4000);
//		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click(); //locaters /poperties, any particular java class(login page)
//		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys("batchnew104@gmail.com");
//		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("umeshumeshumesh");
//		driver.findElement(By.xpath((loc.getProperty("login_next_button")))).click();
		
		//3 data provider
		Thread.sleep(4000);
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click(); //locaters /poperties, any particular java class(login page)
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		driver.findElement(By.xpath((loc.getProperty("login_next_button")))).click();
		
	}
		//This method will provide data to any test method that declares that its Data Provider
		//is named "test1"
		@DataProvider(name = "testdata")
		public Object[][] tdata()
		{
		 return new Object[][] 
		  {
		   { "batchnew4@gmail.com", "umeshumeshumesh" },//invalid
		   { "batchnew104@gmail.com", "umeshumeshumesh12"},//invalid
		   { "batchnew104@gmail.com", "umeshumeshumesh"}
		 };
		}
		//with the dataprovider we should provide the data to script without hardcore value, we can perform dataDrivern approch or datadriven testing for our test case/
		
		
		
		
	 

}
