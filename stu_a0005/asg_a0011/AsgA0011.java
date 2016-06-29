class AsgA0011{
	public static int sum_of_digit(int num)
	{
		int sum1=0;
		int x=0;
		int sum=0;
		while(num>0 || num<0)
		{
			x=num%10;
			sum=sum+x;
			num=num/10;
		}
		if(sum<0)
		{
			sum1=sum*-1;
			return(sum1);
		}
		else
		{
			return(sum);
		}

	}
}
