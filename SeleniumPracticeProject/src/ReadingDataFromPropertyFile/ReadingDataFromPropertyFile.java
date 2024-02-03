package ReadingDataFromPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./testdata/DemoWebShopLogin.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String dk=(String)prop.get("driverkey");
		System.out.println(dk);
		
		String dp=(String)prop.get("driverpath");
		System.out.println(dp);
		
		String url=(String)prop.get("url");
		System.out.println(url);
		
		String un=(String)prop.get("UN");
		System.out.println(un);
		
		String pswd=(String)prop.get("PSWD");
		System.out.println(pswd);
	}

	
	
}
