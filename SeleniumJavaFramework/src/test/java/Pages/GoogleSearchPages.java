package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPages {

	private static WebElement element= null;
	
	public static WebElement textbox_search(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement buttn_search(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
		return element;
	}

}
