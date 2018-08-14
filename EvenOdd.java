
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number , reminder;
		
		System.out.print("number=");
		number=input.nextInt();
		
		reminder=number%2;
		
		if(reminder==0) 
			System.out.println("NUMBER IS EVEN");
		
		else
			System.out.println("NUMBER IS ODD");
}
}