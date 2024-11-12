/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CetakFilkom.FrontEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.StringJoiner;

import javax.swing.table.DefaultTableModel;

import CetakFilkom.Data;
import CetakFilkom.Lembaran.Lembaran;

/**
 *
 * @author HP
 */
public class Nota extends javax.swing.JFrame {

    /**
     * Creates new form Nota
     * 
     * @throws IOException
     */
    public Nota() throws IOException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        for (Map.Entry<String, Lembaran> entry : App.order.getCart().entrySet()) {
            String id = entry.getKey();
            String[] data = new String[4];
            data[0] = id;
            data[1] = App.order.getCart().get(id).getMenu();
            data[2] = String.valueOf(App.order.getCartQty().get(id));
            data[3] = String.valueOf(App.order.getCart().get(id).getHarga());
            model.addRow(data);
        }

        jTextFieldBiaya.setText(String.format("%.0f", App.order.getBiayaPlusOngkir()));
        jTextFieldIDPelanggan.setText(App.idPelanggan);
        jTextFieldTanggalPembelian.setText(App.order.tanggaltoString());
        jTextFieldDiskon.setText(String.format("%.0f", App.order.getBiayaDiskon()));
        jTextTotal.setText(String.format("%.0f", App.order.getBiayaTotal()));
        StringJoiner sj = new StringJoiner(",");
        sj.add(App.idPelanggan);
        sj.add(App.order.tanggaltoString());
        sj.add(App.order.getPromoCode());
        sj.add(String.valueOf(App.order.getJumlahQty()));
        sj.add(String.valueOf((int) App.order.getBiayaTotal()));
        Data.tambahHistori(sj.toString());
        App.order = null;
        Data.getMapOrder().remove(App.idPelanggan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonBackNota = new javax.swing.JButton();
        jLabelTanggalPembelian = new javax.swing.JLabel();
        jTextFieldTanggalPembelian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        model = new DefaultTableModel();
        jTableNota = new javax.swing.JTable(model);
        jLabelIDPelanggan = new javax.swing.JLabel();
        jTextFieldIDPelanggan = new javax.swing.JTextField();
        jLabelOngkir = new javax.swing.JLabel();
        jTextFieldBiaya = new javax.swing.JTextField();
        jTextFieldDiskon = new javax.swing.JTextField();
        jLabelBiaya = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jTextFieldBiaya.setEditable(false);
        jTextFieldIDPelanggan.setEditable(false);
        jTextFieldDiskon.setEditable(false);
        jTextFieldTanggalPembelian.setEditable(false);
        jTextTotal.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jButtonBackNota.setText("Kembali");
        jButtonBackNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonBackNotaActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabelTanggalPembelian.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelTanggalPembelian.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTanggalPembelian.setText("Tanggal Pembelian");

        model.addColumn("ID");
        model.addColumn("Menu");
        model.addColumn("Kuantitas");
        model.addColumn("Harga");

        jScrollPane1.setViewportView(jTableNota);

        jLabelIDPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelIDPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIDPelanggan.setText("ID Pelanggan");

        jLabelOngkir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelOngkir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOngkir.setText("Diskon");

        jLabelBiaya.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelBiaya.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBiaya.setText("Biaya + Ongkir");

        jLabelTotal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonBackNota)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 420,
                                                                Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelIDPelanggan)
                                                                        .addComponent(jLabelTanggalPembelian))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jTextFieldIDPelanggan,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                224, Short.MAX_VALUE)
                                                                        .addComponent(jTextFieldTanggalPembelian)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelOngkir)
                                                                        .addComponent(jLabelBiaya)
                                                                        .addComponent(jLabelTotal))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jTextFieldBiaya)
                                                                        .addComponent(jTextFieldDiskon)
                                                                        .addComponent(jTextTotal,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                224, Short.MAX_VALUE))))
                                                .addGap(56, 56, 56)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTanggalPembelian,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelTanggalPembelian))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelIDPelanggan)
                                        .addComponent(jTextFieldIDPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldBiaya, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelBiaya))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelOngkir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBackNota)
                                .addGap(18, 18, 18)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackNotaActionPerformed(java.awt.event.ActionEvent evt)
            throws FileNotFoundException, IOException {// GEN-FIRST:event_jButtonBackNotaActionPerformed
        App p = new App();
        p.setVisible(true);
        dispose();
    }// GEN-LAST:event_jButtonBackNotaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Nota().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackNota;
    private javax.swing.JLabel jLabelBiaya;
    private javax.swing.JLabel jLabelIDPelanggan;
    private javax.swing.JLabel jLabelOngkir;
    private javax.swing.JLabel jLabelTanggalPembelian;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNota;
    private javax.swing.JTextField jTextFieldBiaya;
    private javax.swing.JTextField jTextFieldIDPelanggan;
    private javax.swing.JTextField jTextFieldDiskon;
    private javax.swing.JTextField jTextFieldTanggalPembelian;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.table.DefaultTableModel model;
    // End of variables declaration//GEN-END:variables
}