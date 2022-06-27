//Write a program to Reverse a String.
import java.util.Scanner;
public class Q6Str 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String reverse = "";
        
        System.out.println("Enter a String");
        String s = sc.nextLine();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
        
        System.out.println("After reversing String : "+reverse);
    }
}