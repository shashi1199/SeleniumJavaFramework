package Test;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class NewTest {
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest()
	{
		 driver = new ChromeDriver();
	}
	@Test
public void loginBrowser() {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://gmail.com");
driver.findElement(By.id("identifierId")).sendKeys("tc09shashi@gmail.com");
driver.findElement(By.xpath(".//span[contains(text(),'Next')]")).click();
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shashikumartc09");
driver.findElement(By.xpath("//div[@id='passwordNext']//content[@class='CwaK9']")).click();
}
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
	}
}