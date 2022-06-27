//Read two String from user and check if first string contains secoand string.
import java.util.Scanner;
public class Q1Str 
{
    public static void Check(String s1, String s2)
    {
        boolean result = s1.contains(s2);
        if(result)
        {
            System.out.println("2nd String Present in 1st String");
        }
        else
        {
            System.out.println("2nd String Not Present in 1st String");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();
        Check(s1,s2);    }    
}