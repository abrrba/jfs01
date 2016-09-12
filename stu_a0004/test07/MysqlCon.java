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
      String myUrl = "jdbc:mysql://localhost:3306/test07";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root123");
    /*
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
*/
BufferedReader br=new BufferedReader(new FileReader("input.txt"));
String line=br.readLine();
while(line!=null)
{
String[] str=line.split("-"); 
//str[0] -name str[1]-class str[2]-roll str[3]-marks  //data-table name
    String query = " insert into data(name,class,roll,marks)"
        + " values (?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
//     System.out.println(str[0]);
      preparedStmt.setString (1, str[0]);
      preparedStmt.setString (2, str[1]);
      preparedStmt.setInt(3, Integer.parseInt(str[2]));
      preparedStmt.setInt(4, Integer.parseInt(str[3]));
  

      // execute the preparedstatement
      preparedStmt.execute();
     line=br.readLine();
}
String str="select * from data";
Statement stm=conn.createStatement();
ResultSet rs=stm.executeQuery(str);
while(rs.next())
{
bst.insert(rs.getString("name"),rs.getString("class"),rs.getInt("roll"),rs.getInt("marks"));
//bst.insert(rs.getString("class"));
//bst.insert(rs.getInt("roll"));
//bst.insert(rs.getInt("marks"));
}


      conn.close();
	bst.postorder();
	bst.printAll();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
}
}
