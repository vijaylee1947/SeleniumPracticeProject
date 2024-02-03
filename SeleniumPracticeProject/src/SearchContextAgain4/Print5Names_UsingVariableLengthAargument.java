package SearchContextAgain4;

public class Print5Names_UsingVariableLengthAargument {
	
	public static void print(String...name) {
		
			for(int i=0;i<name.length;i++) {
				
				System.out.println(name[i]);
				
			}
			
	}
	
	public static void main(String[] args) {
		
		print("vijay","sujay","rishi","rita","siri");
	}

}
