package Cross_Browser_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add {
	
	@Test
	@Parameters({"a","b"})
	public void add(int c,int d) {
		System.out.println(c+d);
	}

}
