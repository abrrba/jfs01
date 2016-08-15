public class Ts{
	public static String ts(String s)
	{
		int a=s.length();
		String s1="";
		for(int i=0;i<a;i++)
		{
			char b=s.charAt(i);
			if(Character.isUpperCase(b)){
				s1=s1+Character.toLowerCase(b);
			}
			else
			{
				s1=s1+Character.toUpperCase(b);
			}
		}
		return(s1);
	}
}
