class Complement
{
	public static void main(String[] args)
	{
		int x=10;
		int y=11;
		System.out.println("~x = "+ ~x);
		System.out.println("x & y = "+ (x&y));
		System.out.println("x | y = "+ (x|y));
		System.out.println("x ^ y = "+ (x^y));
		System.out.println("x << 2 = "+ (x<<2));
		System.out.println("x >> 2 = "+ (x>>2));
		System.out.println("x >>> 2 = "+ (x>>>2));
	}	
}