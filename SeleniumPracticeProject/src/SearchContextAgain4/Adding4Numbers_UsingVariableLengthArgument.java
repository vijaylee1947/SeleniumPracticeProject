package SearchContextAgain4;



public class Adding4Numbers_UsingVariableLengthArgument {
	
	public static void add(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(1,2,3,4);
	}

}
