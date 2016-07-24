public  class AsgA0154{
	public static String rotate_string(String s,int n){
		int a=s.length();
		String s1="";
		String s2="";
		for(int i=0;i<a;i++)
		{
			if(i<n){char d=0;
				for(int j=n-1;j>=0;j--){
					d=s.charAt(i);

				}s1=s1+d;
			}
			else{
				char d=s.charAt(i);
				s2=s2+d;
			}
		}
		return(s2+s1);
	}
}
