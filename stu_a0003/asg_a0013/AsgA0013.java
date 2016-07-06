public class AsgA0013 {
	public static char toggle_case(String s){
		int a=s.length();
		for(int i=0;i<=a-1;i++)
		{
			char d=s.charAt(i);
			if(Character.isUpperCase(d))
			{
				System.out.print(Character.toLowerCase(d));
			}
			else{
				System.out.print(Character.toUpperCase(d));
			}
		}return(0);
	}

}
