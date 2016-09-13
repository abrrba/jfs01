package hello;
import java.sql.*;  

class ProductRecord {
    public long prod_id;
    public String prod_name;
    public String prod_seller;
    public String prod_year;
    public String prod_price;
    public String prod_desc;
    public int prod_quantity;
    public String prod_category;
    public String prod_image;
    public String prod_image1;
    public String prod_image2;
    public String prod_image3;

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
