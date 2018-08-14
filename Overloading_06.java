
public class Overloading_06 {

	void method1 () {
		
		System.out.println("My name is Sadia");
		
	}
	
	void method2 (int a) {
		
		System.out.println("ID No: "+a);
		
	}
	
	String method3 (String b) {
		
		System.out.println(b);
		return b;
	}
	
	public static void main(String[] args) {
		
		Overloading_06 obj = new Overloading_06();
		
		obj.method1 ();
		obj.method2 (17200008);
		obj.method3 ("I am a student");
		
	}

}
