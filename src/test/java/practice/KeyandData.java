package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KeyandData {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("../PracticeTY/Files/Data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int rowlength = sh.getLastRowNum();
	for(int i=1;i<=rowlength;i++) {
		Row row = sh.getRow(i);
		Cell cell = row.getCell(2);
		double s = cell.getNumericCellValue();
		if(s>=15000) {
			Cell c = row.getCell(1);
			String n= c.getStringCellValue();
			System.out.println(n);
			
		}
	}
}
}
