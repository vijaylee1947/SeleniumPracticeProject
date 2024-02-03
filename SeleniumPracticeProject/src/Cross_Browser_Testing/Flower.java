package Cross_Browser_Testing;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flower {
	
	@Test
	public void flower(@Optional("Lilly") String flower) {
		System.out.println(flower);
	}

}
