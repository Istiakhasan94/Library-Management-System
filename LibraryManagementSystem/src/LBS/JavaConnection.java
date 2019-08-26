
package LBS;
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnection {
    Connection conn;
    
    public static Connection ConnecrDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\d drive backup\\LibraryManagementSystem\\MemberInfo.sqlite");
            return conn;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);   
            return null;
        }
        
    }
    
}
