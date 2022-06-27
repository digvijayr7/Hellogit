package Third;
public class Special
{
 public Special (int n2)
{
	 int i, n1,b, sum;
    int fact;
    n1 = n2;

    sum = 0;

    while(n2 > 0)
    {

      
        b = n2 % 10;

        fact = 1;
        for(i=1; i<=b; i++)
        {
            fact = fact * i;
        }

        sum = sum + fact;

        n2 = n2 / 10;
    }
    if(sum == n1)
    {
       System.out.println("special number "+n1);
    }
    else
    {
       System.out.println("Not a special number"+n1);
    }
}
}
