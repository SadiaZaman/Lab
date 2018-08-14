import java.util.Scanner;

public class Loop_series2 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int number, sum=0;
		
		System.out.print("Number is=");
		number = input.nextInt();
		
		for(int i=3; i<=number; i=i+3) 
			sum=sum+i;
	
			System.out.println("Sum is "+ sum);

	}

}
