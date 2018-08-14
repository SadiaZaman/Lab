
import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number1 , number2 , number3;
		
		System.out.print("First number is=");
		number1 = input.nextInt();
		
		System.out.print("Second number is=");
		number2 = input.nextInt();
		
		System.out.print("Third number is=");
		number3 = input.nextInt();
		
		if((number1>number2)&&(number1>number3))
			
			System.out.println("First Number is Largest");
		
		else if(number2>number3)
			
			System.out.println("Second Number is Largest");
		
		else
			
			System.out.println("Third Number is Largest");
		
        if((number1<number2)&&(number1<number3))
			
			System.out.println("First Number is Smallest");
		
		else if(number2<number3)
			
			System.out.println("Second Number is Smallest");
		
		else
			
			System.out.println("Third Number is Smallest");

	}

}
