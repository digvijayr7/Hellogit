//Write a program to count no of digits in the string
class CountDig
{  
    void C(String s)
    {
         int count = 0;
           for (int i=0 ; i<s.length(); i++){
         char ch = s.charAt(i);
         if(ch=='0' || ch=='1' || ch=='2' || ch=='3' ||
     ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' ||
     ch=='9')
			 {			 
                count++;
              }
        }
        System.out.println("Number of digits in the given string is : "+count);
    }
}

public class Str3
{
    public static void main(String[] args) 
    {
         String s="aniket1234d";
      CountDig obj = new CountDig();
        obj.C(s);
    }
    
}