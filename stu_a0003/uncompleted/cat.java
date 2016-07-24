import java.io.*;
class cat {
	public static void main(String []args) throws IOException {

		/*
		 * Check the number of arguements passed to the java code.
		 */

		if (args.length != 1) {
			/*
			 * Incorrect number of arguments.
			 */
			System.out.println ("Please enter the filename you want to cat");
			System.exit(-1);
		} else {
			/* 
			 * Correct number of arguments.
			 */
			System.out.println ("Number of arguments is " + args.length);
		}

		File inFile = new File(args[0]);
		String thisLine = null;

		try {
			/*
			 * Use bufferedreader for reading files.
			 */
			BufferedReader br = new BufferedReader(new FileReader(inFile));

			/*
			 * Read the file till the time the read line is not NULL
			 */

			while ((thisLine = br.readLine()) != null) {

				/*
				 * Print the line.
				 */

				System.out.println(thisLine);
				System.out.println(thisLine.length());
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}

