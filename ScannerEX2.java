import java.util.Scanner;

class ScannerEX2
{
	public static void main(String args[])
	{
		System.out.print("Enter the ID Name Salary : ");
		Scanner sc = new Scanner(System.in);

		int ID =sc.nextInt();
		String Name = sc.next();
		float Salary =sc.nextFloat();

		System.out.println("ID = "+ID);
		System.out.println("Name = "+Name);
		System.out.println("Salary = "+Salary);
		
	}
}