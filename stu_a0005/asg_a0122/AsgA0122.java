class AsgA0122{
	public static double is_profit(double sp, double cp){
		if(sp>cp)
		{
			return(1);
		}
		else if(sp==cp)
		{
			return(0);
		}
		else
		{
			return(-1);
		}
	}
}
