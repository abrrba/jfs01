class AsgA0004{
	public String find_lowercase(String str)
	{
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			char d = str.charAt(i);
			if(Character.isLowerCase(d))
			{
			  
				 char p = Character.toLowerCase(d);
 				 result = result + p;
			} 
		}
		return(result);
	}
}

