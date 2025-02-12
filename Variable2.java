class Variable2
{
	static int a = 560;
	int b = 567;
	public static void main(String args[])
	{
		int c = 578;
		Variable2 obj = new Variable2();
		System.out.println("Static Variable = "+a);
		System.out.println("Instance Variable = "+obj.b);
		System.out.println("Local Variable = "+c);
		
	}
}