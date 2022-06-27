//Write a program to find  the smallest and largest word in string

class LarSm
{
	void L(String s)
	{
 String word = "";
	 String small = ""; 
	  String large="";    
      String[] words = new String[100];    
      int length = 0;    
          
      s = s + " ";    
          
      for(int i = 0; i < s.length(); i++)
	  {    
          if(s.charAt(i) != ' ')
		  {    
              word = word + s.charAt(i);    
          }    
          else
		  {    
              words[length] = word;    
              length++;    
              word = "";    
          }    
      }            
      small = large = words[0];    
 
      for(int k = 0; k < length; k++)
	  {    
  
          if(small.length() > words[k].length())    
              small = words[k];    
   
          if(large.length() < words[k].length())    
              large = words[k];    
      }    
      System.out.println("Smallest word: " + small);    
      System.out.println("Largest word: " + large);    
	}
}

public class Q8Str
   {
  public static void main(String[] args)
  {     
      String s = "Hello My Name is Aniket"; 
	   LarSm obj= new LarSm ();
	   obj.L(s);
  }  
   }  