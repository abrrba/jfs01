public class AsgA0004{
	public static String find_lowercase(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++){
			char d=s.charAt(i);
			if(Character.isLowerCase(d))
			{
				s1=s1+Character.toLowerCase(d);
			}
		}
		return s1;
	}
}
