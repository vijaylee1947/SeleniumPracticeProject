package ReadingDataFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromMultiplrRowAndColumn {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/Multipledat1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("names1");
		
		int rownum=sheet.getPhysicalNumberOfRows();
		int colnum=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<rownum;i++) {
			for(int j=0;j<colnum;j++) {
				String data=sheet.getRow(i).getCell(j).toString();
				System.out.print(" "+data);
			}
			System.out.println();
		}
	}

}
