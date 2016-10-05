import java.io.*;
import java.sql.*;
class MysqlCon
{
public static void main(String[] args) throws IOException
  {
    try
    {
    	BST bst=new BST();
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/Test0007";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "avi", "avi19");
   
BufferedReader br=new BufferedReader(new FileReader("file.txt"));
String line=br.readLine();
while(line!=null)
{
String[] str=line.split("="); 

    String query = " insert into data(name,class,roll,marks)" + " values (?, ?, ?, ?)";

     
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, str[0]);
      preparedStmt.setString (2, str[1]);
      preparedStmt.setInt(3, Integer.parseInt(str[2]));
      preparedStmt.setInt(4, Integer.parseInt(str[3]));
  

     
      preparedStmt.execute();
     line=br.readLine();
}
String str="select * from data";
Statement stm=conn.createStatement();
ResultSet rs=stm.executeQuery(str);
while(rs.next())
{
bst.insert(rs.getString("name"),rs.getString("class"),rs.getInt("roll"),rs.getInt("marks"));


}


    conn.close();
	bst.postorder();
	bst.printAll();
    }
    catch (Exception e)
    {
      System.err.println("Throws Exception");
      System.err.println(e.getMessage());
    }
}
}
