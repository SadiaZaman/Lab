
import java.util.Scanner; 
public class Compare {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int number;
		
		System.out.print("Number=");
		number=input.nextInt();
		
		if(number>0)
			System.out.println("Number is possitive");
		
		else if(number<0)
			System.out.println("Number is Negative");
		
		else
			System.out.println("Number is Zero");
	}

}
