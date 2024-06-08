package Exce_sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Sheet {

	public static void main(String[] args) throws IOException {

		File file= new File("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
		FileInputStream read= new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(read);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		List <Double> total= new ArrayList<Double>();


		int totalRow= sheet.getLastRowNum();
		for(int i=1;i<=totalRow;i++) {
			XSSFRow row=sheet.getRow(i);
			int totalkCell=row.getLastCellNum();

			XSSFCell cell=row.getCell(1);
			switch(cell.getCellType()) {

			case NUMERIC: total.add(cell.getNumericCellValue());

			}
}     
		double n=0.0;
		for(Double num:total) {
			n=n+num;
			 
		}
		System.out.println(n);

}

}
