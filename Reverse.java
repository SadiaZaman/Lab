
public class Reverse {

	public static void main(String[] args) {
		
		int num=96385 , sum=0 ,reminder , temp ;
		
		temp =num;
		
		while(temp!=0) {
			reminder =temp % 10;
			sum= sum*10+reminder;
			temp= temp/10;
		
		}
		
		System.out.println("Reverse num is="+sum);
		
		
	}

}
