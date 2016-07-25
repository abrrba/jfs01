class AsgA0920{
	public static int convert_number_to_array(int num){

		int i = 0;
		int [] arr = {};
		while(num > 0)
		{
			arr[i] = num % 10;
			num = num / 10;
			i++;
		}//while(num != 0);
		return arr[i];


}


}
