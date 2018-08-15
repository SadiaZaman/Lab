

public class ThisKeyword {
	
	void method(int variable) {
	    
	    System.out.println("Value of variable :" + variable);
	  }
	
	  void method() {
		  
	    int variable = 40;
	    System.out.println("Value of variable :" + variable);
	  }
	
		  
		  public static void main(String args[]) {
			  
			  ThisKeyword obj = new ThisKeyword();
			  
		    obj.method(20);
		    obj.method();
		  }
		
}
