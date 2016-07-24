class AsgA0656{
	public static int fill_array(int [] a){
		for(int i = 1; i < a.length; i++){
			a[i] = i * 3;
		}
		for(int i = 1; i < a.length; i++){
			if(a[i] % 5 == 0){
				a[i] = -1;
			}
			System.out.print(a[i]+ " " );

		}
		return 0;
	}
}
