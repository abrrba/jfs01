class AsgA0042
{
	public static int rotate_n(int num,int rotby)
	{ 
		if(num>=0)
		{
			int suffix;
			int prefix;
			int count=(int)Math.log10(num+1);
			int suflen=count-rotby;
			int res=(int)Math.pow(10,suflen+1);
			suffix=num%res;
			int res1=(int)Math.pow(10,rotby);
			suffix = suffix * (res1); 
			int res2=(int)Math.pow(10,suflen+1);
			prefix = num / (res2); 
			return(suffix+prefix);
		}
		else
		{
			num=num*-1;
			int suffix;
			int prefix;
			int count=(int)Math.log10(num+1);
			int suflen=count-rotby;
			int res=(int)Math.pow(10,suflen+1);
			suffix=num%res;
			int res1=(int)Math.pow(10,rotby);
			suffix = suffix * (res1);
			int res2=(int)Math.pow(10,suflen+1);
			prefix = num / (res2);
			return(suffix+prefix);



		}
	}

}
//not solved by my logic :( Refered rishi sir's logic
