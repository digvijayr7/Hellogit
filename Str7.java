//Write a program find the email id is valid or not
class Email
{  
    void G(String s)
    {
		 int x=0,y=0,z=0;
      for (int i=0 ; i<s.length(); i++)
	{
          char ch = s.charAt(i);  
              
        if(ch>='a'&& ch<='z')
        {x++;}
        if(ch>='0'&& ch<='9')
        {y++;} 
        if(ch=='@'||ch=='.')
        {z=1;}
    }
  if(x!=0 &&y!=0 &&z==1)
  {
     System.out.println("entered email id is valid");
  }
  else
  {
      System.out.println("entered mail is not valid");
  }
}
}

public class Str7
{
    public static void main(String[] args) 
    {
         String s="aniket79";
      Email obj = new Email();
        obj.G(s);
    }
    
}

