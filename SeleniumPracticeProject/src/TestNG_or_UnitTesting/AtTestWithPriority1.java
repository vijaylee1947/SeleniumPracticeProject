package TestNG_or_UnitTesting;

import org.testng.annotations.Test;

public class AtTestWithPriority1 {
	@Test(priority=2)
	public void hero() {
		System.out.println("i am hero");
	}
	
	@Test(priority=1)
	public void Yamaha() {
		System.out.println("i am yamaha");
	}
	
	@Test(priority=3)
	public void kawasaki() {
		System.out.println("i am kawasaki");
	}

}
