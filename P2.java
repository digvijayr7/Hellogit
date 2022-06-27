package PATTERN;
public class P2
{ public P2()
{int n=5, i,k;  //n=5
  System.out.println();
  for (i = 0; i < n; i++)
  {
    for (int c = 1; c < n-i; c++)
    {
      System.out.print("*");
    }
        for (int j = n; j >(n-i); j-- )
        {
            System.out.print(+j);
        }
       for (int k =n-i; k<=n; k++ )
        {
            System.out.print(+k);
        }
           System.out.println();

  }}

}