
package banking.system;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class instantpayment extends javax.swing.JFrame {

   
    public instantpayment() {
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
        toacc = new javax.swing.JTextField();
        account = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        purpose = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        note = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INSTANT PAYMENT");

        jLabel2.setText("To Account");

        jLabel3.setText("From Account Number");

        jLabel4.setText("Amount");

        jLabel5.setText("Purpose");

        jLabel6.setText("Payee Email");

        jLabel7.setText("Payee Mobile");

        jLabel8.setText("Note");

        toacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toaccActionPerformed(evt);
            }
        });

        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("<BACK");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2))
                                    .addGap(75, 75, 75)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(toacc)
                                        .addComponent(account, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(amount)
                                        .addComponent(purpose)
                                        .addComponent(email)
                                        .addComponent(mobile)
                                        .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(toacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        

    String toAccount = toacc.getText();
    String fromAccount = account.getText();
    String amnt = amount.getText();
    String purposeText = purpose.getText();
    String emailText = email.getText();
    String mobileText = mobile.getText();
    String noteText = note.getText();
    
    if (amnt.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter the amount.");
    return;
}


    try {
        int amntInt = Integer.parseInt(amnt);

        if (toAccount.isEmpty() || fromAccount.isEmpty() || amnt.isEmpty()
                || purposeText.isEmpty() || emailText.isEmpty()
                || mobileText.isEmpty() || noteText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        String[] fieldsToCheck = {fromAccount, amnt, purposeText, mobileText, noteText};
        for (String field : fieldsToCheck) {
            if (!field.matches("[a-zA-Z0-9 ]+")) {
                JOptionPane.showMessageDialog(null, "Special characters are not allowed.");
                return;
            }
        }

        if (!emailText.contains("@")) {
            JOptionPane.showMessageDialog(null, "Invalid email format.");
            return;
        }
        if (toAccount.equals(fromAccount)) {
    JOptionPane.showMessageDialog(null, "Can't transfer funds to the same account!");
    return;
}
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "");

        String checkToAccountSQL = "SELECT * FROM account WHERE accountnumber=?";
        try (PreparedStatement checkToAccountStmt = conn.prepareStatement(checkToAccountSQL)) {
            checkToAccountStmt.setString(1, toAccount);
            try (ResultSet toAccountResultSet = checkToAccountStmt.executeQuery()) {
                if (toAccountResultSet.next()) {
                    String fetchBalanceSQL = "SELECT accountbalance FROM account WHERE accountnumber=?";
                    try (PreparedStatement fetchBalanceStmt = conn.prepareStatement(fetchBalanceSQL)) {
                        fetchBalanceStmt.setString(1, fromAccount);
                        try (ResultSet rs = fetchBalanceStmt.executeQuery()) {
                            if (rs.next()) {
                                int currentBalance = rs.getInt("accountbalance");
                                if (currentBalance < amntInt) {
                                    JOptionPane.showMessageDialog(null, "Not enough money in your account. Your current balance is: " + currentBalance);
                                    return;
                                }

                                int newBalance = currentBalance - amntInt;

                                String updateBalanceSQL = "UPDATE account SET accountbalance=? WHERE accountnumber=?";
                                try (PreparedStatement updateBalanceStmt = conn.prepareStatement(updateBalanceSQL)) {
                                    updateBalanceStmt.setInt(1, newBalance);
                                    updateBalanceStmt.setString(2, fromAccount);
                                    updateBalanceStmt.executeUpdate();
                                }

                                int currentBalanceTo = toAccountResultSet.getInt("accountbalance");
                                int newBalanceTo = currentBalanceTo + amntInt;

                                String updateToBalanceSQL = "UPDATE account SET accountbalance=? WHERE accountnumber=?";
                                try (PreparedStatement updateToBalanceStmt = conn.prepareStatement(updateToBalanceSQL)) {
                                    updateToBalanceStmt.setInt(1, newBalanceTo);
                                    updateToBalanceStmt.setString(2, toAccount);
                                    updateToBalanceStmt.executeUpdate();
                                }

                                String insertPaymentSQL = "INSERT INTO instantpay (bankname, account, amount, purpose, email, phone, note) VALUES (?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement insertPaymentStmt = conn.prepareStatement(insertPaymentSQL)) {
                                    insertPaymentStmt.setString(1, toAccount);
                                    insertPaymentStmt.setString(2, fromAccount);
                                    insertPaymentStmt.setString(3, amnt);
                                    insertPaymentStmt.setString(4, purposeText);
                                    insertPaymentStmt.setString(5, emailText);
                                    insertPaymentStmt.setString(6, mobileText);
                                    insertPaymentStmt.setString(7, noteText);
                                    insertPaymentStmt.executeUpdate();
                                }

                                JOptionPane.showMessageDialog(null, "Amount has been transferred successfully!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Sender account invalid.");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Receiver's account does not exist!");
                }
            }
        }
        conn.close();
    } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
        e.printStackTrace(); // Print stack trace for debugging purposes
        JOptionPane.showMessageDialog(null, "Error while processing payment! " + e.getMessage());
    }


         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        
        dashboard obj =new dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void toaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toaccActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instantpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instantpayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField note;
    private javax.swing.JTextField purpose;
    private javax.swing.JTextField toacc;
    // End of variables declaration//GEN-END:variables
}
