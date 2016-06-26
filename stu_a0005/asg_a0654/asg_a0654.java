class asg_a0654{
	public static void main(String args[]){
		double[] myList = {10,2,21,4};

		int x = myList.length%2;
		int a = myList.length/2;
		if(x == 1)
		{
			System.out.println("The median is " +myList[a]);
		}
		else if(x == 0)
		{
			double y = (myList[a]+myList[a-1])/2;
			System.out.println("The median is " +y);
		}
	}
}


