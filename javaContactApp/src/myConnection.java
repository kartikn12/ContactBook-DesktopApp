

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;




public class myConnection {

    public static Connection getConnection(){   
Connection con=null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/javacontactsapp ","root","");
//catch (Exception ex) {
        } catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex.getCause());
        }
return con;
    }

}
