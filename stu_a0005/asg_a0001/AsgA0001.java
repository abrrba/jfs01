class AsgA0001{
	public String alter_case(String str){
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{ 
			if(i%2 == 0)
			{
				char p = str.charAt(i);
				System.out.print(Character.toUpperCase(p));
			}
			else
			{
				char q = str.charAt(i);

 	 			System.out.print(Character.toLowerCase(q));
   
			}
		}
		return(str);
	}
}

