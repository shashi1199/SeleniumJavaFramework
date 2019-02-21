package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSouthwest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://southwest.com/");
		
		driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).clear();
		
		driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).sendKeys("ATL");
		
		driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).clear();
		
		driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).sendKeys("MCO");
		
		driver.findElement(By.id("LandingPageAirSearchForm_departureDate")).clear();
		
		driver.findElement(By.id("calendar-253-2019-02-25")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.xpath("//div[@class='date-input-group air-search-form--fields-dates']//div[2]//label[1]//div[1]//div[1]//div[1]//input[1]")).clear();
		
		driver.findElement(By.id("calendar-256-2019-02-28")).click();
		
		
		

	}

}
