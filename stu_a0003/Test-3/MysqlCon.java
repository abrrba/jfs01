import java.sql.*;  
import java.io.*;
/*
   Add entries to the product_detail table.

   Add a new table with name as students, have columns as
   Roll|Name|Class|Section

   entries to the table students, generate random numbers in java in the range
   of 0-100 for the roll numbers.
 */
class MysqlCon{  
	public static void main(String args[]){  
		try {  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webonomics","root","root123");  
			Statement stmt=con.createStatement();
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String s = br.readLine();
	        String query="create table Students(Name varchar(20),Class varchar(20),Roll int,Marks int)";
			PreparedStatement ps1 = con.prepareStatement(query);
			stmt.executeUpdate(query);
			while(s!=null){
				String[] str = s.split("-");
				int str1 = Integer.parseInt(str[2]);
				int str2 = Integer.parseInt(str[3]);
				String query1 ="insert into Students(Name,Class,Roll,Marks) "+"values(?, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(query1);

				ps.setString(1,str[0]);
				ps.setString(2,str[1]);
				ps.setInt(3,str1);
				ps.setInt(4,str2);
				ps.execute();
				s=br.readLine();
				
			}
			BinaryTree bt = new BinaryTree();
			String query2 = "select * from Students";
			ResultSet rs = stmt.executeQuery(query2);
			while(rs.next()){
				bt.insert(rs.getInt("Roll"),rs.getInt("Marks"),rs.getString("Name"),rs.getString("Class"));
			}
			con.close();  
			System.out.println("Given List in Post Order :");
			bt.postorder();
		//	bt.printAll();
		} catch (Exception e){ System.out.println(e);}  

	}
}  
