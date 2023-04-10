import java.util.*;
class Person
{
String Name,Gender,Address;
int Age;
Person(String name,String gender,String address,int age)
{
this.Name=name;
this.Gender=gender;
this.Address=address;
this.Age=age;
}
}
class Employee extends Person
{
String Company_name,Qualification;
int Empid;
long Salary;
Employee(String name,String gender,String address,int age,String company_name,String qualification,int empid,long salary)
{
super(name,gender,address,age);
this.Empid=empid;
this.Company_name=company_name;
this.Qualification=qualification;
this.Salary=salary;
}
}
class Teacher extends Employee
{
String Subject,Department;
int Teacher_id;
Teacher(String name,String gender,String address,int age,String company_name,String qualification,int empid,long salary,String subject,String department,int teacher_id) 
{
super(name,gender,address,age,company_name,qualification,empid,salary);
this.Subject=subject;
this.Department=department;
this.Teacher_id=teacher_id;
}
void display()
{
System.out.println("________________________________________________________________");
System.out.println("Name :"+Name); 
System.out.println("Gender :"+ Gender);
System.out.println("Address :"+Address);
System.out.println("Age :"+Age);
System.out.println("Employee id :"+Empid);
System.out.println("Company name :"+Company_name);
System.out.println("Qualification :"+Qualification);
System.out.println("Salary :"+Salary);
System.out.println("Teacher id :"+Teacher_id);
System.out.println("Subject :"+Subject);
System.out.println("Department :"+Department);
System.out.println("________________________________________________________________");
}
}
class multiLevelInheritanceSuper
 {
   public static void main(String args[])
    {
      int N,i;
      Scanner sc3=new Scanner(System.in);
      System.out.print("Enter number of employees:");
      N=sc3.nextInt();
      Teacher t[]=new Teacher[N];
      System.out.println("Enter the teacher details:");
      int x=0,j=0;
      Scanner sc=new Scanner(System.in);
      for(i=0;i<N;i++)
      {
      x=i+1;
      System.out.println(""+x+").");
      System.out.println("Name :");
      String a =sc.next();
      System.out.println("Gender :");
      String b =sc.next();
      System.out.println("Address :");
      String c =sc.next();
      System.out.println("Age :");
      int d =sc.nextInt();
      System.out.println("Employee id :");
      int e =sc.nextInt();
      System.out.println("Company name :");
      String f =sc.next();
      System.out.println("Qualification :");
      String g =sc.next();
      System.out.println("Salary :");
      long h =sc.nextLong();
      System.out.println("Teacher id :");
      int k =sc.nextInt();
      System.out.println("Subject :");
      String l =sc.next();
      System.out.println("Department :");
      String m =sc.next();
      t[i]=new Teacher(a,b,c,d,f,g,e,h,l,m,k);
      }
      sc.close();
      System.out.println("\n *********** Informations of all teachers are***********");
      for(i=0;i<N;i++)
      {
      j=i+1;
      System.out.println("\n"+j+").");
      t[i].display();
      }
      sc3.close();
      
    }
 }
 
