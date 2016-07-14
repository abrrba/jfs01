public class AsgA0003{
	public static String alter_case_2(String s)
	{	int a=s.length();
		String s1="";
		for(int i=0;i<=a-1;i++)
		{
			char d=s.charAt(i);
			if(Character.isUpperCase(d))
			{
				s1=s1+Character.toLowerCase(d);
			}
			else
			{
				s1=s1+Character.toUpperCase(d);
			}
		}return(s1);
	}
}
