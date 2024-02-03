package ReadingDataFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingSingleDataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/singledata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet("name");
		
		String namedetails=sheet.getRow(0).getCell(0).toString();
		System.out.println(namedetails);
	}

}

