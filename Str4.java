//Write a program to count no of words in the string.
class CountWords
{  
    void D(String s)
    {
         int count = 0;
           for (int i=0 ; i<s.length(); i++){
             
                char ch = s.charAt(i);  
                if( ((i>0)&&(ch!=' ')&&(s.charAt(i-1)==' ')) || ((s.charAt(0)!=' ')&&(i==0)) )  
                    count++;  
            }  
        
        System.out.println("Number of Words in the given string is : "+count);
    }
}


public class Str4
{
    public static void main(String[] args) 
    {
         String s="Virat Rohit Rahul";
     CountWords obj = new CountWords();
        obj.D(s);
    }
    
}