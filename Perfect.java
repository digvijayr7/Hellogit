package Third;
public class Perfect
{
 public Perfect (int mn ,int mx)
{
	 int n,i,sum;
 System.out.println("The Perfect numbers within the given range : ");
  for(n=mn;n<=mx;n++){
    i=1;
    sum = 0;
    while(i<n)
    {
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
    System.out.println(n);
  }
     System.out.println();
}
}
