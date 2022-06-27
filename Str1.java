//Write a program to count no of vowel in the string
import java.util.Scanner;
class Countvo
{
    void A(String s)
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels in the given string is : "+count);
    }
}

public class Str1
{
    public static void main(String[] args) 
    {
		String s="aniket";
        Countvo obj = new Countvo();
        obj.A(s);
    }
    
}