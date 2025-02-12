class ForLoop6
{
	public static void main(String args[])
	{
		for(int x=1;x<=3;x++)
		{
			System.out.print("x = "+x+","+"  ");
			{
				System.out.print("y =");
				for (int y=1;y<=5;y++)
				{
					System.out.print(y);
					if (y < 5) {
						System.out.print(",");
					}
				}
			}
			System.out.println();
		
		}
		

	}
}