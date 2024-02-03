package ReadingDataFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("./TestData/Mutipledata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("names");
		
		int rownum=sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rownum;i++) {
			String data=sheet.getRow(i).getCell(0).toString();
			System.out.println(data);
		}
	}

}
