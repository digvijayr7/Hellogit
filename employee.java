class Employeeinfo
{
double salary=50000,empid=01,age=25;

void Empsalary()
	{
		double increment=0;
		increment=salary*(.10);
		salary=salary+increment;
		System.out.println("incremented salary is"+salary);
     }
void Display()
	{
		System.out.println("id="+empid);
		System.out.println("salary="+salary);
		System.out.println("age="+age);
	}
}



class employee
{
	public static void main(String[] args) 
	{
		Employeeinfo obj=new Employeeinfo();
		obj.Empsalary();
		obj.Display();
		
	}
}
