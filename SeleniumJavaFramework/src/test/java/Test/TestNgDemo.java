package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNgDemo {
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest()
	{
		 driver = new ChromeDriver();
	}
@org.testng.annotations.Test
	public  void googleSearch()
	{
		
		driver.get("https://google.com");
		//Text box
		driver.findElement(By.name("q")).sendKeys("Java");
		//search button
		
		//driver.findElement(By.id("gb_70")).click();
		
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
	
		
		
		
		
	}

@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
	}
}

