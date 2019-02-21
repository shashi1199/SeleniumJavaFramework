package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearchTest();

	}
 
	public static void googleSearchTest()
	{
		driver = new ChromeDriver();
		
		GoogleSearchPageObject search = new GoogleSearchPageObject(driver);
		
		driver.get("https://google.com");
		
		search.setTextInSearchBox("Arun");
		
		search.clickSearchButton();
		
	
	}
}
