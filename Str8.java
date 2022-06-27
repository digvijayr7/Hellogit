//Write a program to check password is strong or not
class Pswd
{  
    void H(String s)
    {
		int length=0,l=0,u=0,lw=0,d=0,n=0;
		if (s.length()>=8 && s.length()<=15)
    {
        l=1;
    }

      for (int i=0 ; i<s.length(); i++)
	{
          char ch = s.charAt(i);  
		   if (ch>='A' && ch<='Z')
        {
            u=1;
        }
        else if (ch>='a' && ch<='z')
        {
            lw=1;
        }
        else if (ch>='0' && ch<='9')
        {
            d=1;
        }
        else if (ch>=32 && ch<=47||ch>=58 && ch<=64||ch>=91 && ch<=96||ch>=123 && ch<=126)
        {
            n=1;
        }
    }
    
    if (l==1 && u==1 && lw==1 && d==1 && n==1)
    {
     System.out.println("Password is valid");
    }
    else
    {
        System.out.println("Password is not valid");
    }
	}
}
     
public class Str8
{
    public static void main(String[] args) 
    {
         String s="Aniket@1234d7";
      Pswd obj = new Pswd();
        obj.H(s);
    }
    
}

