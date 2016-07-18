class AsgA0652
{
	public static int find_min_max(int[] array)
	{
		int c=array.length;
		int max=array[0];
		int min=array[0];
		for(int i=0;i<c;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
				//return(max);
			}
			if(array[i]<min)
			{
				min=array[i];
			//	return(min);
			}

		}
	System.out.print(min+",");
	System.out.print(max);
	return max;
	}
}
