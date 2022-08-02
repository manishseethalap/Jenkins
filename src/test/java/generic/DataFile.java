package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Vtiger.generic.IAutoConsts;

/**
 * @author manish
 *	@description This class is used to fetch the data from XLSX file
 */

public class DataFile {
	public String xlsxFileData(String sheetname, int rownum, int cellnum) throws Throwable {
		FileInputStream fis  = new FileInputStream(IAutoConsts.excelData);
		Workbook workbook = WorkbookFactory.create(fis);
		String cell = workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return cell;
	}

	
}