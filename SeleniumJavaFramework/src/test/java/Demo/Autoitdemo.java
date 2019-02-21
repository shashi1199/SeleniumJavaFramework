package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitdemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("E:\filescript.exe");
		
		Thread.sleep(3000);
		
	}

}
