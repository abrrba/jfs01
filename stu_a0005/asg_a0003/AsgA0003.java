class AsgA0003{
	public String alter_case(String str){
		
		char arr[] = str.toCharArray();
		{
			char res = str.charAt(0);
			System.out.print(Character.toLowerCase(res));
			String str2 = (str.substring(1));
			for(int i=0;i<str2.length();i++)
			{
				char d = str2.charAt(i);

				if(Character.isUpperCase(d))
				{
					System.out.print(Character.toLowerCase(d));

				}
				else
				{
					System.out.print(Character.toUpperCase(d));
				}
			}
		}

	}
}

