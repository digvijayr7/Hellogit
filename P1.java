package PATTERN;
public class P1
{public P1()
    {     int i,j,n=5,k;
      
       for(i=1;i<=n;i++)
      {  
        
          for(k=1;k<=n-i;k++)
        
          {  
          System.out.print(" ");
          }
       
           for(j=i;j>=1;j--)
            {
              System.out.print(+j);
            }
             
            
    
             
             for(k=2;k<=i;k++)
             {
               System.out.print(+k);
             }
          System.out.println();
         
	 }
    }
}


  