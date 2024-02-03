package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningdataProvider {
	
	@DataProvider
	public String[][] data(){
		
		String[][] data= {{"vijay","TYP250"},{"pradeep","TYP350"}};
		return data;
	}
	
	@Test(dataProvider = "data")
	public void displaydat(String[] cred) {
		System.out.println(cred[0]);
		System.out.println(cred[1]);
	}

}
