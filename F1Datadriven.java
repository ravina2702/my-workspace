package module5;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class F1Datadriven {
	//data driven framework

	
	public F1Datadriven(String filepath, String sheetname) {
		super();
		this.filepath = filepath;
		this.sheetname = sheetname;
	}
	String filepath;
	String sheetname;
	
	public int rowCount()
	{
		int i =0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetname);
			i = worksheet.getPhysicalNumberOfRows();
			
		} catch (Exception e) {
	
		}
		return i;
	}
	public int colCount()
	{
		int i =0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetname);
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (Exception e) {
	
		}
		return i;
	}
	public String getdata(int row,int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetname);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
		} catch (Exception e) {
			
		}
		return data;
	}
}
