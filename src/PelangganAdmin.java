/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

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
        //admin = new Admin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pelangganPanel.setBackground(new java.awt.Color(52, 73, 94));

        labelPilihPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelPilihPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        labelPilihPelanggan.setText("Pilih Pelanggan");

        teksNamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksNamaPelangganActionPerformed(evt);
            }
        });

        labelTanggalDaftarPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelTanggalDaftarPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        labelTanggalDaftarPelanggan.setText("Tanggal daftar");

        comboBoxPilihPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEMBER", "GUEST" }));
        comboBoxPilihPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPilihPelangganActionPerformed(evt);
            }
        });

        buttonTambahPelanggan.setText("Tambah");
        buttonTambahPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahPelangganActionPerformed(evt);
            }
        });

        buttonHapusPelanggan.setText("Hapus");
        buttonHapusPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusPelangganActionPerformed(evt);
            }
        });

        buttonUpdatePelanggan.setText("Update");
        buttonUpdatePelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdatePelangganActionPerformed(evt);
            }
        });

        labelNomorPelanggan.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelNomorPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        labelNomorPelanggan.setText("ID Pelanggan");

        teksIDPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksIDPelangganActionPerformed(evt);
            }
        });

        buttonBackPelanggan.setText("back");
        buttonBackPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBackPelangganMouseClicked(evt);
            }
        });

        pelangganLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        pelangganLabel.setForeground(new java.awt.Color(255, 255, 255));
        pelangganLabel.setText("Pelanggan");

        labelNamaPelanggan1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelNamaPelanggan1.setForeground(new java.awt.Color(255, 255, 255));
        labelNamaPelanggan1.setText("Nama Pelanggan");

        teksTanggalDaftarPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksTanggalDaftarPelangganActionPerformed(evt);
            }
        });

        labelSaldoAwal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        labelSaldoAwal.setForeground(new java.awt.Color(255, 255, 255));
        labelSaldoAwal.setText("Saldo Awal");

        teksSaldoAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksSaldoAwalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pelangganPanelLayout = new javax.swing.GroupLayout(pelangganPanel);
        pelangganPanel.setLayout(pelangganPanelLayout);
        pelangganPanelLayout.setHorizontalGroup(
            pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pelangganPanelLayout.createSequentialGroup()
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pelangganPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNomorPelanggan)
                                .addComponent(labelNamaPelanggan1)
                                .addComponent(labelPilihPelanggan)
                                .addComponent(labelTanggalDaftarPelanggan)
                                .addComponent(labelSaldoAwal))
                            .addGroup(pelangganPanelLayout.createSequentialGroup()
                                .addComponent(buttonTambahPelanggan)
                                .addGap(34, 34, 34)))
                        .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pelangganPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(teksNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teksTanggalDaftarPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teksSaldoAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxPilihPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teksIDPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pelangganPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(buttonHapusPelanggan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(buttonUpdatePelanggan))))
                    .addGroup(pelangganPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonBackPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(pelangganLabel)))
                .addGap(48, 48, 48))
        );
        pelangganPanelLayout.setVerticalGroup(
            pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pelangganPanelLayout.createSequentialGroup()
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pelangganPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(buttonBackPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pelangganPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pelangganLabel)))
                .addGap(40, 40, 40)
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPilihPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPilihPelanggan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomorPelanggan)
                    .addComponent(teksIDPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teksNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaPelanggan1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggalDaftarPelanggan)
                    .addComponent(teksTanggalDaftarPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teksSaldoAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSaldoAwal))
                .addGap(29, 29, 29)
                .addGroup(pelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapusPelanggan)
                    .addComponent(buttonUpdatePelanggan)
                    .addComponent(buttonTambahPelanggan))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teksNamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksNamaPelangganActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_teksNamaPelangganActionPerformed

    private void buttonTambahPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTambahPelangganActionPerformed

    private void comboBoxPilihPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPilihPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPilihPelangganActionPerformed

    private void teksIDPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksIDPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksIDPelangganActionPerformed

    private void buttonBackPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBackPelangganMouseClicked
        // GEN-FIRST:event_buttonBackPelangganMouseClicked(
        Admin p = new Admin();
        p.setVisible(true);
        dispose();
    // GEN-LAST:event_buttonBackPelangganMouseClicked(
    }//GEN-LAST:event_buttonBackPelangganMouseClicked

    private void teksTanggalDaftarPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksTanggalDaftarPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksTanggalDaftarPelangganActionPerformed

    private void teksSaldoAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksSaldoAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksSaldoAwalActionPerformed

    private void buttonUpdatePelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdatePelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdatePelangganActionPerformed

    private void buttonHapusPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHapusPelangganActionPerformed

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
            java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    // End of variables declaration//GEN-END:variables

}
