package Second;
public class Palindrome
{
 public Palindrome (int n)
{
	 int r,sum=0,a;
    for(a=n;n!=0;n=n/10)
    {
         r=n % 10;                 
         sum=sum*10+r;               
    }
    if(a==sum)
         System.out.println("palindrome number"+a);
    else
         System.out.println("not a palindrome number"+a);

}
}