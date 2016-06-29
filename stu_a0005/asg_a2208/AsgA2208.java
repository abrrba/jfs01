class AsgA2208{
	public String myreverse(String str)
	{
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			char p = str.charAt(i);
			System.out.print(p);
		}

		return(str);
	}
}
