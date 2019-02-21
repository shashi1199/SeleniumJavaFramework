package Test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsDemoTestNG {

	
	WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void setUP()
	{
		
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		driver = new ChromeDriver();
	}

	@Test
	public void test1() throws IOException
	{
		
		ExtentTest test= extent.createTest("Google search", "this is a test to validate google search functionality");
		driver.get("https://google.com");
		
		test.log(Status.INFO, "Starting Test Case");
		
		test.info("This step shows usage");
		
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void teardown()
	{
extent.flush();
	}

}
