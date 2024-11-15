package CetakFilkom.BackEnd;

import CetakFilkom.Data;
import CetakFilkom.Error.DateOutOfBoundsException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import CetakFilkom.Pelanggan.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;

import javax.swing.JButton;

/**
 *
 * @author USER
 */
public class PelangganAdmin extends javax.swing.JFrame {

        /**
         * Creates new form PelangganAdmin
         */
        public PelangganAdmin() {
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

                pelangganPanel = new javax.swing.JPanel();
                labelPilihPelanggan = new javax.swing.JLabel();
                teksNamaPelanggan = new javax.swing.JTextField();
                labelTanggalDaftarPelanggan = new javax.swing.JLabel();
                comboBoxPilihPelanggan = new javax.swing.JComboBox<>();
                buttonTambahPelanggan = new javax.swing.JButton();
                buttonHapusPelanggan = new javax.swing.JButton();
                buttonUpdatePelanggan = new javax.swing.JButton();
                labelNomorPelanggan = new javax.swing.JLabel();
                teksIDPelanggan = new javax.swing.JTextField();
                buttonBackPelanggan = new javax.swing.JButton();
                pelangganLabel = new javax.swing.JLabel();
                labelNamaPelanggan1 = new javax.swing.JLabel();
                teksTanggalDaftarPelanggan = new javax.swing.JTextField();
                labelSaldoAwal = new javax.swing.JLabel();
                teksSaldoAwal = new javax.swing.JTextField();
                buttonLihatPelanggan = new JButton();
                teksTanggalDaftarPelanggan.setText("YYYY/MM/dd");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                pelangganPanel.setBackground(new java.awt.Color(52, 73, 94));

                labelPilihPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
                labelPilihPelanggan.setForeground(new java.awt.Color(255, 255, 255));
                labelPilihPelanggan.setText("Pilih pelanggan");

                labelTanggalDaftarPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
                labelTanggalDaftarPelanggan.setForeground(new java.awt.Color(255, 255, 255));
                labelTanggalDaftarPelanggan.setText("Tanggal daftar");

                comboBoxPilihPelanggan
                                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEMBER", "GUEST" }));
                comboBoxPilihPelanggan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                comboBoxPilihPelangganActionPerformed(evt);
                        }
                });

                buttonTambahPelanggan.setText("Tambah");
                buttonTambahPelanggan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        buttonTambahPelangganActionPerformed(evt);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });

                buttonLihatPelanggan.setText("Lihat");
                buttonLihatPelanggan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        buttonLihatActionPerformed(evt);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });

                buttonHapusPelanggan.setText("Hapus");
                buttonHapusPelanggan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        buttonHapusPelangganActionPerformed(evt);
                                } catch (IOException e) {
                                        e.printStackTrace();
                                }
                        }
                });

                buttonUpdatePelanggan.setText("Update");
                buttonUpdatePelanggan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        buttonUpdatePelangganActionPerformed(evt);
                                } catch (Exception e) {
                                }
                        }
                });

                labelNomorPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
                labelNomorPelanggan.setForeground(new java.awt.Color(255, 255, 255));
                labelNomorPelanggan.setText("ID Pelanggan");

                buttonBackPelanggan.setText("Kembali");
                buttonBackPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                buttonBackPelangganMouseClicked(evt);
                        }
                });

                pelangganLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
                pelangganLabel.setForeground(new java.awt.Color(255, 255, 255));
                pelangganLabel.setText("PELANGGAN");

                labelNamaPelanggan1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
                labelNamaPelanggan1.setForeground(new java.awt.Color(255, 255, 255));
                labelNamaPelanggan1.setText("Nama Pelanggan");

                labelSaldoAwal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
                labelSaldoAwal.setForeground(new java.awt.Color(255, 255, 255));
                labelSaldoAwal.setText("Saldo Awal");

                javax.swing.GroupLayout pelangganPanelLayout = new javax.swing.GroupLayout(pelangganPanel);
                pelangganPanel.setLayout(pelangganPanelLayout);
                pelangganPanelLayout.setHorizontalGroup(
                                pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pelangganPanelLayout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(pelangganPanelLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(labelNomorPelanggan)
                                                                                                .addComponent(labelNamaPelanggan1)
                                                                                                .addComponent(labelPilihPelanggan)
                                                                                                .addComponent(labelTanggalDaftarPelanggan)
                                                                                                .addComponent(labelSaldoAwal))
                                                                                .addGroup(pelangganPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(buttonTambahPelanggan)
                                                                                                .addGap(34, 34, 34)))
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(pelangganPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(23, 23, 23)
                                                                                                .addGroup(pelangganPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(teksNamaPelanggan,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                165,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(teksTanggalDaftarPelanggan,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                165,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(teksSaldoAwal,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                165,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(pelangganPanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(comboBoxPilihPelanggan,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(teksIDPelanggan,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                165,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(pelangganPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(15, 15, 15)
                                                                                                .addComponent(buttonHapusPelanggan)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                51,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(buttonUpdatePelanggan)))
                                                                .addGap(48, 48, 48))
                                                .addGroup(pelangganPanelLayout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(buttonBackPelanggan)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(pelangganLabel)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(buttonLihatPelanggan,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)));
                pelangganPanelLayout.setVerticalGroup(
                                pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pelangganPanelLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(buttonBackPelanggan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                23,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(buttonLihatPelanggan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                23,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(pelangganLabel))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(comboBoxPilihPelanggan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelPilihPelanggan))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(labelNomorPelanggan)
                                                                                .addComponent(teksIDPelanggan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(teksNamaPelanggan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelNamaPelanggan1))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(labelTanggalDaftarPelanggan)
                                                                                .addComponent(teksTanggalDaftarPelanggan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                10, Short.MAX_VALUE)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(teksSaldoAwal,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(labelSaldoAwal))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(pelangganPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(buttonHapusPelanggan)
                                                                                .addComponent(buttonUpdatePelanggan)
                                                                                .addComponent(buttonTambahPelanggan))
                                                                .addGap(50, 50, 50)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void buttonTambahPelangganActionPerformed(java.awt.event.ActionEvent evt)
                        throws IOException, DateOutOfBoundsException {// GEN-FIRST:event_buttonTambahPelangganActionPerformed
                String tipe = (String) comboBoxPilihPelanggan.getSelectedItem();
                String id = (String) teksIDPelanggan.getText();
                String saldo = (String) teksSaldoAwal.getText();
                String nama = (String) teksNamaPelanggan.getText();
                Pelanggan p = null;
                StringJoiner sj = new StringJoiner(",");
                sj.add(id);
                if (!nama.equals("")) {
                        sj.add(nama);
                }
                if (tipe.equals("MEMBER")) {
                        String tanggal = (String) teksTanggalDaftarPelanggan.getText();
                        sj.add(tanggal);
                        String[] dataTanggal = tanggal.split("/");
                        int hari = Integer.parseInt(dataTanggal[2]);
                        int bulan = Integer.parseInt(dataTanggal[1]);
                        int tahun = Integer.parseInt(dataTanggal[0]);
                        p = new Member(nama, hari, bulan, tahun);
                } else {
                        p = new Guest();
                }
                sj.add(saldo);
                Data.tambah(id, p, sj.toString());
                teksIDPelanggan.setText("");
                teksNamaPelanggan.setText("");
                teksSaldoAwal.setText("");
                teksTanggalDaftarPelanggan.setText("");
        }// GEN-LAST:event_buttonTambahPelangganActionPerformed

        private void comboBoxPilihPelangganActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBoxPilihPelangganActionPerformed
                String tipe = (String) comboBoxPilihPelanggan.getSelectedItem();
                if (tipe.equals("GUEST")) {
                        labelTanggalDaftarPelanggan.setEnabled(false);
                        teksTanggalDaftarPelanggan.setEnabled(false);
                        labelNamaPelanggan1.setEnabled(false);
                        teksNamaPelanggan.setEnabled(false);
                }
        }// GEN-LAST:event_comboBoxPilihPelangganActionPerformed

        private void buttonBackPelangganMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonBackPelangganMouseClicked
                // GEN-FIRST:event_buttonBackPelangganMouseClicked(
                AdminApp p = new AdminApp();
                p.setVisible(true);
                dispose();
                // GEN-LAST:event_buttonBackPelangganMouseClicked(
        }// GEN-LAST:event_buttonBackPelangganMouseClicked

        private void buttonUpdatePelangganActionPerformed(java.awt.event.ActionEvent evt)
                        throws DateOutOfBoundsException, IOException {// GEN-FIRST:event_buttonUpdatePelangganActionPerformed
                String tipe = (String) comboBoxPilihPelanggan.getSelectedItem();
                String id = (String) teksIDPelanggan.getText();
                String nama = (String) teksNamaPelanggan.getText();
                String saldo = (String) teksSaldoAwal.getText();
                StringJoiner sj = new StringJoiner(",");
                Pelanggan p = null;
                sj.add(id);
                if (!nama.equals(""))
                        sj.add(nama);
                if (tipe.equals("MEMBER")) {
                        String tanggal = (String) teksTanggalDaftarPelanggan.getText();
                        sj.add(tanggal);
                        sj.add(saldo);
                        String[] dataTanggal = tanggal.split("/");
                        int hari = Integer.parseInt(dataTanggal[2]);
                        int bulan = Integer.parseInt(dataTanggal[1]);
                        int tahun = Integer.parseInt(dataTanggal[0]);
                        p = new Member(nama, hari, bulan, tahun);
                        Data.ubah(id, "Member.txt", sj.toString(), p);
                } else {
                        p = new Guest();
                        sj.add(saldo);
                        Data.ubah(id, "Guest.txt", sj.toString(), p);
                }

        }// GEN-LAST:event_buttonUpdatePelangganActionPerformed

        private void buttonHapusPelangganActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_buttonHapusPelangganActionPerformed
                String tipe = (String) comboBoxPilihPelanggan.getSelectedItem();
                String key = (String) teksIDPelanggan.getText();
                if (tipe.equals("MEMBER")) {
                        Data.hapus(key, "Member.txt");
                        return;
                }
                Data.hapus(key, "Guest.txt");
        }// GEN-LAST:event_buttonHapusPelangganActionPerformed

        private void buttonLihatActionPerformed(java.awt.event.ActionEvent evt)
                        throws FileNotFoundException, IOException {
                LihatPelanggan l = new LihatPelanggan();
                try (BufferedReader b = new BufferedReader(new FileReader("src\\CetakFilkom\\File\\Member.txt"));
                                BufferedReader c = new BufferedReader(
                                                new FileReader("src\\CetakFilkom\\File\\Guest.txt"))) {
                        String line;
                        while ((line = b.readLine()) != null) {
                                String[] data = line.split(",");
                                LihatPelanggan.getTable().addRow(data);
                        }
                        while ((line = c.readLine()) != null) {
                                String[] data = line.split(",");
                                LihatPelanggan.getTable().addRow(data);
                        }
                }
                l.setVisible(true);
        }

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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                                new PelangganAdmin().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton buttonBackPelanggan;
        private javax.swing.JButton buttonHapusPelanggan;
        private javax.swing.JButton buttonTambahPelanggan;
        private javax.swing.JButton buttonUpdatePelanggan;
        private javax.swing.JComboBox<String> comboBoxPilihPelanggan;
        private javax.swing.JLabel labelNamaPelanggan1;
        private javax.swing.JLabel labelNomorPelanggan;
        private javax.swing.JLabel labelPilihPelanggan;
        private javax.swing.JLabel labelSaldoAwal;
        private javax.swing.JLabel labelTanggalDaftarPelanggan;
        private javax.swing.JLabel pelangganLabel;
        public static javax.swing.JPanel pelangganPanel;
        private javax.swing.JTextField teksIDPelanggan;
        private javax.swing.JTextField teksNamaPelanggan;
        private javax.swing.JTextField teksSaldoAwal;
        private javax.swing.JTextField teksTanggalDaftarPelanggan;
        private javax.swing.JButton buttonLihatPelanggan;

        // End of variables declaration//GEN-END:variables

}
