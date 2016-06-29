class AsgA0655{
	public static int find_occured_max(int[] a)
	{
		int count = 0;
		int curr_cnt = 1;
		int num = 0;
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
		return(0);
	}


}

