public class AsgA2422{

	public static int find_occured_min(int[] a){

		int temp=1,count=1;

		for(int i=0;i<a.length;i++){

			for(int j=i+1;j<a.length;j++){

				if(a[i]==a[j])
					count++;
			}	
			if(count<temp){
				temp=count;
				count=a[i];
			
			
			}
			//System.out.println(+count);
		}
		return(count);
	}
}
