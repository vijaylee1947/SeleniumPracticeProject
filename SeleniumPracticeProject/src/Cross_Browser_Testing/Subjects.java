package Cross_Browser_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subjects {

	@Test
	@Parameters("subject")
	public void subjects(String subject) {
		System.out.println(subject);
	}
}
