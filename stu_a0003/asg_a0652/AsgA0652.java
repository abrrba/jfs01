public class AsgA0652{
	public static void main(String[] argv)
	{
		int[] myList={10,20,2,4};
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList [i]+" "); 
		}
		//double total=1;
		//for(int i=0;i<myList.length;i++)
		//{
		//	total = total * myList[i];
		//}
		//System.out.println("Total is "+ total);
		int max=myList[0];
		for(int i=1;i<myList.length;i++)
		{
			if(myList[i]>max)
			{max=myList[i];
			}
		}
		System.out.println("Max is "+max);
		int min=myList[0];
		for(int i=1;i<myList.length;i++)
		{
			if(myList[i]<min)
				min=myList[i];
		}
		System.out.println("Min is "+min);
	}
}
