class AsgA2209{
	public String is_palindrome(String str)
	{      
		int len = str.length();
		String str1 = new String();
		for(int j=len-1;j>=0;j--)
		{
			str1 = str1 + str.charAt(j);

		}      

		if(str.equals(str1))
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		return(str);

	}
}
