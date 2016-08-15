public class Array{
	public static void main(String argv[])
	{
		double[] myList={1.9,2.9,3.4,3.5};
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList [i]+" "); 
		}
		double total=1;
		for(int i=0;i<myList.length;i++)
		{
			total = total * myList[i];
		}
		System.out.println("Total is "+ total);
		double min=myList[0];
		for(int i=1;i<myList.length;i++)
		{
			if(myList[i]<min)
				min=myList[i];
		}
		System.out.println("Min is "+min);
	}
}
