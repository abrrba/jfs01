public class AsgA0010{
	public static int reverse_3_digit_int(int no)
	{
		int i=0;
		int j=0;
		int b=100;
		
		if(no/100<=10)
		{
			
			if(no<0){
				no=-(no);	
				while(no>=1)
				{		
					i=no%10;
					j=j+(i*b);
					no=no/10;
					b=b/10;

				}
				return(-j);
			}
			if(no%10==0)
                        {
                              while(no%10!=0)
                              {
                                      no=no/10;
                              }
                        }	
			if(no>0){
				while(no>=1)
				{
					i=no%10;
					j=j+(i*b);
					no=no/10;
					b=b/10;

				}
				return(j);

			}
			else{
			return(0);
			}
		}
		else{
		return(0);
		}
	}
}
