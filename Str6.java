//Write a program find the occurance of vowels in string. 
class   VowOcc
{  
    void F(String s)
    {
         int count = 0;
		 int a=0,e=0,i=0,o=0,u=0;
           for (int j=0 ; j<s.length(); j++){
             
                char ch = s.charAt(j);  
              if(ch=='a' || ch=='A')
            {a++;}
     else if(ch=='E' ||ch=='e' )
            {e++;}
     else if(ch=='i'||ch=='I')
             {i++;}
      else if( ch=='O' ||ch=='o' )
             {o++;}
     else if(ch=='u' ||ch=='U')
             {u++;} 
            }  
        
        System.out.println("Occurance of 'a' in string is : "+a);
		System.out.println("Occurance of 'e' in string is : "+e);
		System.out.println("Occurance of 'i' in string is : "+i);
		System.out.println("Occurance of 'o' in string is : "+o);
		System.out.println("Occurance of 'u' in string is : "+u);

    }
}


public class Str6
{
    public static void main(String[] args) 
    {
         String s="YoYoHoneySingh";
      VowOcc obj = new  VowOcc();
        obj.F(s);
    }
    
}
