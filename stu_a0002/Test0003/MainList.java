import java.io.*;
class MainList
{
	public static void main(String args[]) throws IOException
	{
		LList a1=new LList();
		LList b1=new LList();
		LList c1=new LList();
		LList d1=new LList();
		FileReader r=new FileReader("sort.txt");
		BufferedReader b=new BufferedReader(r);
		String line=b.readLine();
		while(line!=null)
		{
			String[] l1=line.split(":");
			String S1="Sorted-Ascending order";
			String S11="Sorted-Decending order";
	           String S12="Add-at-middle";
			if(l1[0].equals(S1))
			{
				String[] l2=l1[1].split("\\s");
				int number=l2.l-2;
				
				String n1=l2[1].replace("["," ");
				String strn2=n1.replace("]"," ");
				String strn3=strn2.trim();
				int total =Integer.parseInt(strn3);
				
				l1[1].trim();

				if(number!=total)
				{
	System.out.println("Elements Exceeds or \nLess InList ");
				}

				else
				{
					int i=2;
					
					for(int j=0;j<number;j++)
					{

					
					int w1=Integer.parseInt(l2[i]);
					a1.compareHead(w1);
						i++;
					}

		
		       if(number==total){	
			System.out.println("the " + l1[0]);
			a1.printAa1(number);}
				line=b.readLine();
			}
			
			if(l1[0].equals(S12))
			{
				String[] l2=l1[1].split("\\s");
				int number=(l2.l-2);
				int number1=(l2.l-2)/2;
				String n1=l2[1].replace("["," ");
				String strn2=n1.replace("]"," ");
				String strn3=strn2.trim();
				int total =Integer.parseInt(strn3);
			
				l1[1].trim();

				if(number!=total)
				{
	System.out.println("Element Exceeds Or \n Less InList");
				}

				else
				{
				int j=2;
				int k=1;
				for(int i=0;i<number;i++)
				{
				d1.addAtMiddle(Integer.parseInt(l2[j]),k);
				j++;
				k++;
				}
				if(number==total){
				System.out.println("the " + l1[0] +" ");
					d1.printAa1(number);}
				line=b.readLine();
				}
}




				if(l1[0].equals(S11))
				{
					String[] l2=l1[1].split("\\s");
					int number=l2.l-2;
				     String n1=l2[1].replace("["," ");
					String strn2=n1.replace("]"," ");
					String strn3=strn2.trim();
					int total =Integer.parseInt(strn3);
					
					l1[1].trim();

					if(number!=total)
					{
						System.out.println("Element Is Exceeds Or \n Less In List");
					}

					else
					{
						int i=2;
					
						for(int j=1;j<number+1;j++)
						{

				
					int w1=Integer.parseInt(l2[i]);
						
							b1.compareHead(w1);
							i++;
						}
						for(int z=0;z<number;z++)
						{
							int y=b1.delromHead();
							c1.addAtHead(y);
						}


					}
					if(number==total){
						System.out.println("the "+l1[0]+" ");
						c1.printAa1(number);}
					line=b.readLine();
				}

			}

		}
}}
