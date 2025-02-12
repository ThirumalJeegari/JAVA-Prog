import java.util.*;
import java.lang.Float;

class ScannerEX4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values of String, Int, Float : ");

		String input = sc.nextLine();
		String[] values = input.split(",");

		String s1 =values[0].trim();
		int n = Integer.parseInt(values[1].trim());
		float f =Float.parseFloat(values[2].trim());

		System.out.printf("String = %s%nnum =%d%nhexadecimal = %x%nfloat = %f%n",s1,n,n,f);
	}
}