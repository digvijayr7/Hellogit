package Third;
public class Count
{
int a[]={1,2,5,6,3,2};
int even=0;
int odd=0;
System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println(a[i]);  
}  
}  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0)
	even++;
else
	odd++;
}  
System.out.println("even of elements in array are : "+even);  
System.out.println("even of elements in array are : "+odd);  
}  



