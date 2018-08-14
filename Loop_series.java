import java.util.Scanner;

public class Loop_series {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		int number, sum=0;
		
		System.out.print("Number is=");
		number = input.nextInt();
		
		for(int i=2; i<=number; i=i+2) 
			sum=sum+i;
			
			System.out.println("Sum is "+ sum);

	}
}

