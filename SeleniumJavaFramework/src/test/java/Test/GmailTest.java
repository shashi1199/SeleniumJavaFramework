package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GmailPages;


public class GmailTest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gmailTest();

	}
	public static void gmailTest()
	{
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		GmailPages.textbox_search(driver).sendKeys("tc09shashi@gmail.com");
		
		GmailPages.buttn_next(driver).click();
		
		GmailPages.textbox_password(driver).sendKeys("shashikumartc09");
		
		GmailPages.buttn_nextPassword(driver).click();
		
		driver.close();
	
		
	}
}

