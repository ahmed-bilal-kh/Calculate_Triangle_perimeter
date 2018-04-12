import java.util.*;

public class calculatePerimeter {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		double double1;
		double double2;
		double double3;
		double sum1;
		double sum2;
		double sum3;
		double perimeter;

		System.out.print("Enter the three sides of the triangle:");
		 double1 = keyboard.nextDouble( );
		 double2 = keyboard.nextDouble( );
		 double3 = keyboard.nextDouble( );
		 keyboard.nextLine( );
		 
		 sum1 = double1 + double2;
		 sum2 = double1 + double3;
		 sum3 = double2 + double3;
		 perimeter = double1 + double2 + double3;

		if (double1 <= 0 || double2 <= 0 || double3 <= 0)
		{
			System.out.println("This does not form a proper triangle.");
		    System.out.println("All lengths must have a positive value.");
		} 
	    else if (sum1 <= double3)
		{	
	    	System.out.println("This does not form a proper triangle.");
		    System.out.printf("The side with length %3.8f is too large.", double3);
		}    
	    else if (sum2 <= double2)
		{
		    System.out.println("This does not form a proper triangle.");
			System.out.printf("The side with length %3.8f is too large.", double2);
	    }
		else if (sum3 <= double1)
		{	System.out.println("This does not form a proper triangle.");
			System.out.printf("The side with length %3.8f is too large.", double1);
		}
		else if (sum1 > double3 && sum2 > double2 && sum3 > double1)
			System.out.printf("The triangle's perimeter is %3.8f.", perimeter);
	}
}
