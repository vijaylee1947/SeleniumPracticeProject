package TestNG_or_UnitTesting;


import org.testng.annotations.Test;

public class AtTestWith_enabled_attribute {
	
	@Test(enabled = false)
	public void demo() {
		System.out.println(" hell0,how are you");
	}
	
	@Test(enabled = true)
	public void sample() {
		System.out.println("thank you");
	}
	
	@Test
	public void example() {
		System.out.println(" i am good");
	}

}
