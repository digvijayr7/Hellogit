//Java Program to Convert String to Integer Array. 
import java.util.Arrays;
import java.util.Scanner;
public class Q4Str
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       //Input String from user
       System.out.println("Enter a String in numerical form");
       String str = sc.nextLine();
       //
       String[] string = str.replaceAll("\\[", "").replaceAll("]", "").split(",");
       
       int[] arr = new int[string.length];
       
       for(int i=0; i<string.length; i++)
       {
           arr[i] = Integer.valueOf(string[i]);
       }
       
       System.out.println("String is : "+str);
       System.out.print("Integer array is : "+ Arrays.toString(arr));
        System.out.println();
    }
}