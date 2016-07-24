class AsgA0654{
	public static int find_median_array(int [] array){
		int p = array.length;
		int q = p / 2;
		if(p == 0){
		return 0;
		
		}
		else if( p % 2 == 1){
			return array[q];
		}
		else{
			int r = (array[q] + array[q-1]) / 2;
			return r;
		}
	}
}
