class AsgA0126{
	public static int is_prime(int num){
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}


		return(0);
	}

}
