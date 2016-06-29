class AsgA0004{
	public String find_lowercase(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char d = str.charAt(i);
			if(Character.isLowerCase(d))
			{
				System.out.print(Character.toLowerCase(d));
			} 
		}
		return(str);
	}
}




