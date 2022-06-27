//Write a program to count no of consonent in the string
class CountCon
{  
    void B(String s)
    {
         int count = 0;
           for (int i=0 ; i<s.length(); i++){
         char ch = s.charAt(i);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.print("");
         }else if(ch != ' '){
            count++;
         }
      }
      System.out.println("Number of consonants in the given sentence is "+count);
   }
}

public class Str2
{
    public static void main(String[] args) 
    {
         String s="aniket";
      CountCon obj = new CountCon();
        obj.B(s);
    }
    
}
