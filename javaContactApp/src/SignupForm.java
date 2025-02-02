
import java.awt.HeadlessException;
import java.sql.Connection;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class SignupForm extends javax.swing.JFrame {

    /**
     * Creates new form SignupForm
     */
    String imagepth=null;
    public SignupForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Mini = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        displaypic = new javax.swing.JLabel();
        displaybtn = new javax.swing.JButton();
        firstname = new javax.swing.JLabel();
        firstnameTextfield = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        confrimPasswordField = new javax.swing.JPasswordField();
        cancelbtn = new javax.swing.JButton();
        create = new javax.swing.JButton();
        loginbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        heading.setBackground(new java.awt.Color(255, 102, 102));

        Close.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        Mini.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Mini.setForeground(new java.awt.Color(255, 255, 255));
        Mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mini.setText("-");
        Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create A New Account");

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mini, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headingLayout.setVerticalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close)
                    .addComponent(Mini)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(255, 255, 255));

        displaypic.setBackground(new java.awt.Color(255, 204, 204));
        displaypic.setForeground(new java.awt.Color(102, 102, 102));
        displaypic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displaypic.setText("DisplayPicture");
        displaypic.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        displaypic.setOpaque(true);

        displaybtn.setBackground(new java.awt.Color(255, 153, 153));
        displaybtn.setText("Browse");
        displaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybtnActionPerformed(evt);
            }
        });

        firstname.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        firstname.setText("FirstName");

        firstnameTextfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        firstnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextfieldActionPerformed(evt);
            }
        });

        lastname.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lastname.setText("LastName");

        lastnameTextField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        username.setText("UserName");

        usernameTextField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        password.setText("Password");

        confirmpassword.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        confirmpassword.setText("ConfirmPassword");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        confrimPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrimPasswordFieldActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(255, 153, 153));
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        create.setBackground(new java.awt.Color(255, 153, 153));
        create.setText("Create");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        loginbtn.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtn.setText("Already have an account?Click here to login");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confrimPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameTextField)
                                        .addGroup(mainLayout.createSequentialGroup()
                                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(Password)
                                        .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                                            .addComponent(displaypic, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(86, 86, 86)))))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(displaybtn))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(loginbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(displaypic, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displaybtn)
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname)
                    .addComponent(lastname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confrimPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(create))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MiniMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void firstnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextfieldActionPerformed

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextFieldActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    
    private void displaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybtnActionPerformed

Myfunc mf = new Myfunc();
imagepth = mf.displaybtn(displaypic);




    }//GEN-LAST:event_displaybtnActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void confrimPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrimPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confrimPasswordFieldActionPerformed

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
 LoginForm logf=new LoginForm();
logf.setVisible(true);
logf.pack();
logf.setLocationRelativeTo(null);
logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.dispose();
    }//GEN-LAST:event_loginbtnMouseClicked
public boolean isUsernameExist(String un){
    boolean uExist = false;
    Connection con = myConnection.getConnection();
PreparedStatement ps;
ResultSet rs;
try{
ps =con.prepareStatement("SELECT * FROM `user` WHERE `username` = ?  ");
ps.setString(1,usernameTextField.getText() );

rs = ps.executeQuery();

if(rs.next()){
   uExist = true;
}else{
        JOptionPane.showMessageDialog(null,"Login Error");

}

}catch(SQLException ex){
    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE ,null,ex);
}
    
    return uExist;
}
    public boolean verifData(){
    //if Firstname - Lastname - Password Are Empty
    
    if(firstnameTextfield.getText().equals("")  &&  lastnameTextField.getText().equals("")
            || usernameTextField.getText().equals("") 
            ||String.valueOf(Password.getPassword()).equals(""))  
    {
        JOptionPane.showMessageDialog(null,"One or more field are empty");
        return false;

    }
//    if one password are diffrent from other
    else if(!String.valueOf(Password.getPassword()).equals(String.valueOf(confrimPasswordField.getPassword())) ){
            JOptionPane.showMessageDialog(null,"Incorrect Password");

    return false;
}
    //if no img is selected
    else if (imagepth == null)
    {
                JOptionPane.showMessageDialog(null,"No image selected");

        return false;
    }
    
    //else everything is done
    else
    {    
        return true;
    }
     
    
}
    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

if(verifData()){
    Connection con = myConnection.getConnection();
      PreparedStatement ps; 
        try {
            ps = con.prepareStatement("INSERT INTO `user`( `firstname`, `lastname`, `username`, `password`, `displaypic`) VALUES (?,?,?,?,?)");
            ps.setString(1,firstnameTextfield.getText());
            ps.setString(2,lastnameTextField.getText());
            ps.setString(3,usernameTextField.getText()); 
           ps.setString(4,String.valueOf(Password.getPassword()));          
          
            InputStream img =new FileInputStream(new File(imagepth));
            ps.setBlob(5, img);

            
            if(isUsernameExist(usernameTextField.getText())){
                 JOptionPane.showMessageDialog(null," Username Already Exist");
            }
            else{
                   if(ps.executeUpdate() != 0){
                   JOptionPane.showMessageDialog(null,"Account Created");
                      }
                   else{
                       JOptionPane.showMessageDialog(null,"Something Wrong");
                         }
                 }
        
        } catch (HeadlessException | FileNotFoundException | SQLException ex) { //catch (Exception ex) {
            Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        

    }//GEN-LAST:event_createActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
 

    }//GEN-LAST:event_createMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Mini;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel confirmpassword;
    private javax.swing.JPasswordField confrimPasswordField;
    private javax.swing.JButton create;
    private javax.swing.JButton displaybtn;
    private javax.swing.JLabel displaypic;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JPanel heading;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JPanel main;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
