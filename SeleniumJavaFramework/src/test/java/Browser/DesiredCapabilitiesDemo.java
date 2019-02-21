package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("ignoreProtectedModeSettings", true);
		
    System.setProperty("webdriver.ie.driver","C:\\Users\\Shashi\\Eworkspace\\SeleniumJFramework\\driver\\IEDriver\\EDriverServer.exe");	
   WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium jobs");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
	}

}
