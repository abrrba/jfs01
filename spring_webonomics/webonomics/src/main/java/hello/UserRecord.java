package hello;
import java.sql.*;  

class UserRecord {
    public String user_id;
    public String password;
    

    // http://stackoverflow.com/questions/7625783/jsonmappingexception-no-suitable-constructor-found-for-type-simple-type-class

    UserRecord () {

    }

    String getUserid() {
        return user_id;
    }

    String getPassword() {
        return password;
    }

    UserRecord (ResultSet rs) {
        try {
            user_id = rs.getString(1);
            password = rs.getString(2);
        } catch (SQLException e) {
        }
    }

    void printUserRecord() {
        System.out.println ("User Id is " + user_id);
        System.out.println ("Password is " + password);
    }
}
