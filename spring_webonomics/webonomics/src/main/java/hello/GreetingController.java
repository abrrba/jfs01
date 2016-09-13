package hello;
import java.sql.*;  

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @RequestMapping("/hiGreeting")
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(value="/users", method=GET)
    public List <UserRecord>  getUsers() {
        try {  
            List<UserRecord> userList = new ArrayList<UserRecord>();
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webonomics","root","root123");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from users");  
            UserRecord u = null;
            while(rs.next()) {  
                u = new UserRecord(rs);
                userList.add(u);
            }
            con.close();  
            return userList;
        } catch (Exception e){ System.out.println(e);}  
        return null;
    }
    
    @RequestMapping(value="/product", method=GET)
    public Product getProduct(@RequestParam(value="name", defaultValue="World") String name) {
        return new Product(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value="/products", method=GET)
    public Products getProducts(@RequestParam(value="name", defaultValue="World") String name) {
        return new Products();
    }
    
    @RequestMapping(value="/products2", method=GET)
    public List<String> getProducts2(@RequestParam(value="name", defaultValue="World") String name) {
        List<String> newList = new ArrayList<String>();
        newList.add("String 1");
        newList.add("String 2");
        newList.add("String 3");
        return newList;
    }
    
    @RequestMapping(value="/productss", method=GET)
    public Products getProductss(@RequestParam(value="name", defaultValue="World") String name) {
        return new Products("Test");
    }
    
    @RequestMapping(value="/productDB", method=GET)
    public ProductRecord getProductDB(@RequestParam(value="name", defaultValue="World") String name) {
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webonomics","root","root123");  

            Statement stmt=con.createStatement();  

            // ResultSet rs=stmt.executeQuery("select prod_id,prod_seller,prod_year from product_detail");  
            ResultSet rs=stmt.executeQuery("select * from product_detail");  
            ProductRecord p = null;
            while(rs.next()) {  
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                p = new ProductRecord(rs);
                p.PrintRecords();
            }
            
            con.close();  
            return p;


        } catch (Exception e){ System.out.println(e);}  
        return null;

    }

    @RequestMapping(value="/putput/{id}", method=PUT)
    public int putPut(@RequestBody String input, @PathVariable("id") long id) {
        System.out.println("PUT Request" + input + "Id is " + id);
        return 10;
    }
    
    @RequestMapping(value="/putput/{x}", method=GET)
    public int getget() {
        System.out.println("GET IN PLACE OF PUT");
        return 10;
    }
    
    @RequestMapping(value="/postpost", method=POST)
    public String postpost( @RequestBody String input) {
        System.out.println("POST POST" + input);
        return "POST";
    }
    
    // http://stackoverflow.com/questions/6019562/parsing-json-in-spring-mvc-using-jackson-json


    @RequestMapping(value="/postuser", method=POST)
        public String postuser( @RequestBody UserRecord u) {
            //     insert into users (user_id, password) values ('Hey', 'password')
            //        UserRecord u =  new UserRecord (input);
            u.printUserRecord();

            try {
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webonomics","root","root123");  

                String query = " insert into users (user_id, password)" + " values (?, ?)";

                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString (1, u.getUserid());
                preparedStmt.setString (2, u.getPassword());

                // execute the preparedstatement
                preparedStmt.execute();

                con.close();  
            } catch (Exception e) {
                System.out.println(e);
            }  
            return "50";
        }

    @RequestMapping(value="/productDBList", method=GET)
    public List <ProductRecord> getProductDBList(@RequestParam(value="name", defaultValue="World") String name) {
        try {  
            List<ProductRecord> newList = new ArrayList<ProductRecord>();
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webonomics","root","root123");  

            Statement stmt=con.createStatement();  

            // ResultSet rs=stmt.executeQuery("select prod_id,prod_seller,prod_year from product_detail");  
            ResultSet rs=stmt.executeQuery("select * from product_detail");  
            ProductRecord p = null;
            while(rs.next()) {  
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                p = new ProductRecord(rs);
                newList.add(p);
                p.PrintRecords();
            }
            
            con.close();  
            return newList;
        } catch (Exception e){ System.out.println(e);}  
        return null;
    }
}
