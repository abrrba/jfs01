import java.io.*;
public class Canvas{
public static void main(String[] args){
try{
	FileReader fr = new FileReader("a.txt");
	String thisline = null;
	BufferedReader br = new BufferedReader(fr);
	thisline = br.readLine();
	while(thisline!=null){
		String str[] = thisline.split("\\s");
		String st="R";
		String st1="C";
		if((str[0]).equals(st)){
			int x = Integer.parseInt(str[1]);
			int y = Integer.parseInt(str[2]);
			Rectangle rec = new Rectangle(x,y);
			System.out.println(rec.calculateArea());
		}else if((str[0]).equals(st1)){
			int z = Integer.parseInt(str[1]);
			Circle cir = new Circle(z);
			System.out.println(cir.calculateArea());
		}
		thisline = br.readLine();
	}
}catch(IOException e){
	e.printStackTrace();
}
}
}
