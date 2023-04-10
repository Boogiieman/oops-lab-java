import java.util.*;
class Person
{
	
	String name,gender,address;
	int age;
	Person()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Person name:");
		name=sc2.next();
		System.out.println("Enter person gender:");
		gender=sc2.next();
		System.out.println("Enter employee Address:");
		address=sc2.next();
		System.out.println("Enter Person age:");
		age=sc2.nextInt();
	}
}
class Employee extends Person
{
	String company_name, qualification;
	int empid;
	double salary;
	Employee()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter emp_id number:");
		empid=sc3.nextInt();
		System.out.println("Enter company name:");
		company_name=sc3.next();
		System.out.println("Enter qualification:");
		qualification=sc3.next();
		System.out.println("Enter salary:");
		salary=sc3.nextDouble();
		
	}
}
class Teacher extends Employee
{
	String subject,department;
	int teacher_id;
	Teacher()
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter teacher id number:");
		teacher_id=sc3.nextInt();
		System.out.println("Enter subject name:");
		subject=sc3.next();
		System.out.println("Enter Department:");
		department=sc3.next();
		
	}
	
	void display()
	{
	System.out.println("____________________________");
	System.out.println("Name:"+name);
	System.out.println("Gender:"+gender);
	System.out.println("address"+address);
	System.out.println("age:"+age);
	System.out.println("Company Name:"+company_name);
	System.out.println("Employee Id"+empid);
	System.out.println("Qualification:"+qualification);
	System.out.println("Salary:"+salary);
	System.out.println("Subject:"+subject);
	System.out.println("Department:"+department);
	System.out.println("Teacher Id:"+teacher_id);
	System.out.println("____________________________");
	}
}
class multilevelInheritance
{
	public static void main(String args[])
	{
	int n;
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter number of Persons:");
	n=sc1.nextInt();
	Teacher t[]=new Teacher[n];
	for(int i=0;i<n;i++)
	{
		t[i]=new Teacher();
	}
	System.out.println("____________________________");
	System.out.println("____________________________");
	System.out.println("The deatils are:");
	System.out.println("____________________________:");
	for(int i=0;i<n;i++)
	{
		t[i].display();
	}
}
}	
