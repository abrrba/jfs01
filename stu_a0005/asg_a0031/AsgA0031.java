class AsgA0031{
	public static double calculate_gross_salary(double bs, double da, double hr)
	{
		double d=(bs*da)/100;
		double x=(d+bs+hr);
		if (bs<0){
			return(0);
		}
		else
		{
			return(x);
		}
	}
}
