package TestNG_or_UnitTesting;

import org.testng.annotations.Test;

public class AtTestWithSamePriority {
	
	@Test(priority=1)
	public void xray() {
		System.out.println("from xray");
	}

	@Test(priority=1)
	public void cos() {
		System.out.println("from cosic");
	}
	
	@Test(priority=-1)
	public void tan() {
		System.out.println("from tan");
	}
	
	@Test(priority=0)
	public void sign() {
		System.out.println("from sign");
	}
}
