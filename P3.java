package PATTERN;
public class P3
{
public P3()
{
int i,j,n=7,k;
    for(i=1;i<=n;i++)
    {  
        
          for(k=1;k<=n-i;k++)
        
            System.out.print(" ");
        
       
           for(j=1;j<=(2*i)-1;j++)
             System.out.print("*");
             System.out.println();
             
            
    }  
          for(i=n;i>=1;i--)
     {
             
         for(k=1;k<=n-i;k++)
             System.out.print(" ");
             for(j=1;j<=(2*i)-1;j++)
             System.out.print("*");
         System.out.println();
         
          
      } 



}
}