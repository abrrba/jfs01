class AsgA0800{
	public static boolean two_element_sum(int[] arr, int sum){
		for(int i = 0; i < arr.length; i++){
			int p = arr[i];
			for(int j = i+1; j < arr.length; j++ ){
				int q = arr[j];
				if ((p + q) == sum){
					return true;
				}
			}
		}
		return false;
	}
}
