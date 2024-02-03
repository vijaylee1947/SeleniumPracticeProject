package Cross_Browser_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sub {
	
	@Test
	@Parameters({"a","b"})
	public void substract(int c,int d) {
		System.out.println(c-d);
	}

}
