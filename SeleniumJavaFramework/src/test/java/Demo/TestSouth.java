package Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSouth {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  
@BeforeMethod
@BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    driver.get("https://www.southwest.com/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Flight type options'])[1]/following::label[1]")).click();
    driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privacy Policy'])[1]/following::button[1]")).click();
    driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).clear();
    driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).sendKeys("ATL");
    driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).click();
    driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).clear();
    driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).sendKeys("MCO");
    driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("LandingPageAirSearchForm_departureDate")).click();
    driver.findElement(By.id("calendar-257-2019-02-25")).click();
    driver.findElement(By.id("LandingPageAirSearchForm_returnDate")).click();
    driver.findElement(By.id("calendar-260-2019-02-27")).click();
    driver.findElement(By.id("LandingPageAirSearchForm_submit-button")).click();
  }

  
@AfterMethod
@AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      AssertJUnit.fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
