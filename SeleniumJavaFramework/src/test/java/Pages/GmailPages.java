package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPages {
	private static WebElement element= null;
	public static WebElement textbox_search(WebDriver driver)
	{
		element = driver.findElement(By.id("identifierId"));
		return element;
	}
	
	public static WebElement buttn_next(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//span[contains(text(),'Next')]"));
		return element;
	}
	
	public static WebElement textbox_password(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='password']"));
		return element;
	}
	public static WebElement buttn_nextPassword(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='passwordNext']//content[@class='CwaK9']"));
		return element;
	}
}

