package TestNG;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserTestJ {

	WebDriver driver = null;
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		 driver = new ChromeDriver();
	}
	
		
		
	@org.testng.annotations.Test
	public void loginBrowser() {
	driver.get("https://yahoo.com/");
 
 
 
 //WebElement textbox =driver.findElement(By.id("identifierId"));
 
 WebElement textbox =driver.findElement(By.xpath("//input[@name='p']"));
 textbox.sendKeys("Arun T C");
//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);



List<WebElement> textboxs = driver.findElements(By.xpath("//input"));

int count = textboxs.size();

System.out.println("Count of Input Elements "+count);

try {
	Thread.sleep(30000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	@AfterTest
	public void tearDownTest()
	{
 driver.close();
	}

}
