package Excel;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectpath = System.getProperty("user.dir");
		Test excel = new Test(projectpath+"/Excell/data.xlsx", "Sheet1");

       excel.getRowCount();
       excel.getCellDataString(0, 0);
       excel.getCellDataNumber(1, 1);
	}

}
