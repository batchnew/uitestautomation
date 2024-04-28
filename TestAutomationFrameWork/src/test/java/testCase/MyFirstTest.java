package testCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class MyFirstTest {
//	public String environment1 = "https://www.zoho.com/";
//	public String environment2 = "https://www.google.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();//base
		WebDriver driver = new ChromeDriver();//base
		
		
		driver.get("https://www.zoho.com/");//properties//config//csv or excel
		driver.findElement(By.linkText("Sign in")).click(); //locaters /poperties, any particular java class(login page)
		driver.findElement(By.id("login_id")).sendKeys("batchnew104@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("umeshumeshumesh");
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		
		// TODO Auto-generated method stub

	}
	}
	

	
	
	

