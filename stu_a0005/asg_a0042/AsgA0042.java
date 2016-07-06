class AsgA0042{
	public static int rotate_num(int num,int n)
	{

  		  int count=0;
                  while(num>0)
		  {
                            num=num/10;
                            count=count+1;
                    } 
                          int c = count;		    
		    
		    return(c);
		    
		    /*
	                  int c = count;
			  
			  int d = c-n;

			  int p = num%(10^(d-1));
			  int q = p*(10^d);

			  int r = num/(10^(d-1));
			    
			  int s = (q+r);
			  return(s);

	  */
				
	}
}
