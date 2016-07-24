class AsgA0890{
	public static int find_ugly(int nth){
		int i = 0;
		//int count = 0;
		while(count == nth){
			if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
				count++;
			}
			i++;
		}
		System.out.println(i);
		return 0;
	}
}
