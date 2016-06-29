class AsgA0007{
	public String find_uppercase(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char d = str.charAt(i);
			if(Character.isUpperCase(d))
			{
				System.out.print(Character.toUpperCase(d));
			}
		}
		return(str);
	}
}

