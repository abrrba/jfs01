class Asg_a0044{
	public static int is_palindrome_num(int num)
	{
		int num1 = 0;
		int temp = 0;
		int x = num;
		while(num > 0)
		{
			num1 = num%10;
			num = num/10;
			temp = temp*10+num1;
		}
		if(x == temp)
		{
		//	System.out.println(true);
		return true;
		}
		else
		{
			System.out.println(false);
		}
	//	return(0);
}

}

