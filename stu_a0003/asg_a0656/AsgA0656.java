public class AsgA0656{
	public static int fill_array(int n)
	{
		int[] a=new int[n];
		for(int i=1;i<n;i++)
		{
			a[i]=i*3;
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]%5==0){
				a[i]=-1;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + "  ");
		}

		return(0);

	}

}
