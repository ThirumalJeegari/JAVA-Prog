import java.util.*;
import java.io.*;

class MultipleInputs
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(io);
	
		System.out.print("Enter two numbers (Ex. x,y ): ");

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, ",");
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
			
		s1 = s1.trim();
		s2 = s2.trim();

		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);

		System.out.println("Addition = "+(i1+i2));
		System.out.println("Subtration = "+(i1-i2));
		System.out.println("Multipication = "+(i1*i2));
		System.out.println("Division = "+(i1/i2));
		
		
	}
}