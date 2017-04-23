public class AsgA0016{
	public static boolean is_consonant(char ch)
	{
		/*
		   if(c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")||c.equalsIgnoreCase("b")c.equalsIgnoreCase("b")c.equalsIgnoreCase("b")c.equalsIgnoreCase("b")c.equalsIgnoreCase("b"))
		 */
		int[] array={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		for(int i=0;i<array.length-1;i++){
			if(ch==array[i]){
				return(true);
			}
			
				
		}return(false);
	
	}		
}
 
