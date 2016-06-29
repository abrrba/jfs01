class AsgA0013{
	public String toggle_case(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char p = str.charAt(i);
			if(Character.isUpperCase(p))
			{
			 	System.out.print(Character.toLowerCase(p));
			}
			else 
			{
				System.out.print(Character.toUpperCase(p));
			}
		}
		return(str);
	}


}

