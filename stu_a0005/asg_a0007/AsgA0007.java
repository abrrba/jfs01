class AsgA0007{
	public String find_uppercase(String str)
	{
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			char d = str.charAt(i);
			if(Character.isUpperCase(d))
			{
				char p = Character.toUpperCase(d);
				result = result + p;
			}
		}
		return(result);
	}
}

