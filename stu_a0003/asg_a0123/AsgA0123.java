public class AsgA0123{
	public static int  my_maximum(int a,int b, int c)
	{

		if(a>b&&a>c)
		{
			return(a);
		}
		if(b>a&&b>c)
		{	
			return(b);
		}
		if(c>a&&c>b)
		{
			return(c);
		}
		return(0);
	}
}

