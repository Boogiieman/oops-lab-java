import java.util.*;
class Employee
{
int empid;
String name;
double salary;
String address;
Employee()
{
Scanner sc2=new Scanner(System.in);
System.out.println("Enter employee id:");
empid=sc2.nextInt();
System.out.println("Enter employee name:");
name=sc2.next();
System.out.println("Enter employee salary:");
salary=sc2.nextDouble();
System.out.println("Enter employee address:");
address=sc2.next();
}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher()
{
Scanner sc3=new Scanner(System.in);
System.out.println("Enter department:");
department=sc3.next();
System.out.println("Enter subject:");
subject=sc3.next();
}
void display()
{
System.out.println("_______________");
System.out.println("ID:"+empid);
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("Address:"+address);
System.out.println("Department:"+department);
System.out.println("Subject:"+subject);
System.out.println("_______________");
}
}
class multilevelInheritance
{
public static void main(String args[])
{
int n,i;
Scanner sc1=new Scanner(System.in);
System.out.println("Enter number of employees:");
n=sc1.nextInt();
Teacher t[]=new Teacher[n];
for(i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println("_______________");
System.out.println("_______________");
System.out.println("The details are:...........");
System.out.println("_______________");
for(i=0;i<n;i++)
{
t[i].display();
}
}
}
