/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author acer
 */
public class regis extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    /**
     * Creates new form regis
     */
    public regis() {
        initComponents();
        refreshTable();
        k.connect();
    }
    
    class regist extends regis{
        int id_user, id_level;
        String usernamex, passwordd, nama_user;
        
        public regist() {
            usernamex = inputuser.getText();
            passwordd= inputpw.getText();
            nama_user = inputnama.getText();
            id_level = Integer.parseInt(inputlvl.getSelectedItem().toString());
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("ID USER");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("NAMA USER");
        model.addColumn("ID LEVEL");
        tableregis.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("select * from regist");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data ={
                    rs.getString("id_user"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nama_user"),
                    rs.getString("id_level")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        inputid.setText("");
        inputuser.setText("");
        inputpw.setText("");
        inputnama.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        regis = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        inputlevel = new javax.swing.JLabel();
        inputid = new javax.swing.JTextField();
        inputuser = new javax.swing.JTextField();
        inputpw = new javax.swing.JTextField();
        inputnama = new javax.swing.JTextField();
        inputlvl = new javax.swing.JComboBox<>();
        input = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableregis = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regis.setText("REGISTRASI");

        id.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        id.setText("ID USER");

        username.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        username.setText("USERNAME");

        pw.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pw.setText("PASSWORD");

        user.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        user.setText("NAMA USER");

        inputlevel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        inputlevel.setText("ID LEVEL");

        inputid.setEnabled(false);

        inputuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputuserActionPerformed(evt);
            }
        });

        inputlvl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        input.setText("INPUT");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        tableregis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableregis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableregisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableregis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(regis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addComponent(username)
                                    .addComponent(pw)
                                    .addComponent(user)
                                    .addComponent(inputlevel)
                                    .addComponent(input))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputid)
                                            .addComponent(inputuser)
                                            .addComponent(inputpw)
                                            .addComponent(inputnama)
                                            .addComponent(inputlvl, 0, 343, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete)))))))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regis)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id)
                    .addComponent(inputid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(inputuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw)
                    .addComponent(inputpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(inputnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputlevel)
                    .addComponent(inputlvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input)
                    .addComponent(update)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
        try {
            regist r = new regist();
            this.stat = k.getCon().prepareStatement("insert into regist values(?,?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, r.usernamex);
            stat.setString(3, r.passwordd);
            stat.setString(4, r.nama_user);
            stat.setInt(5, r.id_level);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_inputActionPerformed

    private void tableregisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableregisMouseClicked
        // TODO add your handling code here:
        inputid.setText(model.getValueAt(tableregis.getSelectedRow(), 0).toString());
        inputuser.setText(model.getValueAt(tableregis.getSelectedRow(), 1).toString());
        inputpw.setText(model.getValueAt(tableregis.getSelectedRow(), 2).toString());
        inputnama.setText(model.getValueAt(tableregis.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tableregisMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            regist r = new regist();
            this.stat = k.getCon().prepareStatement("update regist set username=?,password=?,nama_user=?,id_level=? where id_user=?");
            stat.setInt(1, 0);
            stat.setString(2, r.usernamex);
            stat.setString(3, r.passwordd);
            stat.setString(4, r.nama_user);
            stat.setInt(5, r.id_level);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            regist r = new regist();
            this.stat = k.getCon().prepareStatement("delete from regist where id_user=?");
            stat.setInt(1, r.id_user);
            stat.executeUpdate();
            refreshTable();
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void inputuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputuserActionPerformed

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
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel id;
    private javax.swing.JButton input;
    private javax.swing.JTextField inputid;
    private javax.swing.JLabel inputlevel;
    private javax.swing.JComboBox<String> inputlvl;
    private javax.swing.JTextField inputnama;
    private javax.swing.JTextField inputpw;
    public javax.swing.JTextField inputuser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pw;
    private javax.swing.JLabel regis;
    private javax.swing.JTable tableregis;
    private javax.swing.JButton update;
    private javax.swing.JLabel user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}