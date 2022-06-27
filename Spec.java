import First.Armstrong;
import First.Magic;
import Second.Palindrome;
import Second.Perfect;
import Third.Special;
import Third.Count;

class Spec
{
public static void main(String args[])
	{
		System.out.println("Armstrong Number");
		Armstrong obj = new Armstrong(153);

	
	
	
		System.out.println("Magic Number");
		Magic obj1 = new Magic(1458);
		
	

	
		System.out.println("Palindrome Number");
		Palindrome obj2 = new Palindrome(121);

	

	
		System.out.println("Perfect Number");
	   Perfect obj3 = new Perfect(2,10);

	

	        System.out.println();
		System.out.println("Special Number");
		Special obj4 = new Special(145);

        System.out.println();
		System.out.println("Count Even Odd In Array");
		Count obj5 = new Count(6);

	}
}