import java.io.*;


class Buffer
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter a Value = ");
		int a =Integer.parseInt(br.readLine());
		System.out.print("Enter str Value = ");
		String str = br.readLine();
		System.out.println("You Entered int a = "+a);
		System.out.println("You Entered string str = "+str);
	}
}
