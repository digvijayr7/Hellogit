//area of circle
import java.util.Scanner;
class areaofcircle 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter radius :");

	double r= sc.nextDouble();
	double area=3.14*r*r;
	System.out.println("AREA OF CIRCLE :" +area);
	}
}
