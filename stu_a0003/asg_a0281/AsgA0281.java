class AsgA0281{
	public static void main (String argv[])
	{
		for(int i=1;i<10;i++)
		{
			for(int j=i;j<6;j++)
			{
				System.out.print(" ");
			}
			if(i<6){
				for(int k=1;k<(i*2);k++)
				{
					System.out.print("*");
				}
			}
			if(i>=6){
				for(int l=i;l>4;l--)
				{
					System.out.print(" ");
				}
				for(int m=18;m>=(2*i);m--)
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
