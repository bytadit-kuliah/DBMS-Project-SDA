/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;



/**
 *
 * @author USER
 */
public class OPERATOR extends javax.swing.JFrame {

    /**
     * Creates new form OPERATOR
     */
    public OPERATOR() {
        initComponents();
        Connect();
        TabelOperator();
        TabelProvinsi();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        KdOperator = new javax.swing.JTextField();
        NmOperator = new javax.swing.JTextField();
        FcSektor = new javax.swing.JTextField();
        FcProduksi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtprovinsi = new javax.swing.JComboBox<>();
        tipeoperator = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelOperator = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA OPERATOR SDA");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kode Operator");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama Operator");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fokus Sektor");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fokus Produksi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lokasi Operasi");

        KdOperator.setActionCommand("<Not Set>");
        KdOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KdOperatorActionPerformed(evt);
            }
        });

        NmOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NmOperatorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipe Operator");

        txtprovinsi.setMaximumRowCount(5);
        txtprovinsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprovinsiActionPerformed(evt);
            }
        });

        tipeoperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeoperatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(KdOperator, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(NmOperator, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(tipeoperator, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FcProduksi, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(FcSektor, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(txtprovinsi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(FcSektor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KdOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NmOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(FcProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtprovinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipeoperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        TabelOperator.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TabelOperator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Operator", "Kode Provinsi", "Nama Operator", "Tipe Operator", "Fokus Sektor", "Fokus Produksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelOperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelOperatorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelOperator);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Back To Menu");

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(421, 421, 421))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://192.168.43.36:1433;databaseName=SDAIndo"; /*jadi ip address*/
    String user = "bytadit";
    String password = "bytadit123";
    
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs; 
    
    public void Connect()
    {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(OPERATOR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void TabelOperator()
    {
        try {
            pst = con.prepareStatement("SELECT * FROM OPERATOR");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData RSM = rs.getMetaData();
            int c;
            c = RSM.getColumnCount();
            
            DefaultTableModel DF = (DefaultTableModel)TabelOperator.getModel();
            DF.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i = 1; i <= c; i++)
                {
                    v2.add(rs.getString("Kode_Operator"));
                    v2.add(rs.getString("Kode_Provinsi"));
                    v2.add(rs.getString("Nama_Operator"));
                    v2.add(rs.getString("Tipe_Operator"));
                    v2.add(rs.getString("Fokus_Sektor"));
                    v2.add(rs.getString("Fokus_Produksi"));
                }
                DF.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(OPERATOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void TabelProvinsi()
    {
        try {
            tipeoperator.addItem("BUMN");
            tipeoperator.addItem("BUMD");
            tipeoperator.addItem("BUMS");
            pst = con.prepareStatement("SELECT * FROM PROVINSI");
            ResultSet rs = pst.executeQuery();
            
            txtprovinsi.removeAllItems(); 
            while(rs.next())
            {
                txtprovinsi.addItem(rs.getString(2));
            }
        }catch(SQLException ex){
            Logger.getLogger(OPERATOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void NmOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NmOperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NmOperatorActionPerformed

    private void KdOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KdOperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KdOperatorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String Kode_Opr = KdOperator.getText();
        String Nama_Opr = NmOperator.getText();
        String Tipe_Opr = tipeoperator.getSelectedItem().toString();
        String Fokus_Str = FcSektor.getText();
        String Fokus_Prd = FcProduksi.getText();
        String Lokasi_Opr = txtprovinsi.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("INSERT INTO OPERATOR SELECT ? AS Kode_Operator, Kode_Provinsi,? AS Nama_Operator,? AS Tipe_Operator,? AS Fokus_Sektor,? AS Fokus_Produksi FROM PROVINSI WHERE Nama_Provinsi = ?");
            pst.setString(1, Kode_Opr);
            pst.setString(2, Nama_Opr);
            pst.setString(3, Tipe_Opr);
            pst.setString(4, Fokus_Str);
            pst.setString(5, Fokus_Prd);
            pst.setString(6, Lokasi_Opr);
            
            int k = pst.executeUpdate();
            
            if (k==1)
            {
                JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
                KdOperator.setText("");
                NmOperator.setText("");
                tipeoperator.setSelectedItem("");
                FcSektor.setText("");
                FcProduksi.setText("");
                txtprovinsi.setSelectedItem("");
                KdOperator.requestFocus();
                TabelOperator();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Data Gagal Ditambahkan");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(OPERATOR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelOperatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelOperatorMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dl = (DefaultTableModel)TabelOperator.getModel();
        
        int SelectIndex = TabelOperator.getSelectedRow();
        
        
        
        KdOperator.setText(dl.getValueAt(SelectIndex, 0).toString());
        NmOperator.setText(dl.getValueAt(SelectIndex, 2).toString());
        tipeoperator.setSelectedItem(dl.getValueAt(SelectIndex, 3).toString());
        FcSektor.setText(dl.getValueAt(SelectIndex, 4).toString());
        FcProduksi.setText(dl.getValueAt(SelectIndex, 5).toString());
        txtprovinsi.setSelectedItem(dl.getValueAt(SelectIndex, 1).toString());
        
        jButton1.setEnabled(false);
        
    }//GEN-LAST:event_TabelOperatorMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        
        DefaultTableModel dl = (DefaultTableModel)TabelOperator.getModel();
        int SelectIndex = TabelOperator.getSelectedRow();
        
        String Kode_Opr = KdOperator.getText();
        String Nama_Opr = NmOperator.getText();
        String Tipe_Opr = tipeoperator.getSelectedItem().toString();
        String Fokus_Str = FcSektor.getText();
        String Fokus_Prd = FcProduksi.getText();
        String Lokasi_Opr = txtprovinsi.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("UPDATE OPERATOR SET Nama_Operator = ?, Kode_Provinsi = (SELECT Kode_Provinsi FROM PROVINSI WHERE Nama_Provinsi = ?), Tipe_Operator = ?, Fokus_Sektor = ?, Fokus_Produksi = ? WHERE Kode_Operator = ?");
            
            pst.setString(1, Nama_Opr);
            pst.setString(2, Lokasi_Opr);
            pst.setString(3, Tipe_Opr);
            pst.setString(4, Fokus_Str);
            pst.setString(5, Fokus_Prd);
            pst.setString(6, Kode_Opr);
            
            int k = pst.executeUpdate();
            
            if (k==1)
            {
                JOptionPane.showMessageDialog(this,"Data Berhasil Diperbarui");
                KdOperator.setText("");
                NmOperator.setText("");
                tipeoperator.setSelectedItem("");
                FcSektor.setText("");
                FcProduksi.setText("");
                txtprovinsi.setSelectedItem("");
                KdOperator.requestFocus();
                TabelOperator();
                jButton1.setEnabled(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Data Gagal Diperbarui");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(OPERATOR.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        DefaultTableModel dl = (DefaultTableModel)TabelOperator.getModel();
        int SelectIndex = TabelOperator.getSelectedRow();
        
        String Kode_Opr = KdOperator.getText();
        
        try {
            pst = con.prepareStatement("DELETE FROM OPERATOR WHERE Kode_Operator = ?");
            
            pst.setString(1, Kode_Opr);
            
            int k = pst.executeUpdate();
            
            if (k==1)
            {
                JOptionPane.showMessageDialog(this,"Data Berhasil Dihapus");
                KdOperator.setText("");
                NmOperator.setText("");
                tipeoperator.setSelectedItem("");
                FcSektor.setText("");
                FcProduksi.setText("");
                txtprovinsi.setSelectedItem("");
                KdOperator.requestFocus();
                TabelOperator();
                jButton1.setEnabled(true);
                KdOperator.setEnabled(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Data Gagal Dihapus");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(OPERATOR.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add yo        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                KdOperator.setText("");
                NmOperator.setText("");
                tipeoperator.setSelectedItem("");
                FcSektor.setText("");
                FcProduksi.setText("");
                txtprovinsi.setSelectedItem("");
                KdOperator.requestFocus();
                jButton1.setEnabled(true);
                TabelOperator();
                
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtprovinsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprovinsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprovinsiActionPerformed

    private void tipeoperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeoperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipeoperatorActionPerformed

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
            java.util.logging.Logger.getLogger(OPERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPERATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPERATOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FcProduksi;
    private javax.swing.JTextField FcSektor;
    private javax.swing.JTextField KdOperator;
    private javax.swing.JTextField NmOperator;
    private javax.swing.JTable TabelOperator;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tipeoperator;
    private javax.swing.JComboBox<String> txtprovinsi;
    // End of variables declaration//GEN-END:variables

}
