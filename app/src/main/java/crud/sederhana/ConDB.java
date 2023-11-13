package crud.sederhana;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
/**
 *
 * @author karel
 */
public class ConDB {
    public static Connection getConnectionToDB(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("practice");
            m.setUser("root"); 
            m.setPassword(""); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection k = m.getConnection();
            
            System.out.println("Successfully Connect");
            return k;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return null;
    }
}
