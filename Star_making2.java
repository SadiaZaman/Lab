
public class Star_making2 {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.print("\n");
			for(int j=1 ; j<=5 ; j++)
			{
				
				if(j<=6-i)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			
		}
			
	}

}
