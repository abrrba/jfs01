class AsgA0001
{
	public static String alter_case_1(String str)
	{	
		String t1="";
		int lim=str.length();
		for(int i=0;i<lim;i++)
		{
			if(i%2==0)
			{
				char s=str.charAt(i);
				t1=t1+Character.toUpperCase(s);
				
				//System.out.print(Character.toUpperCase(s));
			}
			else
			{
				char t=str.charAt(i);
				t1=t1+Character.toLowerCase(t);
				//return t;
				//System.out.print(Character.toLowerCase(t));
				
			}
		
		}
	return t1;
	}
}
