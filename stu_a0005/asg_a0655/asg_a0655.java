class asg_a0655{
	public static void main(String args[])
	{
		int[] a = {45,3,67,3,68,3,4,3};
		int count = 0;
		int curr_cnt = 1;
		int num = 0;
		int key = 0;

		for(int i=0; i <a.length-1; i++)
		{

			for(int j =i+1; j <a.length; j++)
			{
				if(a[i] == a[j] ) 
				{
					curr_cnt++;
				}
			}
			if(count < curr_cnt)
			{
				count = curr_cnt;

				num = a[i];
			}

		}

		System.out.println("The maximun occuring element is "+num);
	}

}

