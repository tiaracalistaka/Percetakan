package CetakFilkom.BackEnd;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;

import CetakFilkom.Data;
import CetakFilkom.Error.DateOutOfBoundsException;
import CetakFilkom.Promo.*;

/**
 *
 * @author USER
 */
public class PromosiAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Promosi
     */
    public PromosiAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        promosiPanel = new javax.swing.JPanel();
        promosiLabel = new javax.swing.JLabel();
        buttonBackPromosi = new javax.swing.JButton();
        buttonHapusPromosi = new javax.swing.JButton();
        buttonUpdatePromosi = new javax.swing.JButton();
        labelJenisPromosi = new javax.swing.JLabel();
        labelKodePromo = new javax.swing.JLabel();
        labelTanggalAwal = new javax.swing.JLabel();
        LabelTanggalAkhir = new javax.swing.JLabel();
        labelPersenPotongan = new javax.swing.JLabel();
        labelMaksimumPotongan = new javax.swing.JLabel();
        labelMinimumPotongan = new javax.swing.JLabel();
        buttonTambahPromosi = new javax.swing.JButton();
        teksKodePromo = new javax.swing.JTextField();
        teksTanggalAwal = new javax.swing.JTextField();
        teksTanggalAkhir = new javax.swing.JTextField();
        teksPersenPotongan = new javax.swing.JTextField();
        teksMaksimumPotongan = new javax.swing.JTextField();
        teksMinimumPembelian = new javax.swing.JTextField();
        comboBoxJenisPromosi = new javax.swing.JComboBox<>();
        buttonLihatPromosi = new javax.swing.JButton();
        teksTanggalAkhir.setText("yyyy/MM/dd");
        teksTanggalAwal.setText("yyyy/MM/dd");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        promosiPanel.setBackground(new java.awt.Color(52, 73, 94));

        promosiLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        promosiLabel.setForeground(new java.awt.Color(255, 255, 255));
        promosiLabel.setText("PROMOSI");

        buttonBackPromosi.setText("Kembali");
        buttonBackPromosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackPromosiActionPerformed(evt);
            }
        });

        buttonHapusPromosi.setText("Hapus");
        buttonHapusPromosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonHapusPromosiActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        buttonUpdatePromosi.setText("Ganti");
        buttonUpdatePromosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonUpdatePromosiActionPerformed(evt);
                } catch (DateOutOfBoundsException | IOException e) {
                    e.printStackTrace();
                }
            }
        });

        labelJenisPromosi.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelJenisPromosi.setForeground(new java.awt.Color(255, 255, 255));
        labelJenisPromosi.setText("Jenis promosi");

        labelKodePromo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelKodePromo.setForeground(new java.awt.Color(255, 255, 255));
        labelKodePromo.setText("Kode promo");

        labelTanggalAwal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelTanggalAwal.setForeground(new java.awt.Color(255, 255, 255));
        labelTanggalAwal.setText("Tanggal awal");

        LabelTanggalAkhir.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        LabelTanggalAkhir.setForeground(new java.awt.Color(255, 255, 255));
        LabelTanggalAkhir.setText("Tanggal akhir");

        labelPersenPotongan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelPersenPotongan.setForeground(new java.awt.Color(255, 255, 255));
        labelPersenPotongan.setText("Persen potongan");

        labelMaksimumPotongan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelMaksimumPotongan.setForeground(new java.awt.Color(255, 255, 255));
        labelMaksimumPotongan.setText("Maksimum potongan");

        labelMinimumPotongan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelMinimumPotongan.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimumPotongan.setText("Minimun pembelian");

        buttonTambahPromosi.setText("Tambah");
        buttonTambahPromosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonTambahPromosiActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        buttonLihatPromosi.setText("Lihat");
        buttonLihatPromosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonLihatPromosiActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        comboBoxJenisPromosi
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISCOUNT", "CASHBACK", "DELIVERY" }));

        javax.swing.GroupLayout promosiPanelLayout = new javax.swing.GroupLayout(promosiPanel);
        promosiPanel.setLayout(promosiPanelLayout);
        promosiPanelLayout.setHorizontalGroup(
                promosiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(promosiPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelMinimumPotongan)
                                        .addComponent(LabelTanggalAkhir)
                                        .addComponent(labelMaksimumPotongan)
                                        .addComponent(labelPersenPotongan)
                                        .addComponent(labelTanggalAwal)
                                        .addComponent(labelKodePromo)
                                        .addComponent(labelJenisPromosi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(teksMinimumPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksMaksimumPotongan, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksPersenPotongan, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksTanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksKodePromo, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxJenisPromosi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promosiPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(buttonTambahPromosi)
                                .addGap(52, 52, 52)
                                .addComponent(buttonHapusPromosi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60,
                                        Short.MAX_VALUE)
                                .addComponent(buttonUpdatePromosi)
                                .addGap(35, 35, 35))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promosiPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(buttonBackPromosi)
                                .addGap(42, 42, 42)
                                .addComponent(promosiLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLihatPromosi)
                                .addGap(17, 17, 17)));
        promosiPanelLayout.setVerticalGroup(
                promosiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(promosiPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(promosiPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(promosiPanelLayout.createSequentialGroup()
                                                        .addComponent(promosiLabel)
                                                        .addGap(5, 5, 5))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promosiPanelLayout
                                                        .createSequentialGroup()
                                                        .addComponent(buttonBackPromosi)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                promosiPanelLayout.createSequentialGroup()
                                                        .addComponent(buttonLihatPromosi)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelJenisPromosi)
                                        .addComponent(comboBoxJenisPromosi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelKodePromo, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksKodePromo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTanggalAwal)
                                        .addComponent(teksTanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LabelTanggalAkhir)
                                        .addComponent(teksTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPersenPotongan)
                                        .addComponent(teksPersenPotongan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelMaksimumPotongan)
                                        .addComponent(teksMaksimumPotongan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelMinimumPotongan)
                                        .addComponent(teksMinimumPembelian, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(promosiPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonTambahPromosi)
                                        .addComponent(buttonHapusPromosi)
                                        .addComponent(buttonUpdatePromosi))
                                .addContainerGap(18, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(promosiPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(promosiPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void buttonLihatPromosiActionPerformed(ActionEvent evt) throws IOException {
        LihatPromo l = new LihatPromo();
        try (BufferedReader b = new BufferedReader(new FileReader("src\\CetakFilkom\\File\\Promosi.txt"))) {
            String line;
            while ((line = b.readLine()) != null) {
                String[] st = line.split(" ", 2);
                String[] data = st[1].split(",");
                LihatPromo.getTable().addRow(data);
            }
        }
        l.setVisible(true);

    }

    protected void buttonHapusPromosiActionPerformed(ActionEvent evt) throws IOException {
        String id = (String) teksKodePromo.getText();
        Data.hapus(id, "Promosi.txt");
        teksKodePromo.setText("");
        teksMaksimumPotongan.setText("");
        teksMinimumPembelian.setText("");
        teksPersenPotongan.setText("");
        teksTanggalAkhir.setText("yyyy/MM/dd");
        teksTanggalAwal.setText("yyyy/MM/dd");
    }

    private void buttonBackPromosiActionPerformed(java.awt.event.ActionEvent evt) {
        AdminApp a = new AdminApp();
        a.setVisible(true);
        dispose();
    }// GEN-LAST:event_buttonBackPromosiActionPerformed

    private void buttonUpdatePromosiActionPerformed(java.awt.event.ActionEvent evt)
            throws DateOutOfBoundsException, IOException {// GEN-FIRST:event_buttonUpdatePromosiActionPerformed
        StringJoiner sj = new StringJoiner(",");
        String id = (String) teksKodePromo.getText();
        int persen = Integer.parseInt(teksPersenPotongan.getText());
        double maksPotongan = Double.parseDouble(teksMaksimumPotongan.getText());
        double minHarga = Double.parseDouble(teksMinimumPembelian.getText());
        String[] dataTanggalAwal = ((String) teksTanggalAwal.getText()).split("/");
        int tanggalAwal = Integer.parseInt(dataTanggalAwal[2]);
        int bulanAwal = Integer.parseInt(dataTanggalAwal[1]);
        int tahunAwal = Integer.parseInt(dataTanggalAwal[0]);
        String[] dataTanggalAkhir = ((String) teksTanggalAkhir.getText()).split("/");
        int tanggalAkhir = Integer.parseInt(dataTanggalAkhir[2]);
        int bulanAkhir = Integer.parseInt(dataTanggalAkhir[1]);
        int tahunAkhir = Integer.parseInt(dataTanggalAkhir[0]);

        sj.add(id);
        sj.add((String) teksTanggalAwal.getText());
        sj.add((String) teksTanggalAkhir.getText());
        sj.add(persen + "%");
        sj.add((String) teksMaksimumPotongan.getText());
        sj.add((String) teksMinimumPembelian.getText());
        Promosi p = null;
        String tipe = (String) comboBoxJenisPromosi.getSelectedItem();
        if (tipe.equals("DISCOUNT")) {
            p = new PercentOffPromo(persen, minHarga, 0);
        } else if (tipe.equals("CASHBACK")) {
            p = new CashbackPromo(persen, minHarga, 0);
        } else {
            p = new OngkirPromo(persen, minHarga, 0);
        }
        p.setMaksPotongan(maksPotongan);
        p.setTanggalAwal(tanggalAwal, bulanAwal, tahunAwal);
        p.setTanggalAkhir(tanggalAkhir, bulanAkhir, tahunAkhir);
        Data.ubah(id, "Promosi.txt", (tipe + " " + sj.toString()), p);
        teksKodePromo.setText("");
        teksMaksimumPotongan.setText("");
        teksMinimumPembelian.setText("");
        teksPersenPotongan.setText("");
        teksTanggalAkhir.setText("yyyy/MM/dd");
        teksTanggalAwal.setText("yyyy/MM/dd");
    }// GEN-LAST:event_buttonUpdatePromosiActionPerformed

    private void buttonTambahPromosiActionPerformed(java.awt.event.ActionEvent evt)
            throws DateOutOfBoundsException, IOException {
        StringJoiner sj = new StringJoiner(",");
        String id = (String) teksKodePromo.getText();
        int persen = Integer.parseInt(teksPersenPotongan.getText());
        double maksPotongan = Double.parseDouble(teksMaksimumPotongan.getText());
        double minHarga = Double.parseDouble(teksMinimumPembelian.getText());
        String[] dataTanggalAwal = ((String) teksTanggalAwal.getText()).split("/");
        int tanggalAwal = Integer.parseInt(dataTanggalAwal[2]);
        int bulanAwal = Integer.parseInt(dataTanggalAwal[1]);
        int tahunAwal = Integer.parseInt(dataTanggalAwal[0]);
        String[] dataTanggalAkhir = ((String) teksTanggalAkhir.getText()).split("/");
        int tanggalAkhir = Integer.parseInt(dataTanggalAkhir[2]);
        int bulanAkhir = Integer.parseInt(dataTanggalAkhir[1]);
        int tahunAkhir = Integer.parseInt(dataTanggalAkhir[0]);

        sj.add(id);
        sj.add((String) teksTanggalAwal.getText());
        sj.add((String) teksTanggalAkhir.getText());
        sj.add(persen + "%");
        sj.add((String) teksMaksimumPotongan.getText());
        sj.add((String) teksMinimumPembelian.getText());
        Promosi p = null;
        String tipe = (String) comboBoxJenisPromosi.getSelectedItem();
        if (tipe.equals("DISCOUNT")) {
            p = new PercentOffPromo(persen, minHarga, 0);
        } else if (tipe.equals("CASHBACK")) {
            p = new CashbackPromo(persen, minHarga, 0);
        } else {
            p = new OngkirPromo(persen, minHarga, 0);
        }
        p.setMaksPotongan(maksPotongan);
        p.setTanggalAwal(tanggalAwal, bulanAwal, tahunAwal);
        p.setTanggalAkhir(tanggalAkhir, bulanAkhir, tahunAkhir);
        Data.tambah(id, p, (tipe + " " + sj.toString()));
        teksKodePromo.setText("");
        teksMaksimumPotongan.setText("");
        teksMinimumPembelian.setText("");
        teksPersenPotongan.setText("");
        teksTanggalAkhir.setText("yyyy/MM/dd");
        teksTanggalAwal.setText("yyyy/MM/dd");
    }// GEN-LAST:event_buttonTambahPromosiActionPerformed

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
            java.util.logging.Logger.getLogger(PromosiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromosiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromosiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromosiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromosiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTanggalAkhir;
    private javax.swing.JButton buttonBackPromosi;
    private javax.swing.JButton buttonLihatPromosi;
    private javax.swing.JButton buttonHapusPromosi;
    private javax.swing.JButton buttonTambahPromosi;
    private javax.swing.JButton buttonUpdatePromosi;
    private javax.swing.JComboBox<String> comboBoxJenisPromosi;
    private javax.swing.JLabel labelJenisPromosi;
    private javax.swing.JLabel labelKodePromo;
    private javax.swing.JLabel labelMaksimumPotongan;
    private javax.swing.JLabel labelMinimumPotongan;
    private javax.swing.JLabel labelPersenPotongan;
    private javax.swing.JLabel labelTanggalAwal;
    private javax.swing.JLabel promosiLabel;
    public static javax.swing.JPanel promosiPanel;
    private javax.swing.JTextField teksKodePromo;
    private javax.swing.JTextField teksMaksimumPotongan;
    private javax.swing.JTextField teksMinimumPembelian;
    private javax.swing.JTextField teksPersenPotongan;
    private javax.swing.JTextField teksTanggalAkhir;
    private javax.swing.JTextField teksTanggalAwal;
    // End of variables declaration//GEN-END:variables
}
