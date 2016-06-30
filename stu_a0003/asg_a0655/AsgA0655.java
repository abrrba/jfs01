public class AsgA0655{
	public static int find_occured_max(int[] a)
	{
		int temp=0,count=1;
		int i=0,no=0,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			
			if(temp<count)
			{
				temp=count;
				no=a[i];
			}	
			
		}

		return(no);
		
	}
}
