package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author manish
 *	@description This class is used to fetch the data from XLSX file
 */

public class DataFile {
	public String xlsxFileData(String sheetname, int rownum, int cellnum) throws Throwable {
		FileInputStream fis  = new FileInputStream("../SDET7_MAN/Files/Data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String cell = workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return cell;
	}

	
}