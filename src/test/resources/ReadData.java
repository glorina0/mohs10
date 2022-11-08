import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ReadData 
{
	@org.testng.annotations.Test
	public void readdata()
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Mohs10 Technologies\\Documents\\Kantara.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		Sheet s=wb.getSheet("Glory");
		Row r=s.getRow(4);
		Cell c=r.getCell(4);
		System.out.println(c.getStringCellValue()); 
	}	
}
