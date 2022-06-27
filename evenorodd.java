import java.util.Scanner;
class evenorodd 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the num");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("number is even");
		else
          System.out.println("number is odd");
	}
}
