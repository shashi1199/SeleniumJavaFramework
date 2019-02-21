package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
static WebDriver driver= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		//create ExtentReports and attach reporter(s)
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1= extent.createTest("Google search", "this is a test to validate google search functionality");
	driver = new ChromeDriver();	
	
	test1.log(Status.INFO, "Starting Test Case");
	test1.log(Status.INFO, "Hi Arun");
	driver.get("https://google.com");
	test1.pass("Navigated to google.com");
	driver.findElement(By.name("q")).sendKeys("Atumation");
	test1.pass("Entered text in Searchbox");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);;
	test1.pass("Pressed keyboard enter key");
	
	driver.close();
	test1.pass("Closed the browser");
	test1.info("Test completed");
	
	ExtentTest test2= extent.createTest("Google search", "this is a test to validate google search functionality");
	driver = new ChromeDriver();	
	
	test2.log(Status.INFO, "Starting Test Case");
	//test1.log(Status.INFO, "Hi Arun");
	driver.get("https://google.com");
	test2.pass("Navigated to google.com");
	driver.findElement(By.name("q")).sendKeys("Atumation");
	test2.pass("Entered text in Searchbox");
	driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);;
	test2.fail("Pressed keyboard enter key");
	
	driver.close();
	test2.pass("Closed the browser");
	test2.info("Test completed");
	
	extent.flush();
	
	}

}
