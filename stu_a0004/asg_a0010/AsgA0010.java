class AsgA0010{
	public int reverse_3_digit_int(int num)
	{
		int x;
		int t=100;
		if(num==0)
		{
			System.out.print(0);
		}
		else
		{
			if((num%10)==0)
			{
				while((num%10)==0)
				{
					num=num/10;
				}
				while(num>0)
				{
					int y=num%10;
					System.out.print(y);
					num=num/10;
					continue; 
				}
			}
			else
			{
				if(num<0)
				{
					num=num*(-1);	
					System.out.print("-");
					while(num>0)
					{
						x=num%10;
						System.out.print(x);
						num=num/10;
					}
				}
				else
				{
						while(num>0)
						{
							x=num%10;
							System.out.print(x);
							num=num/10;	
						}
						

				}
					
				}
			}
return(0);
}

}
