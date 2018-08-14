
import java.util.Scanner;

public class Factorial_num {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number , fact=1;
		
		System.out.print("Integer number is=");
		number = input.nextInt();
		
		for(int i=1; i<=number ; i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial number is " +fact);
	}

}
