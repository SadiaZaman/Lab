
public class EquationCylinder {

public static void main(String[] args) {
		
		double radius= 30.2 , height= 10 ;
		//int area=0 , volume=0 ;
		
		int area=   (int) (2 * 3.14 * (radius*radius) + height * (2 * 3.14 * radius)) ;
		int volume= (int) (3.14 * (radius*radius) * height) ;
		
		System.out.println("Cylinder area=" +area+ "\nCylinder volume=" +volume);
		

	}
}
