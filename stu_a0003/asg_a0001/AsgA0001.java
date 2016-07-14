public class AsgA0001{
	public static char alter_case_1(String s){
		int a=s.length();
		for(int i=0;i<=a-1;i++)
		{
			if(i%2==0){
				char c=s.charAt(i);
				System.out.print(Character.toUpperCase(c));
			}
			else{
				char b=s.charAt(i);
				System.out.print(Character.toLowerCase(b));
			}
		}return(0);
	}
}
