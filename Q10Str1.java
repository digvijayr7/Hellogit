//Check given string contains any digit. 
import java.util.Scanner;
public class Q10Str 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Enter a String :");
        String string = sc.nextLine();
        
        for(int i=0; i<string.length(); i++)
        {
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9' )
            {
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("\nString contains Digit");
        }
        else
        {
            System.out.println("\nString not contains Digit");
        }
    }
}