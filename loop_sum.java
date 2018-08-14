
import java.util.Scanner;
public class loop_sum {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number, sum=0;
		
		System.out.print("Number is=");
		number = input.nextInt();
		
		for(int i=1; i<=number; i++) 
			sum=sum+i;
			
			System.out.println("Sum is "+ sum);
		
		
	}

}
