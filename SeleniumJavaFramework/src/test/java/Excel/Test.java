package Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public Test(String excelPath , String sheetName)
	{
		 projectpath = System.getProperty("user.dir");
         try {
			workbook = new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		sheet = workbook.getSheet(sheetName);
		
	}
	
	public static void main (String args[])
	{
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		// TODO Auto-generated method stub
		int rowCount=0;
       try
        {
    	  
         rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows:" + rowCount);
        }
     catch(Exception e)
       {
	System.out.println(e);
       }
       return rowCount;
	}
	
	public static int getColCount() {
		// TODO Auto-generated method stub
		int colCount=0;
       try
        {
    	  
       colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of rows:" + colCount);
        }
     catch(Exception e)
       {
	System.out.println(e);
       }
       return colCount;
	}
	
	public static String getCellDataString(int row, int col)
	{
		String cellData=null;
		try
		{
		
		cellData = sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(cellData);
		
		}
		 catch(Exception e)
	       {
		System.out.println(e);
	       }
		return cellData;
		}
	
	public static void getCellDataNumber(int row , int col)
	{
		try
		{
		
		double cellDataNumber = sheet.getRow(row).getCell(col).getNumericCellValue();
		System.out.println(cellDataNumber);
		}
		 catch(Exception e)
	       {
		System.out.println(e);
	       }
			
		}
	}


