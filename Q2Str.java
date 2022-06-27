// Check the string is palindrome or not.
import java.util.Scanner;
class Check
{
    String Accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        return s;
    }
    void Operation(String s)
    {
        String reverse = "";
        int length = s.length();
        for(int i = (length-1); i>=0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
}

public class Q2Str
{
    public static void main(String[] args) 
    {
        Check obj = new Check();
        String s = obj.Accept();
        obj.Operation(s);
    }
}