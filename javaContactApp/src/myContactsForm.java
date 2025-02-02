import java.awt.Image;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class myContactsForm extends javax.swing.JFrame {

    /**
     * Creates new form myContactsForm
     */
    String imagepth = null;
    public myContactsForm() {
        initComponents();
        populateJtable();

//        this.setLocationRelativeTo(null);
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
        username = new javax.swing.JLabel();
        userpic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lastnameTextfield1 = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        displaypic1 = new javax.swing.JLabel();
        lastname1 = new javax.swing.JLabel();
        phonetextlabel = new javax.swing.JLabel();
        firstnameTextfield = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        emailtext = new javax.swing.JTextField();
        emailtextlabel = new javax.swing.JLabel();
        lastname4 = new javax.swing.JLabel();
        addtextarea = new javax.swing.JLabel();
        jComboBoxgroup = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressbox = new javax.swing.JTextArea();
        displaybtn = new javax.swing.JButton();
        contactadd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel3.setText("My Contacts");

        username.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addComponent(userpic, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
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
                    .addComponent(jLabel3)
                    .addComponent(username))
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(userpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lastnameTextfield1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        lastnameTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextfield1ActionPerformed(evt);
            }
        });

        lastname.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(51, 51, 51));
        lastname.setText("FirstName");

        displaypic1.setBackground(new java.awt.Color(255, 204, 204));
        displaypic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displaypic1.setText("ProfilePic");
        displaypic1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        displaypic1.setOpaque(true);

        lastname1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lastname1.setForeground(new java.awt.Color(51, 51, 51));
        lastname1.setText("LastName");

        phonetextlabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        phonetextlabel.setForeground(new java.awt.Color(51, 51, 51));
        phonetextlabel.setText("Phone");

        firstnameTextfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        firstnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextfieldActionPerformed(evt);
            }
        });

        phoneno.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });

        emailtext.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });

        emailtextlabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        emailtextlabel.setForeground(new java.awt.Color(51, 51, 51));
        emailtextlabel.setText("Email");

        lastname4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lastname4.setForeground(new java.awt.Color(51, 51, 51));
        lastname4.setText("Group");

        addtextarea.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        addtextarea.setForeground(new java.awt.Color(51, 51, 51));
        addtextarea.setText("Address");

        jComboBoxgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Family", "Friends", "Work" }));

        addressbox.setColumns(20);
        addressbox.setRows(5);
        jScrollPane1.setViewportView(addressbox);

        displaybtn.setBackground(new java.awt.Color(255, 153, 153));
        displaybtn.setText("Browse");
        displaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybtnActionPerformed(evt);
            }
        });

        contactadd.setBackground(new java.awt.Color(255, 153, 153));
        contactadd.setText("Add");
        contactadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactaddMouseClicked(evt);
            }
        });
        contactadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(displaybtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailtextlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addtextarea, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phonetextlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastnameTextfield1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(firstnameTextfield)))))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(displaypic1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(contactadd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lastname4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(displaypic1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displaybtn)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname)
                    .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname1)
                    .addComponent(lastnameTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonetextlabel)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtextlabel)
                    .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastname4)
                            .addComponent(jComboBoxgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addtextarea))
                .addGap(27, 27, 27)
                .addComponent(contactadd)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateJtable(){

        contactQuery cq = new contactQuery(); 
        ArrayList<contact> ctList = cq.contactList();
    String[] colNames = {"Id","FirstName","LastName","Group","Phone","Email","Address","Image"};
    Object[][] rows= new Object[ctList.size()][colNames.length];
    
    for(int i = 0; i<ctList.size();i++){
        rows[i][0] =ctList.get(i).getCid();
        rows[i][1] =ctList.get(i).getFirstname();
        rows[i][2] =ctList.get(i).getLastname();
        rows[i][3] =ctList.get(i).getGroups();
        rows[i][4] =ctList.get(i).getPhone();
        rows[i][5] =ctList.get(i).getEmail();
        rows[i][6] =ctList.get(i).getAddress();

       ImageIcon pic = new ImageIcon
               (new ImageIcon(ctList.get(i).getPic())
                .getImage()
                .getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        rows[i][7] = pic;
 }
    MyModel mmd = new MyModel(rows,colNames);
    jTable1.setModel(mmd);
    jTable1.setRowHeight(100);
    }
    
    
    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void MiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MiniMouseClicked

    private void lastnameTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextfield1ActionPerformed

    private void firstnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextfieldActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed

    private void displaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybtnActionPerformed
        Myfunc mf = new Myfunc();
imagepth = mf.displaybtn(displaypic1);
System.out.println(imagepth);

    }//GEN-LAST:event_displaybtnActionPerformed

    private void contactaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactaddMouseClicked

    }//GEN-LAST:event_contactaddMouseClicked

    private void contactaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactaddActionPerformed
//
      String firstname  =firstnameTextfield.getText();
      String lastname = lastnameTextfield1.getText();
      String phone  =phoneno.getText();
      String address  =addressbox.getText();
      String groups = jComboBoxgroup.getSelectedItem().toString();
      String email  =emailtext.getText();
      byte[] img = null;  
      
      try {
             
             
          Path pth= Paths.get(imagepth);
                  img = Files.readAllBytes(pth);
                  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(myContactsForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(myContactsForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        contact c = new contact(null, firstname, lastname, groups, phone, email, address, img, 0);
    contactQuery cq = new contactQuery();
cq.insertContact(c);
        
    }//GEN-LAST:event_contactaddActionPerformed

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
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myContactsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Mini;
    private javax.swing.JTextArea addressbox;
    private javax.swing.JLabel addtextarea;
    private javax.swing.JButton contactadd;
    private javax.swing.JButton displaybtn;
    private javax.swing.JLabel displaypic1;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel emailtextlabel;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JPanel heading;
    private javax.swing.JComboBox<String> jComboBoxgroup;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel lastname1;
    private javax.swing.JLabel lastname4;
    private javax.swing.JTextField lastnameTextfield1;
    private javax.swing.JTextField phoneno;
    private javax.swing.JLabel phonetextlabel;
    public javax.swing.JLabel username;
    public javax.swing.JLabel userpic;
    // End of variables declaration//GEN-END:variables
}
