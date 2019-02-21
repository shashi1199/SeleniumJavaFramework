package Test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class gmailLogin {
public static void main(String[] args) {
// TODO Auto-generated method stub
gmailLogin obj = new gmailLogin();
obj.loginBrowser();
}
public void loginBrowser() {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://www.gmail.com");
driver.findElement(By.id("identifierId")).sendKeys("tc09shashi@gmail.com");
driver.findElement(By.xpath(".//span[contains(text(),'Next')]")).click();
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shashikumartc09");
driver.findElement(By.xpath("//div[@id='passwordNext']//content[@class='CwaK9']")).click();
}
}