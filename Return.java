class Return
{
	// Returning a value using return statement
	int add(int x,int y){
		int sum = 0;
		sum =x+y;
		return sum;
	}
	public static void main(String args[])
	{
		Return obj = new Return();
		int Result = obj.add(10,20);
		System.out.println("Result= "+ Result); 	
	}
}