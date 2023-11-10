
package DatabaseLayer;

import java.sql.*;

public class DataBaseConnection {
    
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        
        Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:RUBY 48","RUBY 48","1234");
        
        Statement statement=connection.createStatement();
         
    }
    
}
 