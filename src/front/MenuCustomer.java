/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package front;

/**
 *
 * @author HP
 */
public class MenuCustomer extends javax.swing.JFrame {

    /**
     * Creates new form PelangganGUI
     */
    public MenuCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHalAkhir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelJenisMenu = new javax.swing.JLabel();
        jLabelJenisWarna = new javax.swing.JLabel();
        jRadioButtonMono = new javax.swing.JRadioButton();
        jRadioButtonWarna = new javax.swing.JRadioButton();
        jLabelPilihDokumen = new javax.swing.JLabel();
        jComboBoxPilihDokumen = new javax.swing.JComboBox<>();
        addToCartButton = new javax.swing.JButton();
        lihatCartButton = new javax.swing.JButton();
        jRadioButtonCetak = new javax.swing.JRadioButton();
        jRadioButtonFotocopy = new javax.swing.JRadioButton();
        jLabelHalAwal = new javax.swing.JLabel();
        jLabelJenisWarna2 = new javax.swing.JLabel();
        jSpinnerHalAwal = new javax.swing.JSpinner();
        jSpinnerJumlahCopy = new javax.swing.JSpinner();
        jLabelJumlahCopy = new javax.swing.JLabel();
        jSpinnerHalAkhir = new javax.swing.JSpinner();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHalAkhir.setBackground(new java.awt.Color(52, 73, 94));
        jPanelHalAkhir.setPreferredSize(new java.awt.Dimension(478, 391));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        jLabelJenisMenu.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelJenisMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJenisMenu.setText("Jenis");

        jLabelJenisWarna.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelJenisWarna.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJenisWarna.setText("Warna");

        jRadioButtonMono.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jRadioButtonMono.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMono.setText("Mono");
        jRadioButtonMono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMonoActionPerformed(evt);
            }
        });

        jRadioButtonWarna.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jRadioButtonWarna.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonWarna.setText("Warna");
        jRadioButtonWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonWarnaActionPerformed(evt);
            }
        });

        jLabelPilihDokumen.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelPilihDokumen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPilihDokumen.setText("Pilih Dokumen");
        jLabelPilihDokumen.setToolTipText("");

        jComboBoxPilihDokumen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPilihDokumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPilihDokumenActionPerformed(evt);
            }
        });

        addToCartButton.setText("Add To Cart");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        lihatCartButton.setText("Lihat Cart");
        lihatCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatCartButtonActionPerformed(evt);
            }
        });

        jRadioButtonCetak.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jRadioButtonCetak.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonCetak.setText("Cetak");
        jRadioButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCetakActionPerformed(evt);
            }
        });

        jRadioButtonFotocopy.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jRadioButtonFotocopy.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFotocopy.setText("Fotocopy");
        jRadioButtonFotocopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFotocopyActionPerformed(evt);
            }
        });

        jLabelHalAwal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelHalAwal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHalAwal.setText("Halaman Awal");

        jLabelJenisWarna2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelJenisWarna2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJenisWarna2.setText("Halaman Akhir");

        jLabelJumlahCopy.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabelJumlahCopy.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJumlahCopy.setText("Jumlah Copy");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHalAkhirLayout = new javax.swing.GroupLayout(jPanelHalAkhir);
        jPanelHalAkhir.setLayout(jPanelHalAkhirLayout);
        jPanelHalAkhirLayout.setHorizontalGroup(
            jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHalAkhirLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelJenisWarna, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHalAkhirLayout.createSequentialGroup()
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelHalAkhirLayout.createSequentialGroup()
                                .addComponent(jLabelHalAwal)
                                .addGap(38, 38, 38))
                            .addGroup(jPanelHalAkhirLayout.createSequentialGroup()
                                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPilihDokumen)
                                    .addComponent(jLabelJenisMenu))
                                .addGap(40, 40, 40)))
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPilihDokumen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonCetak)
                            .addComponent(jRadioButtonMono)
                            .addComponent(jLabel1)
                            .addGroup(jPanelHalAkhirLayout.createSequentialGroup()
                                .addComponent(jSpinnerHalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addToCartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonWarna)
                                    .addComponent(jRadioButtonFotocopy)
                                    .addComponent(lihatCartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHalAkhirLayout.createSequentialGroup()
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHalAkhirLayout.createSequentialGroup()
                                .addComponent(jLabelJenisWarna2)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHalAkhirLayout.createSequentialGroup()
                                .addComponent(jLabelJumlahCopy)
                                .addGap(49, 49, 49)))
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerHalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelHalAkhirLayout.createSequentialGroup()
                                .addComponent(jSpinnerJumlahCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(BackButton)))))
                .addGap(18, 18, 18))
        );
        jPanelHalAkhirLayout.setVerticalGroup(
            jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHalAkhirLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPilihDokumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPilihDokumen))
                .addGap(18, 18, 18)
                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJenisMenu)
                    .addComponent(jRadioButtonCetak)
                    .addComponent(jRadioButtonFotocopy))
                .addGap(18, 18, 18)
                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJenisWarna)
                    .addComponent(jRadioButtonMono)
                    .addComponent(jRadioButtonWarna))
                .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHalAkhirLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHalAwal)
                            .addComponent(jSpinnerHalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToCartButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJenisWarna2)
                            .addComponent(jSpinnerHalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lihatCartButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelHalAkhirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJumlahCopy)
                            .addComponent(jSpinnerJumlahCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHalAkhirLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton)
                        .addGap(16, 16, 16))))
        );

        addToCartButton.getAccessibleContext().setAccessibleName("Lihat Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHalAkhir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHalAkhir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMonoActionPerformed

    private void jRadioButtonWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonWarnaActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void lihatCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatCartButtonActionPerformed
        CartCustomer p = new CartCustomer();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_lihatCartButtonActionPerformed

    private void jRadioButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCetakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCetakActionPerformed

    private void jRadioButtonFotocopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFotocopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFotocopyActionPerformed

    private void jComboBoxPilihDokumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPilihDokumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPilihDokumenActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Customer p = new Customer();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton addToCartButton;
    private javax.swing.JComboBox<String> jComboBoxPilihDokumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelHalAwal;
    private javax.swing.JLabel jLabelJenisMenu;
    private javax.swing.JLabel jLabelJenisWarna;
    private javax.swing.JLabel jLabelJenisWarna2;
    private javax.swing.JLabel jLabelJumlahCopy;
    private javax.swing.JLabel jLabelPilihDokumen;
    private javax.swing.JPanel jPanelHalAkhir;
    private javax.swing.JRadioButton jRadioButtonCetak;
    private javax.swing.JRadioButton jRadioButtonFotocopy;
    private javax.swing.JRadioButton jRadioButtonMono;
    private javax.swing.JRadioButton jRadioButtonWarna;
    private javax.swing.JSpinner jSpinnerHalAkhir;
    private javax.swing.JSpinner jSpinnerHalAwal;
    private javax.swing.JSpinner jSpinnerJumlahCopy;
    private javax.swing.JButton lihatCartButton;
    // End of variables declaration//GEN-END:variables
}
