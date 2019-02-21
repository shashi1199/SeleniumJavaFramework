package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
registrationForm();
	}
	
	@SuppressWarnings("static-access")
	public static void registrationForm()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shashi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		
		
		WebElement dropdown = driver.findElement(By.id("month"));
		
		Select drp = new Select(dropdown);
		
		drp.selectByValue("11");
		
		
         WebElement dropdown1 = driver.findElement(By.id("day"));
		
		Select drp1 = new Select(dropdown1);
		
		drp1.selectByValue("11");
		
		
        WebElement dropdown2 = driver.findElement(By.id("year"));
		
		Select drp2 = new Select(dropdown2);
		
		drp2.selectByValue("1989");
		
		
		driver.findElement(By.id("u_0_a")).click();
		
		driver.findElement(By.id("terms-link")).click();
		
		driver.navigate().to("https://facebook.com/");
		
		
		
		
		
		
	}

}
