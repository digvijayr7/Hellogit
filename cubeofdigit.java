import java.util.Scanner;
class cubeofdigit
{
	public static void main(String[] args) 
	{
		Scanner l=new Scanner(System.in);
		System.out.println("enter the num");
		int a=l.nextInt();
		
		
			
int b=a%10;
    a=a/10;
int d=a%10;
int k=a/10;

		


		System.out.println(+b*+b*+b);
		
		System.out.println(+d*+d*+d);
		
		System.out.println(+k*+k*+k);
	}
}
