class asg_a0656{
	public static void main(String args[])
	{
		int a;
		int intmyList[];
		intmyList = new int[16];
		for(int i=1;i<intmyList.length;i++)

		{
			intmyList[i] = i*3;

		
		}
		for(int i=1; i<intmyList.length; i++)
		{

			a = intmyList[i]%5;
			if(a == 0)
			{

				intmyList[i]=-1;

			}
				System.out.print(intmyList[i]+ " ");

		}


	}
}


