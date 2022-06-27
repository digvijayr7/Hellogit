//Write a program to find the occurance of enter charachter in string. 
class CharOcc
{  
    void D(String s)
    {
         int count = 0;
           for (int i=0 ; i<s.length(); i++){
             
                char ch = s.charAt(i);  
				char ech='a';
                if(ch==ech )  
                    count++;  
            }  
        
        System.out.println(" Occurance of enter charachter in string : "+count);
    }
}


public class Str5
{
    public static void main(String[] args) 
    {
         String s="Khatrnaak";
    CharOcc obj = new  CharOcc();
        obj.D(s);
    }
    
}