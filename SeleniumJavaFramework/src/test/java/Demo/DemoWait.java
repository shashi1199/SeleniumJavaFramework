package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWait {

	public static void main(String[] args) {
		seleniumwaits();
	}
	public static void seleniumwaits()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin.typeform.com/signup");
		
		driver.findElement(By.xpath("//div[@class='signup-form-terms']//label[1]//span[2]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@class='signup-form-terms signup-form-email-optin']//label[1]//span[2]")).click();
		
		
	}
}
