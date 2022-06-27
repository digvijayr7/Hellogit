//Swap two Strings without using a third variable.
import java.util.Scanner;
public class Q3Str 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd string");
        String s2 = sc.nextLine();
        
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("The both String after Swapping");
        System.out.println(s1+s2);
    }
}
