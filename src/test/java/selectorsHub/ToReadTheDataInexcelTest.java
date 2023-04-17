package selectorsHub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadTheDataInexcelTest {

	public String getDataExcel(String sheetName,int row,int cellvalue) throws Throwable
	{
		FileInputStream file = new FileInputStream("./src/test/resources/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetName);
		Row	row1=sheet.getRow(row);
		Cell cell = row1.getCell(cellvalue);
		DataFormatter dt = new DataFormatter();
		String value = dt.formatCellValue(cell);
		return value;
		
	}
	public static void main(String[] args) throws Throwable {
		
		ToReadTheDataInexcelTest data = new ToReadTheDataInexcelTest();
		String f1 = data.getDataExcel("bookTicketTest", 0, 0);
		String f2 = data.getDataExcel("bookTicketTest", 0, 1);
		System.out.println(f1+" "+f2);
	}

}
