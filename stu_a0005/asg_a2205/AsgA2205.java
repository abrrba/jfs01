class AsgA2205{

	public String is_vowel(String str)
	{
		char s = str.charAt(0);
		if(s=='a' || s=='A' || s=='e'|| s=='E'|| s=='i' || s=='I'|| s=='o' || s=='O' || s=='u' || s=='U')
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
