


	import java.util.Scanner;

	public class LeapYear {

		private static Scanner kb;

		public static void main(String[] args) {
		

			int year;
			
			kb = new Scanner(System.in);
			
			System.out.println("Enter the year which you want to check is a leap year or not");
			
			year= kb.nextInt();
			
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
				
				System.out.println("Year " +year+ " is a Leap Year");
			
			else
				
				System.out.println("Year " +year+ " is not a Leap Year");
		}

	}

