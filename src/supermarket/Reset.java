/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import org.apache.derby.jdbc.EmbeddedDriver;
import javax.swing.JOptionPane;

public class Reset extends javax.swing.JFrame {

    public Reset() {
        initComponents();
    }

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

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
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        otp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RoleCb = new javax.swing.JComboBox<>();
        mobile = new javax.swing.JTextField();
        exit = new javax.swing.JLabel();

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
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel2.setText("MOBILE NUMBER");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        username.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 280, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("RESET PASSWORD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 300, 50));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel4.setText("USERNAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 170, 48));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel5.setText("SELECT ROLE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 40));

        otp.setBackground(new java.awt.Color(0, 0, 0));
        otp.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        otp.setForeground(new java.awt.Color(255, 255, 255));
        otp.setText("Get OTP");
        otp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otpMouseEntered(evt);
            }
        });
        jPanel2.add(otp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 240, 52));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 286, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 160, -1, -1));

        RoleCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RoleCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller" }));
        RoleCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleCbActionPerformed(evt);
            }
        });
        jPanel2.add(RoleCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 280, 40));

        mobile.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileKeyPressed(evt);
            }
        });
        jPanel2.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 280, 40));

        exit.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void otpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpMouseClicked

        int otp = (int) (Math.random() * (999999 - 100000 + 1) + 100000);
        String message = "Your Ideal Point otp is " + otp + " Don't share your otp with anyone";
        String phone = mobile.getText();
        String name = username.getText();
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            PreparedStatement Query = null;
            if(RoleCb.getSelectedItem().toString().equals("Seller")) {
                Query=con.prepareStatement("Select * from APP.SELLERTBL where sellname = ? and mobileno = ?");
            }
            else {
               Query=con.prepareStatement("Select * from APP.ADMINTBL where adminname = ? and mobileno = ?"); 
            }
            Query.setString(1, name);
            Query.setLong(2, Long.parseLong(phone));
            rs = Query.executeQuery();
            if(rs.next()) {
               sendOtp(message,phone,otp);
            }
            else {
                JOptionPane.showMessageDialog(this, "No User Found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_otpMouseClicked

    private void otpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_otpMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void RoleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleCbActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void mobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && mobile.getText().length() < 10 || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            mobile.setEditable(true);
        } else if (mobile.getText().length() == 10) {
            mobile.setEditable(false);
            JOptionPane.showMessageDialog(this, "only 10 Digits Allowed!");
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                mobile.setEditable(true);
            }
        } else {
            mobile.setEditable(false);
            JOptionPane.showMessageDialog(this, "Only Digits between (0-9) Allowed!");
            mobile.setEditable(true);
        }
    }//GEN-LAST:event_mobileKeyPressed

    public void sendOtp(String message,String phone,int otp) {
        try {
//            message = URLEncoder.encode(message, "UTF-8");
            String apiKey = "";
            String otpUrl = "";
            System.out.println(otpUrl);
            URL url = new URL(otpUrl);
            HttpsURLConnection net = (HttpsURLConnection)url.openConnection();
            
            net.setRequestMethod("GET");
            net.setRequestProperty("User-Agent", "Mozilla/5.0");
            net.setRequestProperty("cache-control", "no-cache");
            
            int code = net.getResponseCode();
            if(code == 200) {
                JOptionPane.showMessageDialog(this, "OTP Sent Successfully To Mobile Number "+mobile.getText());
                new UpdatePassword(RoleCb.getSelectedItem().toString(),mobile.getText(),username.getText(),otp).setVisible(true);
                this.dispose();
            }    
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, "encoding unsupported", ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, "Invalid URL", ex);
        } catch (IOException ex) {
            Logger.getLogger(Reset.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RoleCb;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobile;
    private javax.swing.JButton otp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
