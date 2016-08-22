import java.io.*;
public class MainLinkedList{
        public static void main(String[] argv){
                try{
                        LinkedList x = new LinkedList();
			LinkedList y = new LinkedList();
			LinkedList z = new LinkedList();
			LinkedList p = new LinkedList();
                        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        		String line =br.readLine();
//p.addAtMiddle(1);
//p.addAtMiddle(2);
//p.addAtMiddle(3);
//p.addAtMiddle(4);
//p.printAll();
			while(line!=null){
		            String[] str = line.split(":");
        		    String[] str2 = str[1].split("\\s");
			    int a = str2.length-2;
         		    String s = str2[1].replace("["," ");
                   	    String s1 = s.replace("]"," ");
  	   		    String s2 = s1.trim();
			    str2[1]=s2;
			    int b = Integer.parseInt(str2[1]);	
			
			if(b==a){
				if(str[0].equals("Sorted-Ascending order")){               
					for(int i=0; i<b;i++){
						x.addAtSorted(Integer.parseInt(str2[i+2]));
					}x.printAll();
				}
				else if(str[0].equals("Sorted-Decending order")){
					
					for(int i=0; i<b;i++){
						z.addAtSorted(Integer.parseInt(str2[i+2]));
					}
					
					for(int i=0; i<b ;i++){
						int d =z.delFromHead();
						y.addAtHead(d);
					}y.printAll();
				}
				//else if(str[0].equals("Add-at-Middle")){
									
			//	}
			}
			else if(b!=a){
				System.out.println("Given Number's is not in proper limit ");
			}System.out.println(" <= "+str[0]);
			line = br.readLine();
		}
      }catch(IOException e){
                        e.printStackTrace();
                }
      }
}

