import java.sql.*;  

/*
    Add entries to the product_detail table.

    Add a new table with name as students, have columns as
    Roll|Name|Class|Section

    entries to the table students, generate random numbers in java in the range
    of 0-100 for the roll numbers.
*/

class ProductRecord {
    long prod_id;
    String prod_name;
    String prod_seller;
    String prod_year;
    String prod_price;
    String prod_desc;
    int prod_quantity;
    String prod_category;
    String prod_image;
    String prod_image1;
    String prod_image2;
    String prod_image3;

    ProductRecord (ResultSet rs) {
        try {
            prod_id = rs.getLong(1);
            prod_name = rs.getString(2);
            prod_seller = rs.getString(3);
            prod_year = rs.getString(4);
            prod_price = rs.getString(5);
            prod_desc = rs.getString(6);
            prod_quantity = rs.getInt(7);
            prod_category = rs.getString(8);
            prod_image = rs.getString(9);
            prod_image1 = rs.getString(10);
            prod_image2 = rs.getString(11);
            prod_image3 = rs.getString(12);
       } catch (SQLException e) {
       
       }
    }

    void PrintRecords() {

        System.out.println ("prod_id        = " + prod_id);
        System.out.println ("prod_name      = " + prod_name);
        System.out.println ("prod_seller    = " + prod_seller);
        System.out.println ("prod_year      = " + prod_year);
        System.out.println ("prod_price     = " + prod_price);
        System.out.println ("prod_desc      = " + prod_desc);
        System.out.println ("prod_quantity  = " + prod_quantity);
        System.out.println ("prod_category  = " + prod_category);
        System.out.println ("prod_image     = " + prod_image);
        System.out.println ("prod_image1    = " + prod_image1);
        System.out.println ("prod_image2    = " + prod_image2);
        System.out.println ("prod_image3    = " + prod_image3);
    }

}

class MysqlCon{  
    public static void main(String args[]){  
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webonomics","root","root123");  

            Statement stmt=con.createStatement();  

            // ResultSet rs=stmt.executeQuery("select prod_id,prod_seller,prod_year from product_detail");  
            ResultSet rs=stmt.executeQuery("select * from product_detail");  
            
            while(rs.next()) {  
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                ProductRecord p = new ProductRecord(rs);
                p.PrintRecords();
            }

            con.close();  

        } catch (Exception e){ System.out.println(e);}  

    }  
}  
