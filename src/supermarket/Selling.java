package supermarket;

import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Utilities;
import net.proteanit.sql.DbUtils;
import org.apache.derby.jdbc.EmbeddedDriver;

public class Selling extends javax.swing.JFrame {
    String format;
    public Selling() {
        initComponents();
        delete.setVisible(false);
        Printbtn.setVisible(false);
        format=BillTxt.getText();
        CatCb.setSelectedItem("All");
        SelectSeller();
        GetCat();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        CatCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        FilterBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Grdtotallbl = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Printbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        Grdtotallbl1 = new javax.swing.JLabel();
        find = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("PRODUCTS LIST");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 57, -1, 50));

        ProdName.setEditable(false);
        ProdName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });
        jPanel2.add(ProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 280, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("PRODUCT");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 22));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("BILLID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 119, -1, 25));

        BillId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIdActionPerformed(evt);
            }
        });
        jPanel2.add(BillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, -1));

        CatCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        CatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatCbMouseClicked(evt);
            }
        });
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });
        jPanel2.add(CatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 113, 200, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("QUANTITY");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 15));

        ProdQty.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });
        jPanel2.add(ProdQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 280, -1));

        FilterBtn.setBackground(new java.awt.Color(0, 0, 0));
        FilterBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(255, 255, 255));
        FilterBtn.setText("Filter");
        FilterBtn.setFocusPainted(false);
        FilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterBtnMouseClicked(evt);
            }
        });
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });
        jPanel2.add(FilterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        ClearBtn.setBackground(new java.awt.Color(0, 0, 0));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Clear");
        ClearBtn.setFocusPainted(false);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel4.setText("BILLING POINT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 0, -1, 50));

        ProductTable.setBackground(new java.awt.Color(240, 240, 240));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 181, 515, 130));

        AddBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText(" Add to Bill");
        AddBtn.setFocusPainted(false);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete Last Item");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 300, -1));

        Grdtotallbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Grdtotallbl.setText("Rs 0");
        jPanel2.add(Grdtotallbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, -1, 24));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setFocusPainted(false);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 120, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/billing final.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        Printbtn.setBackground(new java.awt.Color(0, 0, 0));
        Printbtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Printbtn.setForeground(new java.awt.Color(255, 255, 255));
        Printbtn.setText("Print");
        Printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintbtnMouseClicked(evt);
            }
        });
        jPanel2.add(Printbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 121, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setAutoscrolls(true);

        BillTxt.setEditable(false);
        BillTxt.setBackground(new java.awt.Color(255, 255, 255));
        BillTxt.setColumns(70);
        BillTxt.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        BillTxt.setRows(15);
        BillTxt.setTabSize(4);
        BillTxt.setText("\n           ==========IDEAL POINT===========\n\nSR NO.\t  PRODUCT          PRICE      QUANTITY     TOTAL\n\n");
        BillTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(BillTxt);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 550, 250));

        Grdtotallbl1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Grdtotallbl1.setText("Grand Total :");
        jPanel2.add(Grdtotallbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 150, 24));

        find.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jPanel2.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 30));

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.setFocusPainted(false);
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 2, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/logout.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(341, 341, 341))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SelectSeller() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            St = Con.createStatement();
            String sql = "Select * from APP.PRODUCTTBL";
            if(CatCb.getSelectedItem().toString().equals("Custom")) {
                sql = "Select * from APP.PRODUCTTBL Where PRODNAME Like '%" + find.getText()+"%'";
            }
            Rs = St.executeQuery(sql);
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int prodid, newQty;
    String prod;

    public void Update() {
        newQty = AvailQty - Integer.parseInt(ProdQty.getText());
        AvailQty = newQty;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            String Query = "Update APP.PRODUCTTBL set PRODQTY=" + newQty + "" + "where PRODID=" + prodid;
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            SelectSeller();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GetCat() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            St = Con.createStatement();
            String query = "Select * from APP.CATEGORYTBL";
            Rs = St.executeQuery(query);
            while (Rs.next()) {
                String Mycat = Rs.getString("CATNAME");
                CatCb.addItem(Mycat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        CatCb.addItem("Custom");
    }
    private void BillIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIdActionPerformed

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked

        String sql = "Select * from APP.PRODUCTTBL where PRODCAT='" + CatCb.getSelectedItem().toString() + "'";
        if(CatCb.getSelectedItem().toString().equals("All")) {
            sql = "Select * from APP.PRODUCTTBL";
        }
        else if(CatCb.getSelectedItem().toString().equals("Custom")) {
            sql = "Select * from APP.PRODUCTTBL Where PRODNAME= '" + find.getText()+"'";
        }
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery(sql);
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_FilterBtnMouseClicked

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        BillId.setText("");
        ProdName.setText("");
        //ProdPrice.setText("");
        ProdQty.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    Double price, ProdTot = 0.0, GrdTotal = 0.0;
    int AvailQty;
    int Myindex;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        Myindex = ProductTable.getSelectedRow();
        prodid= Integer.parseInt(model.getValueAt(Myindex, 0).toString());
        prod = model.getValueAt(Myindex, 1).toString();
        AvailQty = Integer.parseInt(model.getValueAt(Myindex, 2).toString());

        ProdName.setText(prod);
        price = Double.valueOf(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed

    }//GEN-LAST:event_ProdNameActionPerformed

    int i=0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if (ProdQty.getText().isEmpty() || ProdName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else if (AvailQty < Integer.valueOf(ProdQty.getText())) {
            JOptionPane.showMessageDialog(this, "Not Enough In Stock");
        } else {
            i++;
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            
            StringBuilder sr=new StringBuilder(String.valueOf(i));
            while(sr.length()<7) {
                sr.append(' ');
            }
            StringBuilder pro = new StringBuilder(prod);
            while(pro.length()<20) {
                pro.append(' ');
            }
            StringBuilder pri= new StringBuilder(String.valueOf(price));
            while(pri.length()< 12) {
                pri.append(' ');
            }
            StringBuilder qty = new StringBuilder(ProdQty.getText());
            while(qty.length() < 12) {
                qty.append(' ');
            }
            
            double total = price * Double.parseDouble(ProdQty.getText());
            
            String out = sr.toString() + pro.toString() + pri.toString() + qty.toString() + String.valueOf(total) +"\n";
            
            BillTxt.append(out);
            GrdTotal+=total;
            Grdtotallbl.setText("Rs " + GrdTotal);
            delete.setVisible(true);
            Printbtn.setVisible(true);
            Update();
        }
      
    }//GEN-LAST:event_AddBtnMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Con = DriverManager.getConnection("jdbc:derby:C:\\Users\\mahes\\Documents\\Derby\\Database\\SuperMarketdb", "User1", "1234");
            int ind = BillTxt.getLineCount()-2;
            int start=BillTxt.getLineStartOffset(ind);
            int end = BillTxt.getLineEndOffset(ind);
            
            String name = BillTxt.getText(start, end-start).substring(7,27).trim();
            int qty = Integer.parseInt(BillTxt.getText(start, end-start).substring(39,51).trim());
            double cost =Double.parseDouble(BillTxt.getText(start, end-start).substring(51,end-start).trim());
            String get ="select prodqty from APP.PRODUCTTBL where prodname = '"+name+"'";
            St=Con.createStatement();
            Rs=St.executeQuery(get);
            if(Rs.next()) {
                qty += Rs.getInt(1);
            }
            PreparedStatement update = Con.prepareStatement("Update APP.PRODUCTTBL set prodqty =? where prodname = ?");
            update.setInt(1, (int)qty);
            update.setString(2, name);
            update.executeUpdate();
            SelectSeller();
            
            GrdTotal = GrdTotal - cost;
            Grdtotallbl.setText("Rs " + GrdTotal);
            BillTxt.replaceRange("", start, end);
            --i;
            if(i==0) {
                delete.setVisible(false);
                Printbtn.setVisible(false);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
                Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void CatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatCbMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CatCbMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        CatCb.setSelectedItem("Custom");
        SelectSeller();
        find.setText("");
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void PrintbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintbtnMouseClicked
        String prev = BillTxt.getText();
        try {
          String s="=========================================================\n                     Grand Total: "+Grdtotallbl.getText();
          BillTxt.append(s);
          if(BillTxt.print()) {
              BillTxt.setText(format);
              i=0;
          }
          else {
              BillTxt.setText(prev);
          }
        } catch (PrinterException ex) {
            BillTxt.setText(prev);
            Logger.getLogger(Selling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintbtnMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
        CatCb.setSelectedItem("All");
        SelectSeller();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JLabel Grdtotallbl;
    private javax.swing.JLabel Grdtotallbl1;
    private javax.swing.JButton Printbtn;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton delete;
    private javax.swing.JTextField find;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables

    private String newQty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
