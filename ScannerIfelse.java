import java.util.Scanner;
class ScannerIfelse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Age = ");
		int Age = sc.nextInt();

		if (Age >=18){
			System.out.println("Your age is "+Age+". so, your are eligible to vote!");
		}
		else{
			System.out.println("Your age is "+Age+". so, your are not eligible to vote!");
		}

			
	}
}