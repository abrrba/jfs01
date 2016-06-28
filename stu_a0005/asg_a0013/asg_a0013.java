class asg_a0013{
	public static void main(String args[])
	{
		String str = "Hello World";
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
	}
}

