//Program to Remove a Given Word From a String.
import java.util.Scanner;
class Check01
{
    void Operation()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a word which u want to remove");
        String word = sc.next();
        if(str.contains(word))
        {
            String temp = word + " ";
            str = str.replaceAll(temp,"");
            System.out.println(str);
            
            temp = " " + word;
            str = str.replaceAll(temp,"");
            System.out.println("String after removing word is");
            System.out.println(str);
        }
        else
        {
            System.out.println("Word is not present in given text");
        }
    }
}

public class Q5Str 
{
    public static void main(String[] args) 
    {
        Check01 obj = new Check01();
        obj.Operation();
    }
}