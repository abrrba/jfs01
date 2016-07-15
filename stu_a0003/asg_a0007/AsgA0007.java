public class AsgA0007{
	public static String find_uppercase(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++){
			char d=s.charAt(i);
			if(Character.isUpperCase(d))
			{
				s1=s1+Character.toUpperCase(d);
			}
		}
		return s1;
	}
}
