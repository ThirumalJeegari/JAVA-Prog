import java.io.*;
class Buffer1
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(io);

		System.out.print("Enter ID : ");
		int n =Integer.parseInt(br.readLine());

		System.out.print("Enter Gender(M/F) : ");
		char ch = br.readLine().charAt(0);

		System.out.print("Enter a name : ");
		String str =br.readLine();

		System.out.println("You Entered ID : "+n);
		System.out.println("You Entered Gender : "+ch);
		System.out.println("You Entered Name : "+str);
	}
}

