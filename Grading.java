
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mark;
		
		System.out.print("Enter the mark=");
		mark=input.nextInt();
		
		if(mark>=80)
			System.out.println("Student got A+");
		
		else if(mark>=70)
			System.out.println("Student got A");
		
		else if(mark>=60)
			System.out.println("Student got B+");
		
		else if(mark>=50)
			System.out.println("Student got B");
		
		else if(mark>=40)
			System.out.println("Student got C");
	
		else
			System.out.println("Student got F");
	}

}
