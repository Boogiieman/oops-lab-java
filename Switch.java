import java.util.*;  
class Switch
{
	public static void main(String[] args)  
	{
		int a;
		Scanner sc= new Scanner(System.in);//System.in is a standard input stream
		System.out.print("Enter the value of a : ");   
		a= sc.nextInt(); //reads string  
		switch(a)
		{
			case 1:System.out.println("You chose one");
			break;
			case 2:System.out.println("You chose two");
			break;
			case 3:System.out.println("You chose three");
			break;
			case 4:System.out.println("You chose four");
			break;
			case 5:System.out.println("You chose five");
			break;
			default:System.out.println("Invalid Input");
			break;
			
		}
	}
}
