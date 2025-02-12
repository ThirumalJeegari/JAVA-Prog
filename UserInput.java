import java.util.*;
class UserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name = ");
		String Name = sc.next();

		System.out.print("Enter Age = ");
		int Age = sc.nextInt();

		System.out.print("Enter Salary = ");
		float Salary = sc.nextFloat();

		System.out.println("You Entered Name = "+Name);
		System.out.println("You Entered Age = "+Age);
		System.out.println("You Entered Salary = "+Salary);

		sc.close();

	}
}
