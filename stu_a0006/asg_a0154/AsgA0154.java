class AsgA0154
{
	public static String rotate_string(String s1)
	{
	String t="";
		int len = s1.length();
		String st=s1.substring(0,len-1);
		String st1= s1.substring(len-1);
		t=t+(st1+st);
              return(t);
	} 

}
