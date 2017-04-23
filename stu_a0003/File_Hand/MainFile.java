import java.io.*;
import java.util.*;
class MainFile{
	public static void main (String[] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("a.txt"));
			PrintWriter pw = new PrintWriter("b.txt");
			PrintWriter p = new PrintWriter("c.txt");
			PrintWriter pri = new PrintWriter("d.txt");
			PrintWriter pr = new PrintWriter("e.txt");
			PrintWriter prin = new PrintWriter("f.txt");
			PrintWriter printw = new PrintWriter("g.txt");
			int line = 0;
			int chare = 0;
			int word = 0;
			int digit = 0;
			String str = br.readLine();
			Stack<String> st = new Stack<String>();		
			while(str!=null){
				st.push(str);
				String[] s = str.split("\\s");
				 for(int i=0; i<s.length;i++){
                                        word++;
                                        chare = chare + s[i].length();
                                }
				line++;
				for(int i=s.length-1;i>=0;i--){
					pw.write(""+s[i]+" ");					
				}
				pw.println();
				for(int i=s.length-1;i>=0;i--){
					String s1 ="";
					for(int j=s[i].length()-1;j>=0;j--){
						s1 = s1+s[i].charAt(j);
					}
					p.write(s1+" ");
				}
				p.println();
				String upper = str.replaceAll("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]","");
				prin.write(upper+"\n");
				String lower = str.replaceAll("[abcdefghijklmnopqrstuvwxyz]","");
				printw.write(lower+"\n");
				String vowels = str.replaceAll("[aeiouAEIOU]","");
				pr.write(vowels+"\n");
				str = br.readLine();
			}
			pw.close();
			p.close();
			prin.close();
			printw.close();
			pr.close();
			if(st.isEmpty()){
				return;
			}else{
				for(int i = st.size()-1;i>=0;i--){
					pri.write(st.pop());
					pri.println();
				}pri.close();
			}	
			System.out.println("Lines = "+line);
			System.out.println("Characters = "+chare);
			System.out.println("Words ="+word);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
