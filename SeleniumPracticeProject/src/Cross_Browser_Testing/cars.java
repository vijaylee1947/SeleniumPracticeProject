package Cross_Browser_Testing;


import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class cars {
	
	@Test

	public void car(@Optional("AstonMartin") String name1) {
		System.out.println(name1);
		
	}

}
