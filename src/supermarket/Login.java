package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.jdbc.EmbeddedDriver;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Uid = new javax.swing.JTextField();
        RoleCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        forgot = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/dribble_cart.gif"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("In Quality");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ideal Point");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("We Believe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel2.setText("PASSWORD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        Uid.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UidActionPerformed(evt);
            }
        });
        jPanel2.add(Uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 280, 40));

        RoleCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RoleCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller" }));
        RoleCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleCbActionPerformed(evt);
            }
        });
        jPanel2.add(RoleCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 280, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, 50));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel4.setText("USERNAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, 48));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel5.setText("SELECT ROLE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 243, 30));

        forgot.setBackground(new java.awt.Color(0, 0, 0));
        forgot.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        forgot.setForeground(new java.awt.Color(255, 255, 255));
        forgot.setText("Forgot Password");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
        });
        jPanel2.add(forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 240, 52));

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 162, 52));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 286, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 160, -1, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 150));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 280, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel13.setText("x");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RoleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleCbActionPerformed

    private void UidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UidActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked

        if (RoleCb.getSelectedItem().toString().equals("Seller")) {
            String Query = "Select * from APP.SELLERTBL where SELLNAME='" + Uid.getText() + "'and SELLPASS='" + password.getText() + "'";
            try {
                DriverManager.registerDriver(new EmbeddedDriver());
                Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if (Rs.next()) {
                    new Selling().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong Seller Id or Password");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            String Query = "Select * from APP.ADMINTBL where ADMINNAME='" + Uid.getText() + "'and ADMINPASS='" + password.getText() + "'";
            try {
                DriverManager.registerDriver(new EmbeddedDriver());
                Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
                St = Con.createStatement();
                Rs = St.executeQuery(Query);
                if (Rs.next()) {
                    new Product().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong Admin Id or Password");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        new Reset().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgotMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RoleCb;
    private javax.swing.JTextField Uid;
    private javax.swing.JButton forgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
