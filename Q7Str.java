//Count the number of words in a given string sentence.
import java.util.Scanner;
public class Q7Str 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        
        for( int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                count++;
            }
        }
        
        System.out.println("The number of words in given String is : "+count);
    }
}