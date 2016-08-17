import java.io.*;
class MainShape{
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("a.txt");
			String thisline = null;
			BufferedReader br = new BufferedReader(fr);
	
			while((thisline = br.readLine())!=null){
				String str[] = thisline.split("\\s");
				if(str[0]=="R"){
					double x = Double.parseDouble(str[1]);
					double y = Double.parseDouble(str[2]);
					Rectangle rec = new Rectangle(x,y);
					System.out.println(rec.calculateArea());
				}else if(str[0]=="C"){
					double z = Double.parseDouble(str[1]);
					Circle cir = new Circle(z);
					System.out.println(cir.calculateArea());
				}System.out.println(str[1]);
			}}catch(IOException e){
				e.printStackTrace();
			}
	}
	/*		Shape[] shapes = new Shape[3];          // Create an array to hold shapes
			shapes[0] = new Circle(2.0);            // Fill in the array
			shapes[1] = new Rectangle(1.0, 3.0);
			shapes[2] = new Rectangle(4.0, 2.0);

			double total_area = 0;
			for(int i = 0; i < shapes.length; i++)
			{    total_area += shapes[i].area();  
			System.out.println(total_area);
			}   // Compute the area of the shapesi
	//System.out.println(total_area);
	 */	
}
