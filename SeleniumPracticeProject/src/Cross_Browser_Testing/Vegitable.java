package Cross_Browser_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegitable {
	
	@Test
	@Parameters("vegitable")
	public void vegitable(String vegitable) {
		System.out.println(vegitable);
	}

}
