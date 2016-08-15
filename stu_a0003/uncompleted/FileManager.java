import java.io.*;
public class FileManager {
	public static void main(String[] args) {

		try {

			FileWriter fw = new FileWriter("dj.rst");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hi am Dnyaneshwar Jadhav");
			bw.newLine();

			bw.close();
			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
