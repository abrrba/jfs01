public class AsgA0126{  
	public static boolean is_prime(int no){  
		int i,j=0,k=0;      
		j=no/2;    

		for(i=2;i<=j;i++){    
			if(no%i==0){    
				System.out.println("0");    
				k=1;    
				break;    
			}    
		}    
		if(k==0)    
			System.out.println("1");
		return(true); 
	}  
}  
