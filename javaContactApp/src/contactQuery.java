
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class contactQuery {

public boolean insertContact(contact cont){
    
    
    boolean contactIsCreated = true;
     Connection con = myConnection.getConnection();
      PreparedStatement ps; 
      
    try {
        ps = con.prepareStatement("INSERT INTO `mycontact`( `firstname`, `lastname`, `groups`, `phone`, `email`, `address`, `pic`, `userid`) VALUES (?,?,?,?,?,?,?,?)");
        ps.setString(1,cont.getFirstname());
        ps.setString(2,cont.getLastname());
        ps.setString(3,cont.getGroups());
        ps.setString(4,cont.getPhone());
        ps.setString(5,cont.getEmail());
        ps.setString(6,cont.getAddress());
        ps.setBytes(7, cont.getPic());
        ps.setInt(8,cont.getUid());

        
         if(ps.executeUpdate() != 0){
                   JOptionPane.showMessageDialog(null,"NewContactCreated");
         contactIsCreated = true;   
         }
                   else{
                       JOptionPane.showMessageDialog(null,"Something Wrong");
         contactIsCreated = false;
         }
        
    } catch (SQLException ex) {
        Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    return contactIsCreated;
}
    
}
