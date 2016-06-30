public class AsgA0651{
	public static int product_of_array(int[] a){
		int i;
		int total=1;
		for(i=0; i<a.length;i++){
			total = total * a[i];
		}
		return(total);
	}
}
