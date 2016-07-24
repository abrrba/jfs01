class AsgA0655{
	public static int find_occured_max(int [] a){
		int count = 0;
		int cnt = 1;
		int num = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j]){
					cnt ++;
				}
			}
			if(count < cnt){
				count = cnt;
				 num = a[i];
			}
		}
		return num;
	}
}
