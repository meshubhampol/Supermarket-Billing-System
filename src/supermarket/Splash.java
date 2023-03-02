package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.EmbeddedDriver;

public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Precentage = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Precentage.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Precentage.setForeground(new java.awt.Color(255, 255, 255));
        Precentage.setText("%");
        jPanel1.add(Precentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 100, 40));
        jPanel1.add(Myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1100, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IDEAL POINT SUPERMARKET");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 550, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/dribble_cart.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 370, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
            con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            st=con.createStatement();
            String Query = "Select * from APP.ADMINTBL";
            rs= st.executeQuery(Query);
            if(rs.next()) {
                new Login().setVisible(true);
            }
            else {
               new Register().setVisible(true);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        Splash Mysplash = new Splash();
        Mysplash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                Mysplash.Myprogress.setValue(i);
                Mysplash.Precentage.setText(Integer.toString(i) + "%");
            }

        } catch (Exception e) {

        }

        Mysplash.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel Precentage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
