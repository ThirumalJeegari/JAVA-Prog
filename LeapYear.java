import java.io.*;
class LeapYear
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(io);
		
		System.out.print("Enter a Year : ");
		int year = Integer.parseInt(br.readLine());

		if(year%100==0 && year%400==0 )
			System.out.println(year+" is a Leap Year");
		else if(year%100!=0 && year%4==0)
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
		
	}
}