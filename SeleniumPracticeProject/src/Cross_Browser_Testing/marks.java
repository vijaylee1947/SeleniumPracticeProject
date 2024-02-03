package Cross_Browser_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class marks {
	
	@Test
	@Parameters("markes")
	public void markes(String markes) {
		System.out.println(markes);
	}

}
