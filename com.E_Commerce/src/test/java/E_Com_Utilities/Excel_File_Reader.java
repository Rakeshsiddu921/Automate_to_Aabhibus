package E_Com_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.DataFormatException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_File_Reader extends DataProvider_Example {
	public FileInputStream input;
	public XSSFWorkbook workbook;
	DataProvider_Example data= new DataProvider_Example();
	
	@Test(dataProvider = "TestData")
	public void fileread(String[][] testdata)   {
		File file= new File("C:\\Users\\Admin\\eclipse-workspace\\com.E_Commerce\\TestData\\TestData.xlsx");
		
		
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			workbook = new XSSFWorkbook(input);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		XSSFSheet sheetAt = workbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		for(int i=1;i<=lastRowNum;i++) {
			XSSFRow row = sheetAt.getRow(i);
			short lastCellNum = row.getLastCellNum();
			
			for(int j=0;j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dfe=new DataFormatter();
				
				String formatCellValue = dfe.formatCellValue(cell);
				
				testdata[i-1][j]=formatCellValue;
				
				//System.out.println(formatCellValue);
				
			}
			
		}
		
	}
	
	
		
}