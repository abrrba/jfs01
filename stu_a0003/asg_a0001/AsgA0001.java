public class AsgA0001{
	public static String alter_case_1(String s){
		int a=s.length();
		String s1="";
		for(int i=0;i<=a-1;i++)
		{
			if(i%2==0){
				char c=s.charAt(i);
				s1=s1+Character.toUpperCase(c);
			}
			else{
				char b=s.charAt(i);
				s1=s1+Character.toLowerCase(b);
			}
		}return(s1);
	}
}
