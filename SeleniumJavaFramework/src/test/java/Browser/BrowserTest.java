package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Shashi\\Eworkspace\\SeleniumJFramework\\driver\\geckodriver\\geckodriver.exe");
 //WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shashi\\Eworkspace\\SeleniumJFramework\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
 driver.close();
	}

}
