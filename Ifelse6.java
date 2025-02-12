class Ifelse6
{
	public static void main(String args[])
	{
		int a = 100;
		if (a>0)
		    if(a>2)
			if(a>4)
				System.out.println(a+" is > 4");
			else System.out.println(a+" is < 4");
		    else System.out.println(a+" is < 2");
		else System.out.println(a+" is < 0");
	}
}
				