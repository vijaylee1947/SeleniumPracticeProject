package Locaters;

public class ToPrintNames5TimesUsingVariableLengthArgument {

	public static void name(String...a) {
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
	}
	public static void main(String[] args) {
		
		name("nikki","boby","maggi","rita","jimmy");
	}
}
