package First;
public class Magic
{
 public Magic (int n)
{
	 int sum=0,r=0,i,r2=0,sum2=0,r3=0,sum3=0;
for(i=1;i<=n;i++)
{
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
}
while(sum>0)
    {
        r2=sum%10;
        sum2=sum2+r;
        sum=sum/10;
    }
     while(sum2>0)
    {
        r3=sum2%10;
        sum3=sum3+r;
        sum2=sum2/10;
    }
    if(sum3==1)
    {System.out.println("entered number is magic number ");}
    else
    {System.out.println("entered number is not magic number ");}
}
}
