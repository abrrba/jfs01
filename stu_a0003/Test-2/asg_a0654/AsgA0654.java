public class AsgA0654{
	public static double find_median(int[] arr)
	{
		int mid = (arr.length)/2;
		double i=0,j=0;
		if((arr.length%2)==0){
			i=arr[mid]+arr[mid-1];
			j=i/2;
		}
		if((arr.length%2)==1){
			j=arr[mid];
		}
		return(j);
	}
}
