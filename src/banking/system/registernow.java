package banking.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class registernow extends javax.swing.JFrame {

    /**
     * Creates new form registernow
     */
    public registernow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idtype = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        idnum = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        accnum = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Create New Account");

        jLabel2.setText("ID type");

        jLabel3.setText("Selected ID number");

        jLabel4.setText("Account Number");

        jLabel5.setText("Email  ID");

        jLabel6.setText("Registered Phone");

        jLabel7.setText("Date of Birth");

        jLabel8.setText("Username");

        jLabel9.setText("Password");

        idtype.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National Identity Card (NIC)", "Passport Number" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 51, 0));
        jLabel10.setText("BACK");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel10)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idnum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(accnum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idtype, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(idtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(accnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        
        String selectedValue = jComboBox1.getSelectedItem().toString();
        idtype.setText(selectedValue);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      
        loginpage obj = new loginpage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectedValue = jComboBox1.getSelectedItem().toString();
    idtype.setText(selectedValue);
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
              
              // Check if any field is empty
        if (idtype.getText().isEmpty() || idnum.getText().isEmpty() || accnum.getText().isEmpty() ||
            email.getText().isEmpty() || phone.getText().isEmpty() || dob.getText().isEmpty() ||
            user.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory. Please fill in all the details.");
            return; // Stop further execution
        }
                // Check if the username already exists in the database
        String checkUsernameQuery = "SELECT * FROM login WHERE username = ?";
        PreparedStatement checkUsernameStmt = conn.prepareStatement(checkUsernameQuery);
        checkUsernameStmt.setString(1, user.getText());
        ResultSet usernameResult = checkUsernameStmt.executeQuery();

        if (usernameResult.next()) {
            JOptionPane.showMessageDialog(null, "Username already exists. Please choose another username.");
            return; // Stop further execution
        }       
                 // Validate account number, phone, and date of birth fields
        if (!accnum.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Account Number should only contain numbers.");
            return; // Stop further execution
        }
        if (!idnum.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Your ID should only contain numbers.");
            return; // Stop further execution
        }
        // Validate email format
        if (!email.getText().matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
    JOptionPane.showMessageDialog(null, "Invalid Email Format. Please enter a valid email.");
    return; // Stop further execution
}


        if (!phone.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Phone Number should only contain numbers.");
            return; // Stop further execution
        }
        // Validate date of birth for age over 18 years
        java.util.Date currentDate = new java.util.Date();
        java.util.Date dobDate = java.sql.Date.valueOf(dob.getText());

        long diffInMillis = currentDate.getTime() - dobDate.getTime();
        long ageInMillis = 18L * 365 * 24 * 60 * 60 * 1000; // Milliseconds for 18 years

        if (diffInMillis < ageInMillis) {
            JOptionPane.showMessageDialog(null, "You must be 18 years or older to register.");
            return; // Stop further execution
        }   
        
        
        
        

        if (!dob.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(null, "Date of Birth should be in YYYY-MM-DD format.");
            return; // Stop further execution
        }
        
        
        // Validate length of ID number, account number, phone, username, and password fields
        if (idnum.getText().length() < 7 || accnum.getText().length() < 7 || phone.getText().length() != 11 ||
            user.getText().length() < 6 || pass.getText().length() < 6) {
            JOptionPane.showMessageDialog(null, "Please ensure:\n" +
                    "ID Number and Account Number are 7 digits.\n" +
                    "Phone Number is exactly 11 digits.\n" +
                    "Username and Password are more than 5 characters.");
            return; // Stop further execution
        }

        // Validate email format
        // Validate date of birth for age over 18 years
        // Check if the username already exists in the database
        
              String sql = "insert into registernow values (?,?,?,?,?,?,?,?)";
              String sql1="insert into login values(?,?)";
              PreparedStatement ptstmt = conn.prepareStatement(sql);
              PreparedStatement ptstmt1 = conn.prepareStatement(sql1);
              ptstmt.setString(1, idtype.getText());
              ptstmt.setString(2, idnum.getText());
              ptstmt.setString(3, accnum.getText());
              ptstmt.setString(4, email.getText());
              ptstmt.setString(5, phone.getText());
              ptstmt.setString(6, dob.getText());
              ptstmt.setString(7, user.getText());
              ptstmt.setString(8, pass.getText());
              
              
              ptstmt.executeUpdate();
              
              ptstmt1.setString(1, user.getText());
              ptstmt1.setString(2, pass.getText());
              
              ptstmt1.executeUpdate();
              
                    
                JOptionPane.showMessageDialog(null, "Account Registered successfully");
              
              conn.close();
            }
            catch(Exception e){
                e.printStackTrace();
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
    
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registernow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnum;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idnum;
    private javax.swing.JTextField idtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
