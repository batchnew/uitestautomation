package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;//browser setup // this is global level
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	//@BeforeTest  //annotations//Before test will act as single time 
	@BeforeMethod  //before method will act as multiple runs
	public void setUp() throws IOException {
		if(driver==null) {  
			System.out.println("The path is:" + System.getProperty("user.dir")); // It will show and know us project path and where exactly store the peice of code
			//FileReader fr = new FileReader("C:\\Users\\Umesh\\eclipse-workspaceJuly20\\TestAutomationFrameWork\\src\\test\\resources\\configfiles\\config.properties"); //this is hard core now we can change this and concatinate with user.dire (from source it won"t change
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			
			prop.load(fr);//loadreader
			loc.load(fr1);//loadreader
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			//We don't need to instantiate WebDriver(the above again and again because we have define in the global level , then it will look below
			driver = new ChromeDriver();
			
			//driver.get("https://www.zoho.com/");  //this is hardcore value if any thing change from qa to stage, then it will give dificult to change url everywhere, Thats the reason we will pass the value from config.properties 
		    driver.get(prop.getProperty("testurl"));
		    }
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		}
		
		
	}
	//@AfterTest // after test will act as single time with test
	@AfterMethod  //This is will run with multiple times for each test
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
		
	}

}
