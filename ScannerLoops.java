import java.util.Scanner;
class ScannerLoops
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements:");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i =1;i<=n;i++)
		{
			System.out.print("Enter number "+i+":");
			int num = sc.nextInt();
			sum += num;
			
		}

        	System.out.println("Total sum: " + sum);
		sc.close();

		
	}
}