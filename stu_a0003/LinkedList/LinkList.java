import java.io.*;
class LinkList{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("LinkInput.java"));
			String line = br.readLine();
			LinkedList temp = new LinkedList();
			temp.addAtHead(Integer.parseInt(line));	
			line = br.readLine();
			while(line!=null){
				//LinkedList temp = new LinkedList();
				temp.addAtTail(Integer.parseInt(line));
				line = br.readLine();
			}
			temp.printAll();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
