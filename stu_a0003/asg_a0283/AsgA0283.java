class AsgA0283{
	public static void main(String argv[])
	{
		int i,j,k;
		for(i=0;i<5;i++){
			for(j=i;j>=0;j--){
				System.out.print(" ");}
			for(k=(2*i);k<9;k++){
				System.out.print("*");}
			System.out.println("");
		}
		for(i=2;i<6;i++)
		{
			for(j=i;j<6;j++){
				System.out.print(" ");}
			for(k=0;k<(i*2)-1;k++){
				System.out.print("*");}
			System.out.println("");
		}
	}
}
