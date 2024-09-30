/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barang1;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class list_barang extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    /**
     * Creates new form listbarang
     */
    public list_barang() {
        initComponents();
        k.connect();
        refreshTabel();
    }
    
    class listbarang extends list_barang{
        int id_barang, jumlah_barang;
        String nama_barang, jenis_barang, status_barang, tanggal_masuk_barang;
        
        public listbarang() {
            this.nama_barang = textnamabarang.getText();
            this.jenis_barang = textjenisbarang.getText();
            this.jumlah_barang = Integer.parseInt(textjumlahbarang.getText());
            this.status_barang = combostatusbarang.getSelectedItem().toString();
            try {
                Date date = kalendermasuk.getDate();
                DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
                this.tanggal_masuk_barang = dateformat.format(date);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        
    }
    
    public void refreshTabel(){
        model = new DefaultTableModel();
        model.addColumn("Id Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Jumlah Barang");
        model.addColumn("Status Barang");
        model.addColumn("Tanggal Masuk Barang");
        tablebarang.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("select * from listbarang");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {
                Object[] data={
                    rs.getInt("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("jenis_barang"),
                    rs.getInt("jumlah_barang"),
                    rs.getString("status_barang"),
                    rs.getString("tanggal_masuk_barang")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        textidbarang.setText("");
        textnamabarang.setText("");
        textjenisbarang.setText("");
        textjumlahbarang.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambahdatabarang = new javax.swing.JLabel();
        idbarang = new javax.swing.JLabel();
        textidbarang = new javax.swing.JTextField();
        namabarang = new javax.swing.JLabel();
        textnamabarang = new javax.swing.JTextField();
        jenisbarang = new javax.swing.JLabel();
        textjenisbarang = new javax.swing.JTextField();
        jumlahbarang = new javax.swing.JLabel();
        textjumlahbarang = new javax.swing.JTextField();
        statusbarang = new javax.swing.JLabel();
        combostatusbarang = new javax.swing.JComboBox<>();
        tanggalmasukbarang = new javax.swing.JLabel();
        kalendermasuk = new com.toedter.calendar.JDateChooser();
        input = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tambahdatabarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tambahdatabarang.setText("TAMBAH DATA BARANG");

        idbarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        idbarang.setText("Id barang");

        textidbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidbarangActionPerformed(evt);
            }
        });

        namabarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        namabarang.setText("Nama Barang");

        jenisbarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jenisbarang.setText("Jenis Barang");

        jumlahbarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jumlahbarang.setText("Jumlah Barang");

        statusbarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusbarang.setText("Status Barang");

        combostatusbarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Tidak Tersedia" }));

        tanggalmasukbarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tanggalmasukbarang.setText("Tanggal Masuk Barang");

        input.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        input.setText("INPUT");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        tablebarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablebarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablebarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(tambahdatabarang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(input)
                        .addGap(132, 132, 132)
                        .addComponent(update)
                        .addGap(137, 137, 137)
                        .addComponent(delete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idbarang)
                                    .addComponent(namabarang)
                                    .addComponent(jenisbarang)
                                    .addComponent(jumlahbarang)
                                    .addComponent(statusbarang)
                                    .addComponent(tanggalmasukbarang))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textidbarang)
                                    .addComponent(textnamabarang)
                                    .addComponent(textjenisbarang)
                                    .addComponent(textjumlahbarang)
                                    .addComponent(combostatusbarang, 0, 646, Short.MAX_VALUE)
                                    .addComponent(kalendermasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tambahdatabarang)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idbarang)
                    .addComponent(textidbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namabarang)
                    .addComponent(textnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisbarang)
                    .addComponent(textjenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahbarang)
                    .addComponent(textjumlahbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusbarang)
                    .addComponent(combostatusbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggalmasukbarang)
                    .addComponent(kalendermasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update)
                        .addComponent(delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
        try {
            listbarang l = new listbarang();
            this.stat = k.getCon().prepareStatement("insert into listbarang values(?,?,?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, l.nama_barang);
            stat.setString(3, l.jenis_barang);
            stat.setInt(4, l.jumlah_barang);
            stat.setString(5, l.status_barang);
            stat.setString(6, l.tanggal_masuk_barang);
            stat.executeUpdate();
            refreshTabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_inputActionPerformed

    private void tablebarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebarangMouseClicked
        // TODO add your handling code here:
        textidbarang.setText(model.getValueAt(tablebarang.getSelectedRow(), 0).toString());
        textnamabarang.setText(model.getValueAt(tablebarang.getSelectedRow(), 1).toString());
        textjenisbarang.setText(model.getValueAt(tablebarang.getSelectedRow(), 2).toString());
        textjumlahbarang.setText(model.getValueAt(tablebarang.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tablebarangMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            listbarang l = new listbarang();
            this.stat = k.getCon().prepareStatement("update listbarang set nama_barang=?,"
                    + "jenis_barang=?,jumlah_barang=?,status_barang=?,tanggal_masuk_barang=? where id_barang=?");
            stat.setString(1, l.nama_barang);
            stat.setString(2, l.jenis_barang);
            stat.setInt(3, l.jumlah_barang);
            stat.setString(4, l.status_barang);
            stat.setString(5, l.tanggal_masuk_barang);
            stat.setInt(6, Integer.parseInt(textidbarang.getText()));
            stat.executeUpdate();
            refreshTabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            this.stat = k.getCon().prepareStatement("delete from listbarang where id_barang=?");
            stat.setInt(1, Integer.parseInt(textidbarang.getText()));
            stat.executeUpdate();
            refreshTabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void textidbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidbarangActionPerformed

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
            java.util.logging.Logger.getLogger(list_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(list_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(list_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(list_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new list_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combostatusbarang;
    private javax.swing.JButton delete;
    private javax.swing.JLabel idbarang;
    private javax.swing.JButton input;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenisbarang;
    private javax.swing.JLabel jumlahbarang;
    private com.toedter.calendar.JDateChooser kalendermasuk;
    private javax.swing.JLabel namabarang;
    private javax.swing.JLabel statusbarang;
    private javax.swing.JTable tablebarang;
    private javax.swing.JLabel tambahdatabarang;
    private javax.swing.JLabel tanggalmasukbarang;
    private javax.swing.JTextField textidbarang;
    private javax.swing.JTextField textjenisbarang;
    private javax.swing.JTextField textjumlahbarang;
    private javax.swing.JTextField textnamabarang;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}