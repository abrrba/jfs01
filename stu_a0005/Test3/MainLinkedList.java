import java.io.*;
class MainLinkedList
{
	public static void main(String args[]) throws IOException
	{
		LinkedList l = new LinkedList();
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String thisLine = br.readLine();
		while(thisLine != null)
		{
			String[] str = thisLine.split(":");
			String s1 = "Sorted-Ascending order";
			String s2 = "Sorted-Decending order";
			String s3 = "Add-at-middle";
			if(str[0].startsWith(s1))
			{
				String[] str1 = str[1].split("\\s");
				int a = str1.length-2;

				String ss1 = str1[1].replace("["," ");
				String ss2 = ss1.replace("]"," ");
				String ss3 = ss2.trim();
				int p = Integer.parseInt(ss3);

				str[1].trim();

				if( a != p)
				{
					System.out.println("Input Error !!!!!!!!!! ");
				}

				else
				{
					int i = 2;

					for(int j = 0; j < a; j++)
					{


						int k = Integer.parseInt(str1[i]);

						l.Addsorted(k);
						i++;
					}

				}
				if( a == p ){	
					System.out.println("The Ascending Order List Is : ");
					l.printAll(a);
				}
				thisLine = br.readLine();
			} 

			if(str[0].startsWith(s2))
			{
				String[] str1 = str[1].split("\\s");
				int a = str1.length-2;

				String ss1 = str1[1].replace("["," ");
				String ss2 = ss1.replace("]"," ");
				String ss3 = ss2.trim();
				int p = Integer.parseInt(ss3);

				str[1].trim();

				if(a != p)
				{
					System.out.println("Input Error !!!!!!!!!");
				}

				else
				{
					int i = 2;

					for( int j = 1; j < a+1; j++)
					{


						int k = Integer.parseInt(str1[i]);

						l.Addsorted(k);
						i++;
					}
					for(int q = 0; q < a; q++)
					{
						int y = l.delFromHead();
						l.addAtHead(y);
					}


				}
				if(a == p){
					System.out.println("The Descending Order List is: ");
					l.printAll(a);
				}
				thisLine = br.readLine();
			}

		}

	}
}
