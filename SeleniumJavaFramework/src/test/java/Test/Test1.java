package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String args[])
	{
		googleSearch();
		
		//System.out.println("Shashi");
	}

	public static void googleSearch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//Text box
		driver.findElement(By.name("q")).sendKeys("Java");
		//search button
		
		//driver.findElement(By.id("gb_70")).click();
		
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		driver.close();
		
		
		
	}
}
