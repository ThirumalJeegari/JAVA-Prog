class Switch3
{
	public static void main(String args[])
	{
		String day = "Monday";
		String result = "";

		result=switch(day)
		{
			case "Sunday","Saturday" ->"5 AM";
			case "Monday" -> "6 AM";
			default -> "7 AM";		
		};
		System.out.println(result);
		
	}
}