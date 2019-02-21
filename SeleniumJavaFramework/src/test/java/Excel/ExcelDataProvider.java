package Excel;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import config.PropertiesFile;

public class ExcelDataProvider {
	
//public static void main(String[] args) {
//	String excelPath = "C:\\Users\\Shashi\\Eworkspace\\SeleniumJavaFramework\\Excell\\data.xlsx";
//	testData(excelPath, "Sheet1");
//}
WebDriver driver = null;
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		driver = new ChromeDriver();
	}
@org.testng.annotations.Test(dataProvider="test1data")
	public void test1(String username, String password)
	{
		System.out.println(username+ "|"+ password);
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys(username);
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	}
	
@DataProvider(name = "test1data")
public  Object[][] getData()
{
	String excelPath = "C:\\Users\\Shashi\\Eworkspace\\SeleniumJavaFramework\\Excell\\data.xlsx";
	Object data[][] = testData(excelPath, "Sheet1");
	return data;
	}
	public  Object[][] testData(String excelPath , String sheetName)
	{
		Test excel = new Test(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData= excel.getCellDataString(i , j);
			    System.out.println(cellData);
			    data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
}
}

