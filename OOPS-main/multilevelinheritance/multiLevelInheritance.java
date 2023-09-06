import java.util.*;
class Person
{
String name,gender,address;
int age;
Person()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter name:");
name=sc.next();
System.out.print("Enter gender:");
gender=sc.next();
System.out.print("Enter address:");
address=sc.next();
System.out.print("Enter age:");
age=sc.nextInt();
}
}
class Employee extends Person
{
String company_name,qualification;
int empid;
double salary;
Employee()
{
Scanner sc1=new Scanner(System.in);
System.out.print("Enter employee id:");
empid=sc1.nextInt();
System.out.print("Enter Company name:");
company_name=sc1.next();
System.out.print("Enter Qualification:");
qualification=sc1.next();
System.out.print("Enter salary:");
salary=sc1.nextDouble();
}
}
class Teacher extends Employee
{
String subject,department;
int teacher_id;
Teacher()
{
Scanner sc2=new Scanner(System.in);
System.out.print("Enter Teacher id:");
teacher_id=sc2.nextInt();
System.out.print("Enter Subject:");
subject=sc2.next();
System.out.print("Enter Department:");
department=sc2.next();
}
void display()
{
System.out.println("________________________________________________________________");
System.out.println("Name :"+name); 
System.out.println("Gender :"+ gender);
System.out.println("Address :"+address);
System.out.println("Age :"+age);
System.out.println("Employee id :"+empid);
System.out.println("Company name :"+company_name);
System.out.println("Qualification :"+qualification);
System.out.println("Salary :"+salary);
System.out.println("Teacher id :"+teacher_id);
System.out.println("Subject :"+subject);
System.out.println("Department :"+department);
System.out.println("________________________________________________________________");
}
}
class multiLevelInheritance
 {
   public static void main(String args[])
    {
      int N,i;
      Scanner sc3=new Scanner(System.in);
      System.out.print("Enter number of employees:");
      N=sc3.nextInt();
      Teacher t[]=new Teacher[N];
      for(i=0;i<N;i++)
       {
        t[i]=new Teacher();
       }
      System.out.println("______________________");
      System.out.println("______________________");
      System.out.println("Details are:");
      System.out.println("______________________");
      for(i=0;i<N;i++)
       {
        t[i].display();
       }
    }
 }
