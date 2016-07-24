class AsgA2207{
	public static int mysum(int [] a){
	int total = 0;
	for(int i = 0; i < a.length; i++){
	total = total + a[i];
	}
	System.out.println("The sum is  ");
	return total;
}

	
	public static int mymul(int [] a){
	int mul = 1;
	for(int i = 0; i < a.length; i++){
	mul = mul * a[i];
	}
	System.out.println("The multiplication is  ");
	return mul;
	
	}


}
