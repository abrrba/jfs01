import java.io.*;
class MainLinkedList
{
	public static void main(String args[]) throws IOException
	{
		LinkedList ll=new LinkedList();
		LinkedList rr=new LinkedList();
		LinkedList zz=new LinkedList();
		LinkedList mm=new LinkedList();
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			String[] str=line.split(":");
			
			String forcompare="Sorted-Ascending order";
			String forcompare1="Sorted-Decending order";
			String forcompare2="Add-at-middle";
			if(str[0].equals(forcompare))
			{
				String[] str1=str[1].split("\\s");
				int x=str1.length-2;
				
				String strn=str1[1].replace("["," ");
				String strn2=strn.replace("]"," ");
				String strn3=strn2.trim();
				int m =Integer.parseInt(strn3);
				
				str[1].trim();

				if(x!=m)
				{
					System.out.println("The Number Of Elements Is Exceeds or less InList ");
				}

				else
				{
					int i=2;
					
					for(int j=0;j<x;j++)
					{

						
						int kk=Integer.parseInt(str1[i]);
						
						ll.compareHead(kk);
						i++;
					}

				}
				if(x==m){	
					System.out.println("the " + str[0]);
					ll.printAll(x);}
				line=br.readLine();
			}

			if(str[0].equals(forcompare2))
			{
				String[] str1=str[1].split("\\s");
				int x=(str1.length-2);
				int x1=(str1.length-2)/2;
				
				String strn=str1[1].replace("["," ");
				String strn2=strn.replace("]"," ");
				String strn3=strn2.trim();
				int m =Integer.parseInt(strn3);
				
				str[1].trim();

				if(x!=m)
				{
					System.out.println("The Number Of Element is Exceeds Or Less InList");
				}

				else
				{
					int j=2;
				
					for(int i=0;i<x;i++){
						mm.addAtTail(Integer.parseInt(str1[j]));
						j++;
					}
					mm.addAtMiddle(5,x1);
				}
				if(x==m){
					System.out.println("the " + str[0] +" ");
					mm.printAll(x);}
				line=br.readLine();
			}





			if(str[0].equals(forcompare1))
			{
				String[] str1=str[1].split("\\s");
				int x=str1.length-2;
				String strn=str1[1].replace("["," ");
				String strn2=strn.replace("]"," ");
				String strn3=strn2.trim();
				int m =Integer.parseInt(strn3);
				
				str[1].trim();

				if(x!=m)
				{
					System.out.println("The Number Of Element Is Exceeds Or Less InList");
				}

				else
				{
					int i=2;
					
					for(int j=1;j<x+1;j++)
					{

						
						int kk=Integer.parseInt(str1[i]);
						
						rr.compareHead(kk);
						i++;
					}
					for(int p=0;p<x;p++)
					{
						int y=rr.delFromHead();
						zz.addAtHead(y);
					}


				}
				if(x==m){
					System.out.println("the "+str[0]+" ");
					zz.printAll(x);}
				line=br.readLine();
			}

		}

	}
}
